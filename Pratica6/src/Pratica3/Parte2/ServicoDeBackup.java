package Pratica3.Parte2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ServicoDeBackup {
    public static void main(String[] args) {
// Criação de um ScheduledExecutorService
// com um pool de threads fixo de tamanho 1
        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);
// Tarefa de backup de dados (executada com atraso fixo)
        Runnable tarefaBackup = () -> {
            System.out.println("Iniciando backup de dados: " +
                    System.currentTimeMillis());
// Simulação de tarefa de backup com
// duração aleatória entre 2 e 5 segundos
            try {
                int duracaoBackup = 2000 + (int) (Math.random() * 3000);
                Thread.sleep(duracaoBackup);
                System.out.println("Backup concluído em " +
                        duracaoBackup +
                        " ms: " +
                        System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
// Agendamento da tarefa de backup com atraso fixo (fixed-delay)
        scheduler.scheduleWithFixedDelay(
                tarefaBackup, 0, 10, TimeUnit.SECONDS);
// agendar o encerramento do serviço após 1 minuto
        scheduler.schedule(() -> {
            scheduler.shutdown();
            System.out.println("Encerrando o serviço de backup.");
        }, 1, TimeUnit.MINUTES);
    }
}
