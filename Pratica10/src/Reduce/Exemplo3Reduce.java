package Reduce;

import java.util.Arrays;
import java.util.List;
public class Exemplo3Reduce {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(15, 22, 9, 45, 38, 2, 14);
// Encontra o menor número na lista
        int minimo = numeros.stream()
                .reduce(Integer.MAX_VALUE, Integer::min); // Encontra o mínimo
        System.out.println("Valor mínimo: " + minimo);
    }
}
