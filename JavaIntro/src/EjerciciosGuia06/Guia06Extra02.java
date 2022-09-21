package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Extra02 {
    /* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A, B, C, D;
        A = 10;
        B = 20;
        C = 30;
        D = 40;
        System.out.println("A:" + A + " B:" + B + " C:" + C + " D:" + D);
        int aux = 0;
        aux = D;
        D = B;
        B = C;
        C = A;
        A = aux;
        System.out.println("A:" + A + " B:" + B + " C:" + C + " D:" + D);
    }
}
