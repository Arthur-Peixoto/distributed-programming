package ForEach;

import java.util.Arrays;
import java.util.List;

public class Exemplo1ForEach{
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Imprime todos os números da lista
        numeros.stream()
                .forEach(n -> System.out.println(n));
    }
}
