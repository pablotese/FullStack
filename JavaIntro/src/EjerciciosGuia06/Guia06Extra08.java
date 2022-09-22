package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra08 {
    /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=-1, cant=0, pares=0, impares=0;

        while(num % 5 != 0){
            System.out.println("ingrese un numero:");
            num = leer.nextInt();
            if(num>0){
                cant++;
                if(num%2 == 0){
                    pares ++;
                }else {
                    impares++;
                }
            }
        }
        System.out.println("Cantidad de nros:" + cant + " Impares:" + impares + " Pares:" + pares);
    }

}
