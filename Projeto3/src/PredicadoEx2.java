import java.util.function.Predicate;

public class PredicadoEx2 {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num % 2 == 0;

        System.out.println(isPar.test(2));
        System.out.println(isPar.test(3));
    }
}
