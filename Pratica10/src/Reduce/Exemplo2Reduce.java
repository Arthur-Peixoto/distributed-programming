package Reduce;
import java.util.Arrays;
import java.util.List;
public class Exemplo2Reduce {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Reduce", "para", "concatenar", "strings", "de uma lista");
// Concatena todas as strings da lista
                        String concatenacao = palavras.stream()
// Concatena as palavras com espaço
                                .reduce("", (acc, palavra) -> acc + palavra + " ");
        System.out.println("Concatenação: " + concatenacao.trim());
    }
}