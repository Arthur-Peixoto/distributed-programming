package Map;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Util {
    public static final Consumer<String> print =
            System.out::println;
    public static final UnaryOperator<String> maiuscula =
            m -> m.toUpperCase();
    public static final UnaryOperator<String> primeiraLetra =
            l -> l.charAt(0) + "";
    public static final String exclamacao(String e){
        return e + "!!!";
    }
}
