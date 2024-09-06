package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo4Sorted {
    public static void main(String[] args) {
// Lista de produtos
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(202, "Smartphone"),
                new Produto(303, "Tablet"),
                new Produto(404, "Smartwatch"),
                new Produto(505, "PC"),
                new Produto(707, "SmartTV"),
                new Produto(808, "Roteador WiFi")
        );
// Filtra produtos com nomes curtos (<= 7 caracteres),
// mapeia para "código - nome", e ordena por código
        List<String> resultado = produtos.stream()
// Filtra produtos com nomes curtos
                .filter(p -> p.getNome().length() <= 7)
// Mapeia para "código - nome"
                .map(p -> p.getCodigo() + " - " + p.getNome())
                .sorted() // Ordena em ordem crescente (natural para strings)
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Resultado: " + resultado);
    }
}
