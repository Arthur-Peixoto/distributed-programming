import java.util.function.Predicate;

public class PredicadoComComposicaoEx {
    public static void main(String[] args) {
        Predicate<Integer> isPar = n -> n % 2 == 0;
        Predicate<Integer> isTresDigitos = n -> n >= 100 && n <= 999;

        System.out.println(isPar.and(isTresDigitos).test(222));
        System.out.println(isPar.and(isTresDigitos).test(223));
        System.out.println(isPar.or(isTresDigitos).test(22));
        System.out.println(isPar.or(isTresDigitos).negate().test(13));
        System.out.println(isPar.or(isTresDigitos).negate().negate().test(13));
    }
}
