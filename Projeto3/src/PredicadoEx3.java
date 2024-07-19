import java.util.function.Predicate;

public class PredicadoEx3 {
    public static void main(String[] args) {
        Predicate<String> isVazia = String::isEmpty;
    
        System.out.println(isVazia.test(""));
        System.out.println(isVazia.test("João"));
    }    
}
