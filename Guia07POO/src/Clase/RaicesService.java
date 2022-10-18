package Clase;

import java.util.Scanner;

public class RaicesService {

    public Raices crearRaices(){
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        int a, b, c;
        System.out.println("ingrese 'a' : ");
        a = userInput.nextInt();
        System.out.println("ingrese 'b' : ");
        b = userInput.nextInt();
        System.out.println("ingrese 'c' : ");
        c = userInput.nextInt();

        Raices raiz = new Raices(a,b,c);

        return raiz;
    }
    public double getDiscriminante(Raices r){
        return ((Math.pow(r.getB(),2))-4*r.getA()*r.getC()); // (b^2)-4*a*c
    }
    public Boolean tieneRaices(Raices r){
        return (getDiscriminante(r) >= 0);
    }
    public Boolean tieneRaiz(Raices r){
        return (getDiscriminante(r) == 0);
    }
    public void obtenerRaices(Raices r){
        if(tieneRaices(r)){ // (-b±√((b^2)-(4*a*c)))/(2*a)
            System.out.println("raiz 1: " + ((-r.getB())+(Math.sqrt(Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA()));
            System.out.println("raiz 2: " + ((-r.getB())-(Math.sqrt(Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA()));
        }
    }
    public void obtenerRaiz(Raices r){
        if(tieneRaiz(r)){
            System.out.println("raiz unica: " + ((-r.getB())+(Math.sqrt(Math.pow(r.getB(),2))-(4*r.getA()*r.getC())))/(2*r.getA()));
        }
    }
    public void calcular(Raices r){
        if(tieneRaices(r)){
            obtenerRaices(r);
        }else if(tieneRaiz(r)){
            obtenerRaiz(r);
        } else {
            System.out.println("No tiene raices");
        }
    }
}
