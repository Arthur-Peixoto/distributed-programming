package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1Collect {
    public static void main(String[] args) {
// Lista de strings
        List<String> palavras =
                Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
// Concatena as strings em uma única string separada por vírgulas
        String resultado = palavras.stream()
// Coleta e concatena as strings com ", " como separador
                .collect(Collectors.joining(", "));
        System.out.println("Palavras concatenadas: " + resultado);
    }
}