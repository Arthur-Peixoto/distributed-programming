import java.util.Arrays;
import java.util.List;

public class ForeachFuncionalEx1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        for(Integer n : numeros)
            System.out.println(n);

            numeros.forEach(n -> System.out.println(n));
            System.out.println("Usando ForEach Funcional");
            numeros.forEach(System.out::println);
        
    }
}
