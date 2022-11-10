package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculaService {

    public Pelicula crearPelicula(){
        Pelicula p = new Pelicula();
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese titulo de la pelicula");
        p.setTitulo(userInput.next());
        System.out.println("ingrese director de la pelicula");
        p.setDirector(userInput.next());
        System.out.println("ingrese duracion en hs de la pelicula");
        p.setDuracion(userInput.nextFloat());

        return p;
    }

    public void todasLasAcciones(ArrayList<Pelicula> pelis) {
        mostrarPeliculas(pelis);
        mostrarDuracionMayorUnaHora(pelis);
        mostrarDuracionTodasMayorMenor(pelis);
        mostrarDuracionTodasMenorMayor(pelis);
        mostrarTitulo(pelis);
        mostrarDirector(pelis);
    }

    private void mostrarDuracionTodasMayorMenor(ArrayList<Pelicula> pelis) {
        System.out.println("Mayor a Menor:");
        pelis.sort(Pelicula.compararDuracionMayor);
        mostrarPeliculas(pelis);
    }

    private void mostrarDuracionTodasMenorMayor(ArrayList<Pelicula> pelis) {
        System.out.println("Menor a Mayor:");
        pelis.sort(Pelicula.compararDuracionMenor);
        mostrarPeliculas(pelis);
    }

    private void mostrarTitulo(ArrayList<Pelicula> pelis) {
        System.out.println("Ordenadas por Titulo:");
        pelis.sort(Pelicula.compararTitulo);
        mostrarPeliculas(pelis);
    }

    private void mostrarDirector(ArrayList<Pelicula> pelis) {
        System.out.println("Ordenadas por Directorr:");
        pelis.sort(Pelicula.compararDirector);
        mostrarPeliculas(pelis);
    }

    private void mostrarDuracionMayorUnaHora(ArrayList<Pelicula> pelis) {
        System.out.println("Duracion mayor a 1 hora: ");
        Iterator<Pelicula> itPeli = pelis.iterator();
        while(itPeli.hasNext()){
            Pelicula p = itPeli.next();
            if (p.getDuracion() > 1)
                System.out.println("Titulo: " + p.getTitulo() + " Director: " + p.getDirector() + " Duracion: " + p.getDuracion());
        }
    }

    private void mostrarPeliculas(ArrayList<Pelicula> pelis){
        Iterator<Pelicula> itPeli = pelis.iterator();
        while(itPeli.hasNext()){
            Pelicula p = itPeli.next();
            System.out.println("Titulo: " + p.getTitulo() + " Director: " + p.getDirector() + " Duracion: " + p.getDuracion());
        }
    }
}
