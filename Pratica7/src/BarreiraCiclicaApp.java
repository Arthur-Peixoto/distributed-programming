import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarreiraCiclicaApp {
    public static void main(String[] args) {
        //pobema
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable r1 = () ->{
            System.out.println(543 * 4);
        };
        Runnable r2 = () ->{
            System.out.println(Math.pow(4,10));
        };
        Runnable r3 = () ->{
            System.out.println(56 *(256/4));
        };

        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);

        executor.shutdown();
    }
}
