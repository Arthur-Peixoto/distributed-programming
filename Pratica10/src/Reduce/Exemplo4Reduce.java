package Reduce;

import java.util.Arrays;
import java.util.List;
public class Exemplo4Reduce {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(15, 22, 9, 45, 38, 2, 14);
// Encontra o maior número na lista
        int maximo = numeros.stream()
                .reduce(Integer.MIN_VALUE, Integer::max); // Encontra o máximo
        System.out.println("Valor máximo: " + maximo);
    }
}
