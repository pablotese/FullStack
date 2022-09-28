package POO;

import Clase.*;

public class Main {

    public static void main(String [] args) {
    /*    System.out.println("Ingrese los datos del libro! :O ");
        Libro librito = new Libro();
        librito.cargarLosDatosLibro();
        librito.mostrarLosDatosLibro();
        librito = new Libro(123456, "titulo", "autorBitch", 22);

        Rectangulo rect = new Rectangulo();
        rect.crearRectangulo();
        rect.dibujarRectangulo();

        CuentaService cuentServ = new CuentaService();
        Cuenta cuenta = cuentServ.crearCuenta();
        cuentServ.consultarDatos(cuenta);
        cuentServ.consultarSaldo(cuenta);
        cuentServ.extraccionRapida(cuenta, 200);
        System.out.println(cuentServ.consultarSaldo(cuenta));

        CafeteraService cafeteraService = new CafeteraService();
        Cafetera cafetera = cafeteraService.crearCafetera();
        cafeteraService.agregarCafe(cafetera);
        cafeteraService.vaciarCafetera(cafetera);
        cafeteraService.agregarCafe(cafetera);
        System.out.println("Se lleno la taza?" + cafeteraService.servirTaza(11, cafetera));
        cafeteraService.llenarCafetera(cafetera);
        */

        PersonaService persServ = new PersonaService();
        float pesoIdeal=0, pesoDebajo=0, pesoMayor=0;
        float porcPesoIdeal=0, porcPesoDebajo=0, porcPesoMayor=0;
        int mayorEdad=0, menorEdad=0;
        float porcentajeMayores=0, porcentajeMenores=0;
        int peso1, peso2, peso3, peso4;
        Persona pers1 = persServ.crearPersona();
        Persona pers2 = persServ.crearPersona();
        Persona pers3 = persServ.crearPersona();
        Persona pers4 = persServ.crearPersona();

        peso1 = persServ.calcularIMC(pers1);
        System.out.println(peso1);
        peso2 = persServ.calcularIMC(pers2);
        System.out.println(peso2);
        peso3 = persServ.calcularIMC(pers3);
        System.out.println(peso3);
        peso4 = persServ.calcularIMC(pers4);
        System.out.println(peso4);
        if(peso1==-1){
            pesoDebajo++;
        }else if (peso1 == 0){
            pesoIdeal++;
        }else {
            pesoMayor++;
        }
        if(peso2==-1){
            pesoDebajo++;
        }else if (peso2 == 0){
            pesoIdeal++;
        }else {
            pesoMayor++;
        }
        if(peso3==-1){
            pesoDebajo++;
        }else if (peso3 == 0){
            pesoIdeal++;
        }else {
            pesoMayor++;
        }
        if(peso4==-1){
            pesoDebajo++;
        }else if (peso4 == 0){
            pesoIdeal++;
        }else {
            pesoMayor++;
        }
        porcPesoDebajo = ((pesoDebajo * 100) / 4);
        porcPesoIdeal =   ((pesoIdeal * 100) / 4);
        porcPesoMayor =   ((pesoMayor * 100) / 4);
        System.out.println("PORCENTAJE PESO X DEBAJO: " + porcPesoDebajo + "%");
        System.out.println("PORCENTAJE PESO IDEAL   : " + porcPesoIdeal + "%");
        System.out.println("PORCENTAJE PESO MAYOR   : " + porcPesoMayor + "%");

        //*****************//

        if (persServ.esMayorDeEdad(pers1)){
            mayorEdad++;
        }
        if(persServ.esMayorDeEdad(pers2)){
            mayorEdad++;
        }
        if(persServ.esMayorDeEdad(pers3)){
            mayorEdad++;
        }
        if(persServ.esMayorDeEdad(pers4)){
            mayorEdad++;
        }
        menorEdad = (4 - mayorEdad);
        porcentajeMayores = ((mayorEdad * 100) / 4);
        porcentajeMenores = ((menorEdad * 100) / 4);
        System.out.println("PORCENTAJE MAYORES DE EDAD: " + porcentajeMayores + "%");
        System.out.println("PORCENTAJE MENORES DE EDAD: " + porcentajeMenores + "%");

    }
}
