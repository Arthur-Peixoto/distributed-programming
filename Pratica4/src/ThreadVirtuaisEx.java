import java.util.concurrent.Executors;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public class ThreadVirtuaisEx {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        executor.submit(() -> {
            Integer n = new Random().nextInt(1000);
            System.out.println(Thread.currentThread() + " Tarefa 1 executada " + n);
        });

        executor.submit(() -> {
            Integer n = new Random().nextInt(1000);
            System.out.println(Thread.currentThread() + " Tarefa 2 executada " + n);
        });
        

        executor.submit(() -> {
            Integer n = new Random().nextInt(1000);
            System.out.println(Thread.currentThread() + " Tarefa 3 executada " + n);
        });
        

        executor.submit(() -> {
            Integer n = new Random().nextInt(1000);
            System.out.println(Thread.currentThread() + " Tarefa 4 executada " + n);
        });
        
        
        
        
    }
}
