import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ReentrantLock1 {
    private static int recurso = -1;
    private static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Runnable r1 = () -> {
            lock.lock();
            String nome = Thread.currentThread().getName();
            recurso++;
            System.out.println(nome + " : " + recurso);
            lock.unlock();
        };
        for (int i = 0; i < 5; i++) {
            executor.execute(r1);
        }
        executor.shutdown();
    }
}