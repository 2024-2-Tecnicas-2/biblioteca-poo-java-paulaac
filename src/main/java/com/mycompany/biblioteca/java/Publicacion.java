package com.mycompany.biblioteca.java;

public class Publicacion {
    private String titulo;
    private int anoPublicacion;

    public Publicacion(String titulo, int anoPublicacion) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Año de Publicación: " + anoPublicacion);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anoPublicacion;
    }

    public void setAnioPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }
}


