package com.sistema.biblioteca;

public class Revista extends Item{
    private int numeroEdicao;
    private String mesPublicacao;

    public Revista(String titulo, String autor, int ano, boolean emprestado, int numeroEdicao, String mesPublicacao) {
        super(titulo, autor, ano, emprestado);
        this.numeroEdicao = numeroEdicao;
        this.mesPublicacao = mesPublicacao;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }


    public void mostrarInformacoes(){
        System.out.println("Número da Edição: " + this.getNumeroEdicao());
        System.out.println("Mês da Publicação: " + this.getMesPublicacao());
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getTitulo() + ", Autor: " + this.getAutor() + ", Ano: " + this.getAno() + ", Emprestado: " + this.getEmprestado();
    }
}
