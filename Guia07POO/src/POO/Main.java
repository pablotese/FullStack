package POO;

import Clase.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

        //*****************

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


        Cadena cad = new Cadena();
        Scanner leer =  new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase o palabra");
        cad.setFrase(leer.next());
        cad.setLongitud();
        System.out.println("Cant de vocales:" + cad.mostrarVocales());
        cad.invertirFrase();
        cad.vecesRepetido("a");
        System.out.println("La longitud de la frase es igual?: " + cad.compararLongitud("habia una vez un circo"));
        CadenaService cadServ = new CadenaService();
        cadServ.unirFrases("Hola como estás? ", cad);
        cad.reemplazar("h");
        System.out.println("Contiene la letra? " + cad.contiene("s"));


        Matematica mat = new Matematica();
        double num1 = Math.random()*10;
        double num2 = Math.random()*10;
        mat.setNum1(num1);
        mat.setNum2(num2);
        System.out.println("El numero mayor es: " + mat.devolverMayor());
        System.out.println("La potencia de los nums es: " + mat.calcularPotencia());
        System.out.println("la raiz cuadrada del menor es: " + mat.calculaRaiz());

        // ARRAYS - 10
        double[] A = new double[50];
        double[] B = new double[20];

        for(int i=0 ; i <50 ; i++){
            A[i] = (Math.random()*(75-25+1)+25);
        }
        for(double nro : A){
            System.out.println(nro);
        }
        System.out.println("ORDENADOS: ");
        Arrays.sort(A);
        for(double nro : A){
            System.out.println(nro);
        }
        for(int i=0 ; i <10 ; i++){
            B[i] = A[i];
        }
        for(int i=10 ; i <20 ; i++){
            B[i] = 0.5;
        }
        System.out.println("MUESTRO B: ");
        for(double nro : B){
            System.out.println(nro);
        }

        // DATE - 11
        int diaI = 0, mesI=0 , anioI=0;
        int diaA =0, mesA=0, anioA=0;
        int diferencia = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dia: ");
        diaI = leer.nextInt();
        System.out.println("ingrese mes: ");
        mesI = leer.nextInt();
        System.out.println("ingrese año: ");
        anioI = leer.nextInt();
        Date fechaIngresada = new Date(anioI, mesI, diaI);
        Date fechaActual = new Date();

        diaA = fechaActual.getDay() ;
        mesA = fechaActual.getMonth();
        anioA = fechaActual.getYear();
        System.out.println("año: " + fechaActual.getYear());

        if(fechaIngresada.after(fechaActual)){
            diferencia = anioI - (fechaActual.getYear()+1900);
        } else {
            diferencia = (fechaActual.getYear()+1900) - anioI;
        }
        System.out.println("COMPARACION DE FECHAS: " + diferencia + " años");


        // PERSONA 12
        Persona12Service ps = new Persona12Service();
        Persona12 per = ps.crearPersona();
        System.out.println(per.getFechaNac());
        System.out.println(per.getNombre());
        System.out.println("la edad es: " + ps.calcularEdad(per));
        System.out.println("ES menor que: "+ ps.menorQue(per, 37));
        ps.mostrarPersona(per);

        PuntosService ps = new PuntosService();
        Puntos punt = ps.crearPuntos();
        System.out.println("Distancia entre puntos: " + ps.calcularDistancia(punt));

        NIFService ns = new NIFService();
        NIF nifi = ns.crearNIF();
        ns.mostrar(nifi);

        MesesService ms = new MesesService();
        Boolean adivino = false;
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        Boolean primVez = true;
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String m = userInput.next();
        do {
            adivino = ms.adivinaMes(m);
            if(primVez && !adivino){
                primVez = false;
            }else if(!primVez && !adivino){
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                m = userInput.next();
            } else {
                System.out.println("¡Ha acertado!");
            }
        }while (!adivino);

        */
        AhorcadoServicio as = new AhorcadoServicio();
        as.crearJuego();
        while(as.getCantDisponible()!= 0 && !as.isCompleta()){
            as.juego();
        }
        if(as.isCompleta()){
            System.out.println("ADIVINASTE!: " + as.getAhorcado().getPalabra());
        }
    }
}
