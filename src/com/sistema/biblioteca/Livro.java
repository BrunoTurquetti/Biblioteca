package com.sistema.biblioteca;

public class Livro extends Item {

    private int numeroDePaginas;
    private String genero;

    public Livro(String titulo, String autor, int ano, boolean emprestado, int numeroDePaginas, String genero) {
        super(titulo, autor, ano, emprestado);
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarInformacoes(){
        System.out.println("Duração do Livro: " + this.getNumeroDePaginas());
        System.out.println("Genero do Livro: " + this.getGenero());
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getTitulo() + ", Autor: " + this.getAutor() + ", Ano: " + this.getAno() + ", Emprestado: " + this.getEmprestado();
    }
}
