package Exemplo3;

import java.util.concurrent.CountDownLatch;

public class ModuloInicializacao implements Runnable {
    private final String nome;
    private final int tempoInicializacao;
    private final CountDownLatch latch;
    public ModuloInicializacao(String nome, int tempoInicializacao, CountDownLatch
            latch) {
        this.nome = nome;
        this.tempoInicializacao = tempoInicializacao;
        this.latch = latch;
    }
    @Override
    public void run() {
        try {
            System.out.println(nome + " está inicializando...");
            // Simula o tempo de inicialização do módulo
            Thread.sleep(tempoInicializacao);
            System.out.println(nome + " inicializado.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown(); // Decrementa o contador do latch
        }
    }
}