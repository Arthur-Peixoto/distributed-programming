import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarreiraCIclicaApp2 {

    public static void main(String[] args) {
        //pobema
        CyclicBarrier barreira = new CyclicBarrier(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable r1 = () ->{
            System.out.println(543 * 4);
            await(barreira);
            System.out.println("ACABOOOOOU");
        };
        Runnable r2 = () ->{
            System.out.println(Math.pow(4,10));
            await(barreira);
            System.out.println("ACABOOOOOU");
        };
        Runnable r3 = () ->{
            System.out.println(56 *(256/4));
            await(barreira);
            System.out.println("ACABOOOOOU");
        };

        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);

        executor.shutdown();
    }
    static void await(CyclicBarrier b){
        try {
            b.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}

