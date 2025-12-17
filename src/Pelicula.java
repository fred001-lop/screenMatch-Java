public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracion;
    boolean incluidoEnElPlan;

    void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("La duracion de la pelicula es: " +duracion);
    }

}
