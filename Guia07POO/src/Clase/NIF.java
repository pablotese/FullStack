package Clase;

public class NIF {
    private long DNI;
    private String letra;

    public NIF() {
    }
    public NIF(long DNI){
        this.DNI = DNI;

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        double division = 0;
        int div =0, pos=0;
        int divisor = 23;
        division =  ((double)DNI/(double)divisor);
        div = (int) ((double)DNI/(double)divisor);
        pos = (int) Math.ceil ((division - div) * divisor);
        this.letra = letras[pos];
    }
    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
