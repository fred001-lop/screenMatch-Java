public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Fast and Furios";
        miPelicula.fechaLanzamiento = 2001;
        miPelicula.duracion = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalEvaluaciones);
        System.out.println(miPelicula.calculaMedia());



        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1999;
        otraPelicula.duracion = 60;

        otraPelicula.evalua(5);
        otraPelicula.evalua(10);
        otraPelicula.evalua(10);
        
        System.out.println(otraPelicula.sumaDeLasEvaluaciones);
        System.out.println(otraPelicula.totalEvaluaciones);
        System.out.println(otraPelicula.calculaMedia());

//       otraPelicula.muestraFichaTecnica();

    }
}
