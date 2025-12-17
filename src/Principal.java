public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Fast and Furios";
        miPelicula.fechaLanzamiento = 2001;
        miPelicula.duracion = 120;

        miPelicula.muestraFichaTecnica();
        
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1999;
        otraPelicula.duracion = 60;

       otraPelicula.muestraFichaTecnica();

    }
}
