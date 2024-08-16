package Exemplo3;

import java.util.concurrent.*;

public class InicializacaoDeModulos {
    private static final int NUMERO_DE_MODULOS = 3;
    public static void main(String[] args) {
        CountDownLatch latch =
                new CountDownLatch(NUMERO_DE_MODULOS);
        ExecutorService executor =
                Executors.newFixedThreadPool(NUMERO_DE_MODULOS);
        executor.submit(new ModuloInicializacao(
                "Banco de Dados", 3000, latch));
        executor.submit(new ModuloInicializacao(
                "Servidor Web", 5000, latch));
        executor.submit(new ModuloInicializacao(
                "Sistema de Mensagens", 2000, latch));
        try {
// Aguarda até que todos os módulos estejam inicializados
            latch.await();
            System.out.println("Todos os módulos foram inicializados. " +
                    "Sistema pronto para operação.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Encerra o pool de threads
        }
    }
}
