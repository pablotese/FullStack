package Clase;
import Clase.Cadena;

public class CadenaService {
    public void unirFrases(String frase, Cadena cad){
        String unidas="";
        unidas = cad.getFrase() + frase;
        System.out.println(unidas);
    }

}
