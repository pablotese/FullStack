package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra08 {
    /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break. */

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
