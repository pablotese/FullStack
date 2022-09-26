package Clase;

import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo:");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo:");
        altura = leer.nextInt();
    }
    public void dibujarRectangulo(){
        for(int i =0 ; i < this.altura ; i++){
            for(int j=0 ; j < this.base ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public int perimetro(){
        return((base + altura) * 2);
    }
    public int superficie(){
        return (base * altura);
    }
}
