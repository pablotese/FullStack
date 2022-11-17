package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService {
    ArrayList<Persona> personas = new ArrayList<>();
    Scanner userInput = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(int cant){

        for(int i = 0; i < cant ; i++){
            System.out.printf("Ingrese Nombre de la persona: ");
            String nom = userInput.next();
            System.out.printf("Ingrese Apellido de la persona: ");
            String ape = userInput.next();
            System.out.printf("Ingrese Edad de la persona: ");
            int eda = userInput.nextInt();
            System.out.printf("Ingrese Documento de la persona: ");
            int doc = userInput.nextInt();
            Perro p = crearPerro();
            Persona per = new Persona(nom, ape, eda, doc, p);
            personas.add(per);
        }
    }
    private Perro crearPerro(){
        Perro p = new Perro();
        System.out.printf("Ingrese Nombre del perro: ");
        String nom = userInput.next();
        System.out.printf("Ingrese Raza del perro: ");
        String raz = userInput.next();
        System.out.printf("Ingrese Edad del perro: ");
        int eda = userInput.nextInt();
        System.out.printf("Ingrese Tamaño del perro (pequeño/mediano/grande): ");
        String tam = userInput.next();
        for(tamanioPerro t : tamanioPerro.values()){
            if(tam.equalsIgnoreCase(t.toString())){
                p.setTamanio(t);
            }
        }
        p.setEdad(eda);
        p.setRaza(raz);
        p.setNombre(nom);
        return p;
    }


    public void mostrarPersonas() {
        int cant = personas.size();
        for(Persona p : personas){
            System.out.println("Nombre: " + p.getNombre() + " Apellido: " + p.getApellido() + " Edad: " + p.getEdad() + " Documento: " + p.getDocumento());
            System.out.println("clases.Perro: " + p.getMascota().getNombre() + " Raza: " + p.getMascota().getRaza() + " Edad: " + p.getMascota().getEdad() + " Tamaño: " + p.getMascota().getTamanio());
        }
    }
}
