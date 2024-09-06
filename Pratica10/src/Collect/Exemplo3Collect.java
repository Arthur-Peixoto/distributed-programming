package Collect;

import Filter.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exemplo3Collect {
    public static void main(String[] args) {
// Lista de produtos com alguns produtos duplicados pelo código
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(102, "Smartphone"),
                new Produto(103, "Tablet"),
                new Produto(104, "Smartwatch"),
                new Produto(105, "PC"),
                new Produto(101, "Laptop"), // Duplicado com código 101
                new Produto(102, "Phone"), // Duplicado com código 102
                new Produto(106, "Teclado"),
                new Produto(107, "Mouse"),
                new Produto(108, "Monitor")
        );
// Elimina duplicatas com base no código e coleta os produtos em um Set
        Set<Produto> produtosSet = produtos.stream()
                .collect(Collectors.toMap(
                        Produto::getCodigo, // Usa o código como chave
                        p -> p, // Usa o próprio produto como valor
// Em caso de duplicata, mantém
// o primeiro produto encontrado
                        (p1, p2) -> p1
                ))
                .values() // Obtém os valores únicos do mapa
                .stream()
                .collect(Collectors.toSet()); // Coleta em um Set
        System.out.println("Produtos no Set após eliminar duplicatas:");
        produtosSet.forEach(System.out::println);
    }
}
