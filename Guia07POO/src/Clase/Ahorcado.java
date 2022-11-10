package Clase;

import java.util.ArrayList;
import java.util.Vector;

public class Ahorcado {

    private ArrayList<String> palabra = new ArrayList<>();
    private int cantLetras;
    private int cantJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String pal, int max) {
        for(int i=0; i < pal.length() ; i++){
            this.palabra.add(pal.substring(i,i+1));
        }
        this.cantLetras = pal.length();
        this.cantJugadasMax = max;
    }

    public int longitud(){
        return (this.palabra.size());
    }

    public boolean buscar(String letra){
        for(int i=0; i < this.palabra.size() ; i++){
            if(this.palabra.contains(letra)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getPalabra() {
        return palabra;
    }

    public void setPalabra(ArrayList<String> palabra) {
        this.palabra = palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }
}
