public class Pelicula {
    String nombre;
    int fechaLanzamiento;
    int duracion;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("La duracion de la pelicula es: " +duracion);
    }

    void evalua(double nota){

        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones++;


    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }

}
