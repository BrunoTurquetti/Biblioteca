package com.sistema.biblioteca;

public class Funcionario extends Usuario {

    private String cargo;

    public Funcionario(String nome, String email, long telefone, String cargo) {
        super(nome, email, telefone);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();  // Exibe as informações do usuário
        System.out.println("Cargo: " + this.getCargo());
    }
}