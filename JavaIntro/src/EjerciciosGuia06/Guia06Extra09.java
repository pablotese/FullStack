package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra09 {
    /* Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1=0, num2=0, cociente=0, residuo=0, aux=0;

        System.out.println("Ingrese un numero:");
        num1 = leer.nextInt();

        System.out.println("Ingrese otro numero:");
        num2 = leer.nextInt();
        aux = num1;
        while((aux - num2) > 0){
            aux = aux - num2 ;
            cociente++;
        }
        System.out.println("Dividendo:" + num1 + " Divisor:" + num2 + " Cociente:" + cociente + " Resto:" + aux);
    }

}
