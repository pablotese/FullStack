package Clase;

import java.util.Scanner;

public class MesesService {

    public Boolean adivinaMes(String mes){
        Boolean resp = false;
        Meses m = new Meses();
        resp = m.getMesSecreto().equalsIgnoreCase(mes);

        return resp;
    }
}
