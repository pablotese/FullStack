package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public void crearAlumnos(){
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        Boolean salir = false;
        String resp = "" ;

        do{
            Alumno a = new Alumno();
            ArrayList<Integer> nots = new ArrayList<>();
            System.out.println("Ingrese Nombre del Alumno: ");
            a.setNombre(userInput.next());
            System.out.println("Ingrese nota 1 del alumno " + a.getNombre());
            nots.add(userInput.nextInt());
            System.out.println("Ingrese nota 2 del alumno " + a.getNombre());
            nots.add(userInput.nextInt());
            System.out.println("Ingrese nota 3 del alumno " + a.getNombre());
            nots.add(userInput.nextInt());
            a.setNotas(nots);
            alumnos.add(a);

            System.out.println("¿Desea salir? (S/N)");
            resp = userInput.next();
            if(resp.equalsIgnoreCase("S")){
                salir = true;
                mostrarAlumnos();
            }
        }while(!salir);
    }

    private void mostrarAlumnos() {
        Iterator<Alumno> itAlum = alumnos.iterator();
        while(itAlum.hasNext()){
            Alumno a = itAlum.next();
            Iterator<Integer> notitas = a.getNotas().iterator();
            while (notitas.hasNext()){
                System.out.println(notitas.next());
            }
        }
    }
    public float notaFinal(){
        float result = 0;
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese alumno que quiere ver promedio:");
        String nom = userInput.next();
        Iterator<Alumno> itAl = alumnos.iterator();
        while (itAl.hasNext()) {
            Alumno al = itAl.next();
            if (al.getNombre().equalsIgnoreCase(nom)) {
                ArrayList<Integer> notitas = al.getNotas();
                for(Integer n : notitas){
                    result += n;
                }
                result = result / 3;
            }
        }
        return result;
    }
}
