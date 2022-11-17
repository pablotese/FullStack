package clases;

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private tamanioPerro tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, tamanioPerro tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public tamanioPerro getTamanio() {
        return tamanio;
    }

    public void setTamanio(tamanioPerro tamanio) {
        this.tamanio = tamanio;
    }
}
