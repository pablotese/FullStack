package Clase;

import java.util.Scanner;

public class NIFService {

    public NIF crearNIF(){
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        long dni=0;
        System.out.println("Ingrese DNI: ");
        dni = userInput.nextInt();
        NIF nifi = new NIF(dni);

        return nifi;
    }
    public void mostrar(NIF n){
        System.out.println(n.getDNI() + "-" + n.getLetra().toUpperCase());
    }
}
