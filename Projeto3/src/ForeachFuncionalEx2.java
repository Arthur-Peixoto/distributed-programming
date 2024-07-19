import java.util.Arrays;
import java.util.List;

public class ForeachFuncionalEx2 {
    public static void main(String[] args) {
        List<String> paises = Arrays.asList("Brasil", "Alemanha", "Espanha", "Italia", "Colombia");
        System.out.println("ForEach Comum");

            paises.forEach((p) ->{
                System.out.println(p + "#1.1");
            });

            System.out.println("Com lambida");
            paises.forEach(p ->
                System.out.println(p + "#1.2")
            );

            paises.forEach(
                System.out::println
            );
        
    }
}
