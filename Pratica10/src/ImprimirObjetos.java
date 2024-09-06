import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Joao", "Ana", "Paulo", "Marina");
        System.out.println("for tradicional");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("foreach tradicional");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("usando Iterator");
        Iterator<String> iterador = nomes.iterator();
        while (iterador.hasNext())
            System.out.println(iterador.next());
        System.out.println("usando Stream");
        Stream<String> stream = nomes.stream();
        stream.forEach(System.out::println);
    }
}
