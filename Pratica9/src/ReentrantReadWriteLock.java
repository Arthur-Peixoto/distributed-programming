import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class ReentrantReadWriteLock {
    private static int recurso = -1;
    private static ReadWriteLock lock = new
            java.util.concurrent.locks.ReentrantReadWriteLock();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Runnable r1 = () -> {
            Lock writeLock = lock.writeLock();
            writeLock.lock();
            String nome = Thread.currentThread().getName();
            recurso++;
            System.out.println(nome + " : " + recurso);
            writeLock.unlock();
        };
        Runnable r2 = () -> {
            Lock readLock = lock.readLock();
            readLock.lock();
            String nome = Thread.currentThread().getName();
            recurso++;
            System.out.println(nome + " : " + recurso);
            readLock.unlock();
        };
        for (int i = 0; i < 5; i++) {
            executor.execute(r1);
            executor.execute(r2);
        }
        executor.shutdown();
    }
}