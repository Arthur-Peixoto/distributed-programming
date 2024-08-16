package Exemplo2;

import java.util.concurrent.*;

public class SincronizacaoTarefas {
    public static void main(String[] args) {
        int numTarefas = 5;
        CountDownLatch latch = new CountDownLatch(numTarefas);
        ExecutorService executor = Executors.newFixedThreadPool(numTarefas);
// Tarefas independentes
        for (int i = 1; i <= numTarefas; i++) {
            int tarefaId = i;
            executor.submit(() -> {
                try {
                    System.out.println("Tarefa " + tarefaId + " em execução.");
                    Thread.sleep(1000 * tarefaId); // Simulando trabalho
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown(); // Reduz o contador
                }
            });
        }
// Tarefa final que depende das outras
        try {
            latch.await(); // Aguarda todas as tarefas independentes concluírem
            System.out.println("Todas as tarefas independentes foram concluídas. "
                    +
                    "Executando a tarefa final.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
