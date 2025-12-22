import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.List;

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

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracion(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        otraPelicula.muestraFichaTecnica();
        System.out.println("Tiempo necesario para ver tus titulos favoritos en estas vacaciones: " +calculadora.getTiempoTotal() + " minutos");


        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumeroEpisodio(1);
        episodio.setNombre("La casa de papel");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtro(episodio);


        //PELICULA NUEVA
        var peliculaNew = new Pelicula();
        peliculaNew.setNombre("El conjuro");
        peliculaNew.setDuracion(120);
        peliculaNew.setFechaLanzamiento(2000);

        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otraPelicula);
        listaPeliculas.add(peliculaNew);

        System.out.println("Tamano de la lista: " + listaPeliculas.size());
        System.out.println("La primera pelicula es: " + listaPeliculas.get(0).getNombre());





    }
}
