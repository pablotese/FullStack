package Main;

import ejercicios.AlumnoService;
import ejercicios.Pelicula;
import ejercicios.PeliculaService;
import ejercicios.PerroService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        PerroService ps = new PerroService();
        ps.crearPerros();

        AlumnoService as = new AlumnoService();
        as.crearAlumnos();
        System.out.println("promedio: " + as.notaFinal());
        */
        PeliculaService ps = new PeliculaService();
        Scanner userInput = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
        Boolean salir = false;
        do{
            pelis.add(ps.crearPelicula());
            System.out.println("desea ingresar otra pelicula?");
            String resp = userInput.next();
            if(resp.equalsIgnoreCase("N"))
                salir = true;
        } while(!salir);

        ps.todasLasAcciones(pelis);
    }
}
