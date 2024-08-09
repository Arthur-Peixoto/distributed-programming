package Pratica3.Parte2;

import Pratica3.ThreadCallable;

import java.util.concurrent.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public class ExecutorAgendado {
    public static void main(String[] args) {
        ScheduledExecutorService executor = null;
        try {
            executor = Executors.newScheduledThreadPool(5);
/*
Agendar a execução de uma tarefa daqui a 3 segundos
*/
            ScheduledFuture<String> scheduledFuture = executor.schedule(new ThreadCallable(), 3, TimeUnit.SECONDS);
            System.out.println(scheduledFuture.get());
/*
Agendar a execução de uma tarefa daqui a 5 segundos
*/
            ScheduledFuture<String> scheduledFuture2 = executor.schedule(new ThreadCallable(), 5, TimeUnit.SECONDS);
            System.out.println(scheduledFuture2.get());
            executor.shutdown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (executor != null) executor.shutdownNow();
        }
    }
}