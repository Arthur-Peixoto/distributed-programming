package Exemplo1;

import java.util.concurrent.CountDownLatch;

public class Tarefa implements Runnable {
    private final CountDownLatch latch;
    private final int id;
    public Tarefa(CountDownLatch latch, int id) {
        this.latch = latch;
        this.id = id;
    }
    @Override
    public void run() {
        try {
            System.out.println("Exemplo1.Tarefa " + id + " está sendo executada.");
// Simula o tempo de processamento da tarefa
            Thread.sleep((int) (Math.random() * 2000));
            System.out.println("Exemplo1.Tarefa " + id + " concluída.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown(); // Decrementa o contador do latch
        }
    }
}