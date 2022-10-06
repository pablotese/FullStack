package Clase;

import org.w3c.dom.ls.LSOutput;

import static java.lang.String.valueOf;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud() {
        this.longitud = this.getFrase().length();
    }
    public int mostrarVocales(){
        int i=0, cant=0;
        for (i=0; i<this.frase.length() ; i++){
            if(this.frase.toLowerCase().charAt(i) == 'a' || this.frase.toLowerCase().charAt(i) == 'e' || this.frase.toLowerCase().charAt(i) == 'i' || this.frase.toLowerCase().charAt(i) == 'o' || this.frase.toLowerCase().charAt(i) == 'u'){
                cant++;
            }
        }
        return cant;
    }
    public void invertirFrase(){
        int i=0;
        for (i=this.frase.length()-1; i>=0 ; i--){
            System.out.print(this.frase.charAt(i));
        }
        System.out.println("");
    }
    public void vecesRepetido(String letra){
        int i=0, cant=0;
        for (i=0; i<this.frase.length() ; i++){
            if(letra.equalsIgnoreCase(String.valueOf(this.frase.charAt(i)))){
                cant++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + cant + " veces");
    }
    public Boolean compararLongitud(String fra){
        return (fra.length() == this.frase.length());
    }

    public void reemplazar(String letra) {
        String reemplaza= this.frase.replace("a", letra);
        System.out.println(reemplaza);
    }

    public Boolean contiene(String letra) {
        int i=0;
        for (i=0; i<this.frase.length() ; i++){
            if(this.frase.toLowerCase().charAt(i) == letra.charAt(0) ){
                return true;
            }
        }
        return false;
    }
}
