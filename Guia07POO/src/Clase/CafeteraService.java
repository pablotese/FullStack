package Clase;

import java.util.Scanner;

public class CafeteraService {

    public void llenarCafetera(Cafetera caf){
        caf.setCapacidadActual(caf.getCapacidadMaxima());
    }

    public Boolean servirTaza(int taza, Cafetera caf){
        Boolean seLlenoTaza = false;
        if(caf.getCapacidadActual() - taza >= 0){
            caf.setCapacidadActual(caf.getCapacidadActual()-taza);
            seLlenoTaza = true;
        } else{
            System.out.println("Se lleno solamente: " + (taza - (taza-caf.getCapacidadActual())));
            caf.setCapacidadActual(0);
            seLlenoTaza = false;
        }
        return seLlenoTaza;
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(0);
    }
    public void agregarCafe(Cafetera cafetera){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cant de cafe: ");
        cafetera.setCapacidadActual(cafetera.getCapacidadActual() + leer.nextInt());
    }

    public Cafetera crearCafetera(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cafetera caf =  new Cafetera();
        System.out.println("ingrese la capacidad de la cafetera");
        caf.setCapacidadMaxima(leer.nextFloat());
        System.out.println("ingrese la capacidad actual");
        caf.setCapacidadActual(leer.nextFloat());

        return caf;
    }
}
