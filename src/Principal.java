public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Fast and Furios";
        miPelicula.fechaLanzamiento = 2001;
        miPelicula.duracion = 120;


        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("La fecha de lanzamiento es: "+ miPelicula.fechaLanzamiento);
        System.out.println("La duracion de la pelicula es: " +miPelicula.duracion);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1999;
        otraPelicula.duracion = 60;

        System.out.println("Mi pelicula es: " + otraPelicula.nombre);
        System.out.println("La fecha de lanzamiento es: "+ otraPelicula.fechaLanzamiento);
        System.out.println("La duracion de la pelicula es: " +otraPelicula.duracion);

    }
}
