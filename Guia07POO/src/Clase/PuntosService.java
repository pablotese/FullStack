package Clase;

import java.util.Scanner;

public class PuntosService {

    public Puntos  crearPuntos(){
        Puntos puntillos = new Puntos();
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese coord x del primer punto: ");
        puntillos.setX1(userInput.nextInt());
        System.out.println("ingrese coord y del primer punto: ");
        puntillos.setY1(userInput.nextInt());
        System.out.println("ingrese coord x del segundo punto: ");
        puntillos.setX2(userInput.nextInt());
        System.out.println("ingrese coord y del segundo punto: ");
        puntillos.setY2(userInput.nextInt());

        return puntillos;
    }
    public double calcularDistancia(Puntos p){
        return Math.sqrt(Math.pow(p.getX2()-p.getX1(),2)+Math.pow(p.getY2()-p.getY1(),2));
    }
}
