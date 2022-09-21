package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra04 {
    /* Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;
        Boolean ok = false;
        while (!ok){
            System.out.println("ingrese un numero de 1 a 10");
            num = leer.nextInt();
            if(num>0 && (int) num<11){
                ok = true;
            }
        }
        switch (num){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }
}
