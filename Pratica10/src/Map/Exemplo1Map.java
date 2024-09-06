package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Map {
    public static void main(String[] args) {
// Lista de strings
        List<String> frutas =
                Arrays.asList("manga", "banana", "abacaxi", "abacate");
// Usando map para transformar cada string em seu comprimento
        List<Integer> tamanhos = frutas.stream()
                .map(String::length) // Aplica o método length() a cada string
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Comprimentos das palavras: " + tamanhos);
    }
}
