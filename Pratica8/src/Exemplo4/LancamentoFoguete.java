package Exemplo4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class LancamentoFoguete {
    public static void main(String[] args) {
        int numSistemas = 3;
        CountDownLatch latch = new CountDownLatch(numSistemas);
        ExecutorService executor = Executors.newFixedThreadPool(numSistemas);
// Verificações dos sistemas
        String[] sistemas = {"Propulsão", "Navegação", "Comunicação"};
        for (String sistema : sistemas) {
            executor.submit(() -> {
                try {
                    System.out.println("Verificando sistema: " + sistema);
                    Thread.sleep((long) (Math.random() * 3000)); // Simulando tempo de verificação
                    System.out.println("Sistema " + sistema + " verificado.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown(); // Reduz o contador
                }
            });
        }
// Esperando todas as verificações serem concluídas antes do lançamento
        try {
            latch.await();
            System.out.println("Todos os sistemas foram verificados. " +
                    "Pronto para o lançamento!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
