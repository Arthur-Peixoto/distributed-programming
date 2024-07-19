public class CalculoApp2 {

    public static void main(String[] args) {
        Calculo soma = (p, q) -> {
            return p + q;
        };
        Calculo multiplicacao = (p, q) -> {
            return p * q;
        };
        Calculo outraSome = (p, q) -> {
            
            return p + q;
        };
        System.out.println(soma.calcular(2, 3));
        System.out.println(multiplicacao.calcular(2, 3));
    }
}
