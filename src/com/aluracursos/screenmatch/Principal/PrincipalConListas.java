package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Fast and Furios", 1999 );
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1999 );
        otraPelicula.evalua(6);
        var peliculaNew = new Pelicula("El conjuro", 2001);
        peliculaNew.evalua(10);


        //SERIES


        Serie lost = new Serie("Lost", 2000);


        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);

        lista.add(otraPelicula);
        lista.add(peliculaNew);
        lista.add(lost);


    for (Titulo item: lista){
        System.out.println(item.getNombre());
        if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
//            Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificacion());
        }

       }



    ArrayList<String> listaDeArtistas = new ArrayList<>();
    listaDeArtistas.add("Penelope Crux");
    listaDeArtistas.add("Antonio Banderas");
    listaDeArtistas.add("Ricardo Darin");
    System.out.println(listaDeArtistas);
      Collections.sort(listaDeArtistas);
      System.out.println("Lita de artistas Ordenada: "+ listaDeArtistas);

    Collections.sort(lista);
    System.out.println("Lista de titulos ordenados: "+ lista);



    lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);
    }



}
