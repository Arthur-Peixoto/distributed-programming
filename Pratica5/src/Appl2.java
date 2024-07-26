import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Appl2 {
public static void main(String[] args) {
    BlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(5);
    Thread P = new Thread(new ProdutorSafe(buffer));
    Thread C = new Thread(new ConsumidorSafe(buffer));
    Thread P1 = new Thread(new ProdutorSafe(buffer, 600));
    Thread C1 = new Thread(new ConsumidorSafe(buffer,200));
    P.start();
    C.start();
    P1.start();
    C1.start();
}
}
