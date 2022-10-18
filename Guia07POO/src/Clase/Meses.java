package Clase;

public class Meses {
    String[] meses = {"enereo" , "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre" ,
                      "octubre", "noviembre", "diciembre"};
    String mesSecreto = meses[9];

    public Meses(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public Meses() {
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
