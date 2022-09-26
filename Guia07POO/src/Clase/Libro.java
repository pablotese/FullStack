package Clase;
/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */

import java.util.Scanner;

public class Libro {
    private long ISBN;
    private String titulo;
    private String autor;
    private int nroPaginas;

    public Libro(long ISBN, String titulo, String autor, int nroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public Libro() {
    }

    public void cargarLosDatosLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese el ISBN:");
        this.setISBN(leer.nextLong());

        System.out.println("ingrese el titulo del libro:");
        this.setTitulo(leer.next());

        System.out.println("ingrese el nombre del autor del libro:");
        this.setAutor(leer.next());

        System.out.println("ingrese el nro de paginas:");
        this.setNroPaginas(leer.nextInt());
}

    public void mostrarLosDatosLibro() {
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Nro Paginas: " + this.getNroPaginas());
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
}
