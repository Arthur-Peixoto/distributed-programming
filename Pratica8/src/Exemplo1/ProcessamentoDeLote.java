package Exemplo1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ProcessamentoDeLote {
    private static final int NUMERO_DE_TAREFAS = 5;
    private static final int TAMANHO_DO_POOL = 3;
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(NUMERO_DE_TAREFAS);
        ExecutorService executor = Executors.newFixedThreadPool(TAMANHO_DO_POOL);
        for (int i = 1; i <= NUMERO_DE_TAREFAS; i++) {
            executor.execute(new Tarefa(latch, i));
        }
        try {
            latch.await(); // Aguarda até que todas as tarefas sejam concluídas
            System.out.println("Todas as tarefas foram concluídas. " +
                    "Continuando a execução principal.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Encerra o pool de threads
        }
    }
}