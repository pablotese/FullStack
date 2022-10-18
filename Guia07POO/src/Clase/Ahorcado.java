package Clase;

import java.util.Vector;

public class Ahorcado {

    private Vector <String> palabra = new Vector();
    private int cantLetras;
    private int cantJugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String pal, int max) {
        for(int i=0; i < pal.length() ; i++){
            this.palabra.addElement(pal.substring(i,i+1));
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

    public Vector getPalabra() {
        return palabra;
    }

    public void setPalabra(Vector palabra) {
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
