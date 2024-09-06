package com.mycompany.biblioteca.java;

public class Revista extends Publicacion{
    private int numeroRevista;
    private String nombreRevista;

    public Revista(String titulo, int anoPublicacion, int numeroRevista, String nombreRevista) {
        super(titulo, anoPublicacion);
        this.numeroRevista = numeroRevista;
        this.nombreRevista = nombreRevista;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Número de la revista: " + numeroRevista);
        System.out.println("Nombre de la revista: " + nombreRevista);
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }
}
