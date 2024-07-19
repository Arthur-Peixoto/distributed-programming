import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ForeachFuncionalEx11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach(n -> {
            Integer d = n * new Random().nextInt(100);
            System.out.println(d);
        }
        );
    }
}
