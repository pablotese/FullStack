package Main;

public class Main {

    public static void main(String[] args) {
        /*
        clases.PerroService ps = new clases.PerroService();
        ps.crearPerros();

        AlumnoService as = new AlumnoService();
        as.crearAlumnos();
        System.out.println("promedio: " + as.notaFinal());

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
        */
        PersonaService ps = new PersonaService();
        ps.crearPersona(2); // genero 2 personas
        ps.mostrarPersonas();
    }
}
