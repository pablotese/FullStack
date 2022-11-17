package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {

    private ArrayList<String> perros = new ArrayList<String>();

    public void crearPerros(){
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        Boolean salir = false;
        String resp = "" , p = "";
        do{
            System.out.println("Ingrese raza de perro");
            p = userInput.next();
            perros.add(p);

            System.out.println("¿Desea salir? (S/N)");
            resp = userInput.next();
            if(resp.equalsIgnoreCase("S")){
                salir = true;
                mostrarPerros();
                eliminarPerro();
            }
        }while(!salir);
    }

    private void eliminarPerro() {
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese raza de perro a eliminar:");
        String raza = userInput.next();
        Collections.sort(perros); // Ordeno la Collection
        Iterator<String> itPerros= perros.iterator(); // genero el iterator
        boolean encontro = false;

        while (itPerros.hasNext()){ // Recorro la collection
            if(itPerros.next().equalsIgnoreCase(raza)){
                itPerros.remove();
                encontro = true;
            }
        }

        if(encontro){
            System.out.println("Se eliminó la raza y quedaron las siguientes:");
        } else{
            System.out.println("No se encontraba esa raza. Quedaron: ");

        }
        itPerros= perros.iterator();
        while (itPerros.hasNext()){
            System.out.println(itPerros.next().substring(0));
        }
    }

    private void mostrarPerros(){
        System.out.println("Las razas cargadas son:");
        for(String p : perros){
            System.out.println(p);
        }
    }
}

