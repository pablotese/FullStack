package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra06 {
    /* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = 0, cant160=0;
        float alt = 0, suma160=0, sumaGeneral=0;
        double promedio160 = 0, promedioGeneral=0;

        System.out.println("ingrese la cantidad de personas:");
        N = leer.nextInt();

        for(int i=1; i<=N ; i++){
            System.out.println("ingrese altura de la persona " + i + " :");
            alt = leer.nextFloat();
            if (alt < 1.60){
                suma160 = suma160 + alt;
                cant160++;
            }
            sumaGeneral = sumaGeneral + alt;
        }
        if (cant160>0){
            promedio160 = suma160 / cant160;
        }
        promedioGeneral = sumaGeneral / N;
        System.out.println("Promedio < 1.60: " + promedio160);
        System.out.println("Promedio General: " + promedioGeneral);
    }
}
