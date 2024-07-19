import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OperacoesMatematicaEx2 {
    public static void main(String[] args) {
        OperacaoMatematica somar = (a, b) -> a + b;
        OperacaoMatematica sub = (a, b) -> a - b;
        OperacaoMatematica mult = (a, b) -> a * b;
        OperacaoMatematica div = (a, b) ->{
            if(b == 0) return 0;
            else
            return a / b;
        };

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> {
            System.out.println("Soma: " + somar.execute(10, 5));
        });
        executor.submit(() -> {
            System.out.println("Subtração: " + sub.execute(10, 5));
        });
        executor.submit(() -> {
            System.out.println("Multiplicação: " + mult.execute(10, 5));
        });
        executor.submit(() -> {
            System.out.println("Divisão: " + div.execute(10, 5));
        }); 

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
