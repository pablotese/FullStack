package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra05 {
    /* Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char clase = ' ';
        float valor = 0;
        double importe = 0;
        Boolean ok = false;
        while (!ok){
            System.out.println("ingrese la clase del socio");
            clase = leer.next().toUpperCase().charAt(0);
            if(clase=='A' || clase=='B' || clase=='C'){
                ok = true;
            }
        }
        System.out.println("ingrese el costo del tratamiento:");
        valor = leer.nextFloat();
        switch (clase){
            case 'A':
                importe = valor * (0.5);
                break;
            case 'B':
                importe = valor * (0.65);
                break;
            case 'C':
                importe = valor;
        }
        System.out.println("Importe a pagar: " + importe);
    }
}
