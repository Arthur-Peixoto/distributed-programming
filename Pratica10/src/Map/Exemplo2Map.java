package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo2Map {
    public static void main(String[] args) {
// Lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
// Usando map para calcular o quadrado de cada número
        List<Integer> quadrados = numeros.stream()
                .map(n -> n * n) // Aplica a operação de quadrado a cada número
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Quadrados dos números: " + quadrados);
    }
}