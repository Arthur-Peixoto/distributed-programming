package Pratica3.Parte2;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class MonitoramentoDeSistema {
    public static void main(String[] args) {
// Criação de um ScheduledExecutorService
// com um pool de threads fixo de tamanho 2
        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(2);
// Tarefa de verificação de status do
// sistema (executada a cada 5 segundos)
        Runnable verificarStatus = () -> {
            System.out.println("Verificando o status do sistema: " +
                    System.currentTimeMillis());
// Simulação de tarefa de verificação com duração aleatória
            try {
                Thread.sleep((int) (Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
// Tarefa de limpeza de logs
// (executada com atraso fixo de 10 segundos)
        Runnable limpezaDeLogs = () -> {
            System.out.println("Limpando logs do sistema: " +
                    LocalTime.now());
// Simulação de tarefa de limpeza com duração aleatória
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
// Agendamento da tarefa de verificação
// de status com taxa fixa (fixed-rate)
        scheduler.scheduleAtFixedRate(
                verificarStatus, 0, 5, TimeUnit.SECONDS);
// Agendamento da tarefa de limpeza de logs
// com atraso fixo (fixed-delay)
        scheduler.scheduleWithFixedDelay(
                limpezaDeLogs, 0, 10, TimeUnit.SECONDS);
// Para o exemplo não rodar indefinidamente,
// vamos agendar o encerramento do serviço após 1 minuto
        scheduler.schedule(() -> {
            scheduler.shutdown();
            System.out.println("Encerrando o serviço de monitoramento.");
        }, 1, TimeUnit.MINUTES);
    }
}