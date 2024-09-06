package Reduce;

import java.util.Arrays;
import java.util.List;
public class Exemplo5Reduce {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Processa a lista usando map, filter, sorted e reduce
        int somaDosQuadrados = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra números pares
                .map(n -> n * n) // Mapeia para o quadrado dos números
                .sorted((a, b) -> b - a) // Ordena em ordem decrescente
                .reduce(0, Integer::sum); // Soma todos os valores
        System.out.println("Soma dos quadrados dos números pares " +
                "em ordem decrescente: " +
                        somaDosQuadrados);
    }
}
