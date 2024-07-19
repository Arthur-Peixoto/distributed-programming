public class Operacoes {
public static void main(String[] args) {
    OperacaoMatematica somar = (a,b) -> a + b;
    OperacaoMatematica substrair = (a,b) -> a - b;
    OperacaoMatematica multiplicar = (a,b) -> a * b;
    OperacaoMatematica dividir = (a,b) -> {
        if(b == 0) throw new ArithmeticException("calma calabreso");
        else return a / b;
    };

    Thread tSoma = new Thread(() -> {
        double r = somar.execute(10, 5);
        System.out.println("Soma: " + r);
    });
    Thread tSub = new Thread(() -> {
        double r = substrair.execute(10, 5);
        System.out.println("Subtração: " + r);
    });
    Thread tMult = new Thread(() -> {
        double r = multiplicar.execute(10, 5);
        System.out.println("Multiplicação: " + r);
    });
    Thread tDiv = new Thread(() -> {
        double r = dividir.execute(10, 5);
        System.out.println("Divisão: " + r);
    });
    tSoma.start();
    tSub.start();
    tMult.start();
    tDiv.start();
    try {
        tSoma.join();
        tSub.join();
        tMult.join();
        tDiv.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
}
