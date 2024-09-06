package Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo2Sorted {
    public static void main(String[] args) {
// Lista de produtos
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(202, "Smartphone"),
                new Produto(303, "Tablet"),
                new Produto(404, "Smartwatch"),
                new Produto(505, "SmartTV"),
                new Produto(605, "Roteador WiFi")
        );
// Ordena a lista de produtos por nome em ordem decrescente
        List<Produto> produtosOrdenados = produtos.stream()
// Ordena por nome em ordem decrescente
                .sorted(Comparator.comparing(Produto::getNome).reversed())
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Produtos ordenados por nome (decrescente): "
                + produtosOrdenados);
    }
}