
package com.sistema.biblioteca;

public class Usuario {
    private String nome;
    private String email;
    private long telefone;

    public Usuario(String nome, String email, long telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void mostrarInformacoes(){
        System.out.println("Usuário: " + this.getNome());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
    }
}
