package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Sorted {
    public static void main(String[] args) {
// Lista de números inteiros
        List<Integer> numeros = Arrays.asList(5, 3, 8, 1, 9, 2);

// Ordena a lista em ordem crescente
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted() // Ordena naturalmente (crescente)
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Números ordenados: " + numerosOrdenados);
    }
}