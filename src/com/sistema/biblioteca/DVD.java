package com.sistema.biblioteca;

public class DVD extends Item{
    private int duracao;
    private String genero;

    public DVD(String titulo, String autor, int ano, boolean emprestado, int duracao, String genero) {
        super(titulo, autor, ano, emprestado);
        this.duracao = duracao;
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarInformacoes(){
        System.out.println("Duração do Filme: " + duracao);
        System.out.println("Genero do Filme: " + genero);
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getTitulo() + ", Autor: " + this.getAutor() + ", Ano: " + this.getAno() + ", Emprestado: " + this.getEmprestado();
    }
}
