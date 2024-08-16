import java.util.concurrent.*;

public class TesteLock1 {
    private static int recurso = -1;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Runnable r1 = () -> {
            String nome = Thread.currentThread().getName();
            recurso++;
            System.out.println(nome + " : " + recurso);
        };
        for (int i = 0; i < 5; i++) {
            executor.execute(r1);
        }
        executor.shutdown();
    }
}