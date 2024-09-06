package Collect;

import Filter.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplo2Collect {
    public static void main(String[] args) {
// Lista de 10 produtos
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(102, "Smartphone"),
                new Produto(103, "Tablet"),
                new Produto(104, "Smartwatch"),
                new Produto(105, "PC"),
                new Produto(106, "Teclado"),
                new Produto(107, "Mouse"),
                new Produto(108, "Monitor"),
                new Produto(109, "Impressora"),
                new Produto(110, "Fone de Ouvido")
        );
// Coleta os produtos em um Set para garantir que não haja duplicatas
        Set<Produto> produtosSet = produtos.stream()
                .collect(Collectors.toSet()); // Coleta os produtos em um Set
        System.out.println("Produtos no Set:");
        produtosSet.forEach(System.out::println);
    }
}
