import java.util.*;
import java.util.function.Consumer;

public class ConsumidorEx3 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
         new Pessoa("João", 25),
         new Pessoa("José", 30),
         new Pessoa("Maria", 20),   
         new Pessoa("Ana", 33)
         );
        Consumer<Pessoa> printPessoas = pessoa -> System.out.println(pessoa);
        pessoas.forEach(printPessoas);
        pessoas.forEach(System.out::println);
    }
}
