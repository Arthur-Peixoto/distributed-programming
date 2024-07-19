import java.util.List;
import java.util.*;

public class ForeachFuncionalEx4 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "José", "Maria", "Ana", "Carlos");

        nomes.forEach(nome -> {
            String nomeMaiusculo = nome.toUpperCase();
            System.out.println(nomeMaiusculo);
        });
    }
}
