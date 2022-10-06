package Clase;

public enum Sexo {

    H("hombre"), M("mujer"), O("otro");

    Sexo(String valor) {
    }
    static Boolean validar(String valor){
        if(valor.equalsIgnoreCase("H") || valor.equalsIgnoreCase("M") || valor.equalsIgnoreCase("O")){
            return true;
        } else {
            return false;
        }
    }
}
