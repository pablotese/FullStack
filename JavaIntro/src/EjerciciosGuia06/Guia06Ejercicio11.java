package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio11 {
    /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
 MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1=0, numero2=0, opc=0;
        Boolean salir = false;
        double div = 0.0;
        String siono = "";
        System.out.println("Ingrese el primer numero: ");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = leer.nextInt();
        while(!salir){
            System.out.println(" MENU\n" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Salir");
            opc = leer.nextInt();
            switch (opc){
            case 1:
                System.out.println("La suma es: " + (numero1+numero2));
                break;
            case 2:
                System.out.println("La resta es: " + (numero1-numero2));
                break;
            case 3:
                System.out.println("La Multiplicacion es: " + (numero1*numero2));
                break;
            case 4:
                div = (double)numero1 /numero2;
                System.out.println("La Division es: " + div);
                break;
            case 5:
                System.out.println("Está seguro de salir (S/N)?");
                siono = leer.next();
                if (siono.equalsIgnoreCase("S")){
                    salir = true;
                }
            }
        }

    }
}
