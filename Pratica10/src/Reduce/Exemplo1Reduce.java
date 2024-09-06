package Reduce;

import java.util.Arrays;
import java.util.List;
public class Exemplo1Reduce {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Soma todos os números da lista
        int soma = numeros.stream()
                .reduce(0, Integer::sum); // Acumula a soma dos elementos
        System.out.println("Soma: " + soma);
    }
}
