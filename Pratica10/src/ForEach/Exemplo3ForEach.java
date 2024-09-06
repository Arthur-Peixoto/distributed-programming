package ForEach;

import java.util.Arrays;
import java.util.List;

public class Exemplo3ForEach {
    public static void main(String[] args) {
        List<String> palavras =
                Arrays.asList("java", "python", "c++", "javascript", "ruby");
// Converte todas as palavras para maiúsculas
        palavras.stream()
                .map(String::toUpperCase) // Converte cada palavra para maiúscula
                .forEach(System.out::println); // Imprime cada palavra
    }
}
