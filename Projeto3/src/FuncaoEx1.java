import java.util.function.Function;

public class FuncaoEx1 {
 public static void main(String[] args) {
    Function<Integer, String> parOuImpar =
    numero -> {
        String r;
    if (numero % 2 == 0)
        return "Par";
    else  
        return "Impar";
    };
    System.out.println(parOuImpar.apply(2));
    System.out.println(parOuImpar.apply(3));

    Function<Integer, String> parOuImpar2 =
    numero -> numero % 2 == 0 ? "Par" : "Impar";
    System.out.println(parOuImpar2.apply(2));
    System.out.println(parOuImpar2.apply(3));
 }
}