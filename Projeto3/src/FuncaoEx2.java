import java.util.function.Function;

public class FuncaoEx2 {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
        numero -> numero % 2 == 0 ? "Par" : "Impar";
        //System.out.println(parOuImpar2.apply(2));
        Function<String, String> resultado =
        str -> "O resultado é " + str;
        String resultadoFinal = parOuImpar.andThen(resultado).apply(21);
        System.out.println(resultadoFinal);
        Function<Integer,Integer> dobro = v -> v * 2;
        resultadoFinal = dobro.andThen(parOuImpar).andThen(resultado).apply(32);
        System.out.println(resultadoFinal);
    }
}
