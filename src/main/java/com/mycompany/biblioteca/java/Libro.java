package com.mycompany.biblioteca.java;

public class Libro extends Publicacion{
   private String autor;
   private int numeroPaginas;

    public Libro(String titulo, int anoPublicacion, String autor, int numeroPaginas) {
        super(titulo, anoPublicacion);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

}
