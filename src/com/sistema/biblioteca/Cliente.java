package com.sistema.biblioteca;

import java.util.List;

public class Cliente extends Usuario {
    private String endereco;
    List<Item> itensEmprestados;

    public Cliente(String nome, String email, long telefone, String endereco, List<Item> itensEmprestados) {
        super(nome, email, telefone);
        this.endereco = endereco;
        this.itensEmprestados = itensEmprestados;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Item> getItensEmprestados() {
        return itensEmprestados;
    }

    public void emprestarItem(Item item) {
        if (!item.getEmprestado()) {
            item.emprestar();  // Marca o item como emprestado
            this.itensEmprestados.add(item);  // Adiciona à lista de itens emprestados do cliente
            System.out.println("Item emprestado com sucesso: " + item.getTitulo());
        } else {
            System.out.println("Item já está emprestado: " + item.getTitulo());
        }
    }

    public void devolverItem(Item item) {
        if (item.getEmprestado()) {
            item.devolver();  // Marca o item como devolvido
            this.itensEmprestados.remove(item);  // Remove da lista de itens emprestados do cliente
            System.out.println("\n" + "Item devolvido com sucesso: " + item.getTitulo() + "\n");
        } else {
            System.out.println("Item não está emprestado: " + item.getTitulo());
        }
    }

    public void mostrarItensEmprestados() {
        if (itensEmprestados.isEmpty()) {
            System.out.println("Nenhum item emprestado.");
        } else {
            System.out.println("Itens Emprestados:");
            for (Item item : this.itensEmprestados) {
                item.mostrarInformacoes();  // Exibe detalhes de cada item
            }
        }
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Usuário: " + this.getNome());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço do cliente: " + this.getEndereco());
        mostrarItensEmprestados(); // Chama o método para exibir os itens emprestados
        System.out.println("");
    }
}