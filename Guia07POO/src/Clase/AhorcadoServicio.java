package Clase;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AhorcadoServicio {
    private int cantDisponible;
    private int cantFaltantes;
    private boolean completa;
    private Ahorcado ahorcado;
    private Set<String> acertadas = new HashSet<>();

    public void crearJuego(){
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese palabra: ");
        String word = userInput.next();
        System.out.println("Ingrese la cant de jugadas maximas: ");
        int cant = userInput.nextInt();

        this.ahorcado = new Ahorcado(word, cant);
        this.cantDisponible = cant;
        this.cantFaltantes = word.length();
        this.completa = false;

    }
    public void juego(){
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una letra: ");
        String l = userInput.next();
        System.out.println("Longitud de la palabra: " + this.ahorcado.getCantLetras());
        if (this.ahorcado.buscar(l) && !acertadas.contains(l)){
            System.out.println("La letra pertenece a la palabra");
            this.acertadas.add(l);
            // this.cantAdivinadas++;
            this.cantFaltantes--;
        }else {
            System.out.println("La letra no pertenece a la palabra");
        }
        this.cantDisponible--;
        System.out.println("Número de letras (encontradas, faltantes): (" + this.acertadas.size() +"," + this.cantFaltantes +")");
        System.out.println("Número de oportunidades restantes:" + this.cantDisponible);
        if(this.acertadas.size() == this.ahorcado.getCantLetras()){
            this.completa = true;
        }
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public boolean isCompleta() {
        return completa;
    }

    public Ahorcado getAhorcado() {
        return ahorcado;
    }
}
