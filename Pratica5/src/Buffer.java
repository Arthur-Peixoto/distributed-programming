import java.util.*;

public class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    public static Buffer getInstance(){
        return new Buffer();
    }

    public synchronized void produzir(int item) {
        while (queue.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(item);
        System.out.println("Produzindo: " + item);
        notifyAll();
    }

    public synchronized void consumir() throws InterruptedException{
        while(queue.isEmpty())
                wait();
            
            int item = queue.poll();
            System.out.println("Consumindo: " + item);
            notifyAll();
        
    } 
}
