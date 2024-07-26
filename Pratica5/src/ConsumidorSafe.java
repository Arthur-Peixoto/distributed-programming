import java.util.concurrent.BlockingQueue;

public class ConsumidorSafe implements Runnable {
    private BlockingQueue<Integer> buffer;
    int tempo = 1500;

    public ConsumidorSafe(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }
    
    public ConsumidorSafe(BlockingQueue<Integer> buffer, int tempo) {
        this.buffer = buffer;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        while(true){
            String nome = Thread.currentThread().getName();
            try {
                int valor = buffer.take();
                System.out.println("\u001B[34m" + nome + "Consumindo: " + valor + "\u001B[0m");
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
}
