package ForEach;

import java.util.List;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Exemplo2ForEach {
    public static void main(String[] args) {
        List<Integer> numeros =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Variável para acumular a soma
        final AtomicInteger soma = new AtomicInteger();
// Soma todos os números pares da lista
        numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra apenas números pares
// Acumula a soma dos números pares
.forEach(n -> soma.addAndGet(n));
        System.out.println("Soma dos números pares: " + soma);
    }

}
