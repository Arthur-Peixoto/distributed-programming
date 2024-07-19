import java.util.function.BinaryOperator;

public class CalculoBinaryOperator {
public static void main(String[] args) {
    BinaryOperator<Integer> soma = (a, b) -> a + b;
    System.out.println(soma.apply(2, 3));
    BinaryOperator<Integer> subtracao = (a, b) -> a - b;
    System.out.println(subtracao.apply(2, 3));
    BinaryOperator<Integer> multiplicacao = (a, b) -> a * b;
    System.out.println(multiplicacao.apply(2, 3));
    BinaryOperator<Integer> divisao = (a, b) -> a / b;
    System.out.println(divisao.apply(2, 3));
    BinaryOperator<Integer> resto = (a, b) -> a % b;
    System.out.println(resto.apply(2, 3));
    BinaryOperator<Integer> max = BinaryOperator.maxBy((a, b) -> a - b);
    System.out.println(max.apply(2, 3));
    BinaryOperator<Integer> min = BinaryOperator.minBy((a, b) -> a - b);
    System.out.println(min.apply(2, 3));
}
}
