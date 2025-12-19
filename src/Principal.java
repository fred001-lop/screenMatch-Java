import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Fast and Furios");
        miPelicula.setFechaLanzamiento(2001);
        miPelicula.setDuracion(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());



        //DATOS PARA UNA SERIE

        Serie casaDragon = new Serie();

        casaDragon.setNombre("Casa Dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("Duracion de la serie "+ casaDragon.getDuracion());










//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaLanzamiento = 1999;
//        otraPelicula.duracion = 60;
//
//        otraPelicula.evalua(5);
//        otraPelicula.evalua(10);
//        otraPelicula.evalua(10);

//        System.out.println(otraPelicula.sumaDeLasEvaluaciones);
//        System.out.println(otraPelicula.totalEvaluaciones);
//        System.out.println(otraPelicula.calculaMedia());

//       otraPelicula.muestraFichaTecnica();

    }
}
