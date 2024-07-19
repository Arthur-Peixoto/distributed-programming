import java.util.function.Consumer;

import java.util.*;

public class ConsumidorEx2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int adicionar = 20;
        Consumer<Integer> somaPrint = n ->{
            System.out.println(n + adicionar);
        };
        numeros.forEach(somaPrint);
        
        Consumer<Integer> dobro = n ->{
            System.out.println(n * 2);
        };
        numeros.forEach(dobro);

        Consumer<Integer> random = n ->{
            System.out.println(n *new Random().nextInt(100));
        };
        numeros.forEach(dobro);
    }
}
