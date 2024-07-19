import java.util.*;
import java.util.function.Predicate;

public class PredicadoEx1 {
    public static void main(String[] args) {
        
        Predicate<Produto> isCaro = prod -> prod.preco > 700;
        Produto p1 = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(p1));

        Predicate<Produto> isCaroComDesconto = prod -> prod.preco * (1 - prod.desconto) > 700;
        System.out.println(isCaroComDesconto.test(p1));
    }
}