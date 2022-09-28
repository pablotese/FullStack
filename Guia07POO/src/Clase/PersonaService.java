package Clase;
import Clase.Persona;
import Clase.Sexo;

import java.util.Scanner;

public class PersonaService {
    public Persona crearPersona(){
        Persona pers = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese Nombre:");
        pers.setNombre(leer.next());
        System.out.println("ingrese Edad:");
        pers.setEdad(leer.nextInt());
        System.out.println("ingrese Sexo:");
        pers.setSexo(Sexo.valueOf(leer.next()));
        System.out.println("ingrese Peso:");
        pers.setPeso(leer.nextFloat());
        System.out.println("ingrese Altura:");
        pers.setAltura(leer.nextFloat());

        return pers;
    }
    public int calcularIMC(Persona pers){
        int resp = 0;
        float formula = 0; // kg/(altura^2 en mt2)).
        formula = (pers.getPeso() / (pers.getAltura()*pers.getAltura()));
        if(formula < 20){
            resp = -1;
        }else{
            if(formula >= 20 && formula <= 25){
                resp = 0;
            }else{
                resp = 1;
            }
        }
        return resp;
    }

    public Boolean esMayorDeEdad(Persona pers){
        Boolean resp = false;
        if(pers.getEdad()>=18){
            resp = true;
        }
        return resp;
    }
}
