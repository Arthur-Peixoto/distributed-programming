import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProdutorSafe implements Runnable{
    private BlockingQueue<Integer> buffer;
    int tempo = 1000;

    public ProdutorSafe(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    public ProdutorSafe(BlockingQueue<Integer> buffer, int tempo) {
        this.buffer = buffer;
        this.tempo = tempo;
    }

    @Override
    public void run(){
        int valor = new Random().nextInt(1000);
        while(true){
            String nome = Thread.currentThread().getName();
            try {
                valor++;
                buffer.put(valor);
                System.out.println("\u001B[35m" + nome + "Produzindo: " + valor + "\u001B[0m"); 
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
