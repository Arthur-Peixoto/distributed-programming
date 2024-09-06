package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Filter {
    public static void main(String[] args) {
// Lista de números inteiros
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Filtra apenas os números pares
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Mantém apenas números pares
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Números pares: " + numerosPares);
    }
}