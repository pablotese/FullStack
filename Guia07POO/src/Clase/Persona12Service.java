package Clase;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Persona12Service {

    public Persona12 crearPersona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona12 pers = new Persona12();
        int dd=0, mm=0, yyyy=0;
        System.out.println("ingrese el nombre de la persona");
        pers.setNombre(leer.next());

        Boolean dateInvalid = true;
        Date birthDate = null;
        do{
            System.out.println("Escriba su fecha de nacimiento (DD-MM-YYYY):");
            String userResponse = leer.next();
            try{
                birthDate = new SimpleDateFormat("dd-MM-yyyy").parse(userResponse);
                pers.setFechaNac(birthDate);
                dateInvalid = false;
            }catch(Exception e){
                System.out.println("Fecha invalida, debe ser del formato (DD-MM-YYYY)");
            }
        }while(dateInvalid);

        return pers;
    }

    public int calcularEdad(Persona12 persona){
        int edad=0, anioAct=0, diaAct=0, mesAct=0;
        Date fechaActual = new Date();
        anioAct = (fechaActual.getYear()+1900);
        mesAct = fechaActual.getMonth()+1;
        diaAct = fechaActual.getDate();
        System.out.println("anio: " + anioAct);
        System.out.println("mes: " + mesAct);
        System.out.println("dia: " + diaAct);
        if(anioAct - persona.getFechaNac().getYear() > 0){
            if(persona.getFechaNac().getMonth() == fechaActual.getMonth() && persona.getFechaNac().getDate() > fechaActual.getDate() ){
                edad = fechaActual.getYear() - persona.getFechaNac().getYear() - 1;
            } else{
                edad = fechaActual.getYear() - persona.getFechaNac().getYear();
            }
        } else {
            edad = 0;
        }
        return edad;
    }

    public void mostrarPersona(Persona12 p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha Nacimiento: " + p.getFechaNac());
    }

    public Boolean menorQue(Persona12 p, int edad) {
        int dif = 0;
        Boolean resp = false;
        if(calcularEdad(p) < edad){
            resp = true;
        }
        return resp;
    }
}
