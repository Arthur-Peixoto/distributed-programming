import java.util.function.Consumer;
import java.util.*;

public class ConsumidorEx1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimir = System.out::println;

        numeros.forEach(imprimir);
    }
}
