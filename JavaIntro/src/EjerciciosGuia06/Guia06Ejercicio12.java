package EjerciciosGuia06;

import java.util.Scanner;

public class Guia06Ejercicio12 {
    /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        int cantOK =0 , cantError=0;
        Boolean salir = false;
        while (!salir){
            System.out.println("Ingrese una cadena: ");
            cadena = leer.nextLine();
            if (cadena.equalsIgnoreCase("&&&&&")){
                salir = true;
            }else{
                if (cadena.length() <=5 && cadena.charAt(0)=='X' && cadena.charAt(cadena.length()-1)=='O'){
                    cantOK++;
                }else{
                    cantError++;
                }
            }
        }
        System.out.println("Cant OK: " +  cantOK);
        System.out.println("Cant Error: " +  cantError);
    }
}
