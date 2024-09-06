package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo3Sorted {
    public static void main(String[] args) {
// Lista de números inteiros
        List<Integer> numeros =
                Arrays.asList(5, 3, 8, 1, 9, 2, 4, 7, 6, 22,
                        77, 90, 15, 89, 10, 73);
// Filtra números pares, mapeia para seus quadrados,
// e ordena em ordem crescente
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra números pares
                .map(n -> n * n) // Mapeia para seus quadrados
                .sorted() // Ordena em ordem crescente
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Resultado: " + resultado);
    }
}
