package com.sistema.biblioteca;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Item i1 = new Item("ABC", "Pelé", 1950, false);
    Livro l1 = new Livro("CDE", "Panda", 2010, false, 300, "Terror");

    // Exibindo as informações iniciais
    i1.mostrarInformacoes();
    l1.mostrarInformacoes();

    // Criando cliente
    Cliente c = new Cliente("Bruno", "BrunoJava@gmail.com", 11945760750L, "Mooca", new ArrayList<>());

    // Exibindo informações do cliente
    c.mostrarInformacoes();

    // Emprestando o item
    c.emprestarItem(i1);  // Empresta o item i1

    // Exibindo informações do cliente após o empréstimo
    c.mostrarInformacoes();

    // Devolvendo o item
    c.devolverItem(i1);  // Devolve o item i1

    // Exibindo informações do cliente após a devolução
    c.mostrarInformacoes();
  }
}