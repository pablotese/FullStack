package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra07 {
    /* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N = 0, min=0, max=0, cant=0, num=0;
        float promedio=0;
        Boolean primVez = true;

        System.out.println("ingrese la cantidad de numeros:");
        N = leer.nextInt();

        conWhile(N);
        conDoWhile(N);

    }

    private static void conDoWhile(int N) {
        Scanner leer = new Scanner(System.in);
        int min=0, max=0, cant=0, num=0, sum=0;
        cant = 0;
        Boolean primVez = true;
        do {
            cant++;
            System.out.println("ingrese un numero:");
            num = leer.nextInt();
            sum = sum + num;
            if(primVez== true ){
                min= num;
                max = num;
                primVez = false;
            }
            if(num < min){
                min = num;
            }
            if(max < num){
                max = num;
            }
        } while(cant<(N));
        System.out.println("Minimo: " + min + "Maximo: " + max);
        System.out.println("Promedio: " + sum/N);
    }

    private static void conWhile(int N) {
        Scanner leer = new Scanner(System.in);
        int min=0, max=0, cant=0, num=0, sum=0;
        cant = 0;
        Boolean primVez = true;

        while(cant<N){
            cant++;
            System.out.println("ingrese un numero:");
            num = leer.nextInt();
            sum = sum + num;
            if(primVez== true ){
                min= num;
                max = num;
                primVez = false;
            }
            if(num < min){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }
        System.out.println("Minimo: " + min + "Maximo: " + max);
        System.out.println("Promedio: " + sum/N);
    }
}
