package ejercicios;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private Float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public static Comparator<Pelicula> compararDuracionMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };

    public static Comparator<Pelicula> compararDuracionMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };

    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };

    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
}
