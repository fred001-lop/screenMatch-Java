package com.aluracursos.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    //CONNOTACAIONES
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaLanzamiento;
    private int duracion;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalEvaluaciones;


    //CREACION DE CONSTRUCTOR


    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }
    public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: "+ fechaLanzamiento);
        System.out.println("La duracion de la pelicula es: " + getDuracion());
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento;
    }
}
