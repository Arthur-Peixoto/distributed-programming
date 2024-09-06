package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Exemplo3Filter {
    public static void main(String[] args) {
// Lista de strings
        List<String> palavras =
                Arrays.asList("Java", "Stream", "Filter", "Exemplo", "Código");
// Filtra strings com comprimento maior que 5 caracteres
        List<String> palavrasLongas = palavras.stream()
// Mantém apenas strings com mais de 5 caracteres
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Palavras com mais de 5 caracteres: " +
                palavrasLongas);
    }
}