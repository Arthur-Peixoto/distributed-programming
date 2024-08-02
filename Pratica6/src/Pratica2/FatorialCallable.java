package Pratica2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FatorialCallable implements Callable<Long> {

    final int numero;

    public FatorialCallable(int numero) {
        this.numero = numero;
    }

    private Long fatorial(int numero) {
        if (numero <= 1)
            return 1L;
        else return fatorial(numero - 1) * numero;
    }

    @Override
    public Long call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return fatorial(numero);
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        FatorialCallable tarefa1 = new FatorialCallable(10);
        FatorialCallable tarefa2 = new FatorialCallable(8);
        FatorialCallable tarefa3 = new FatorialCallable(7);
        FatorialCallable tarefa4 = new FatorialCallable(12);
        FatorialCallable tarefa5 = new FatorialCallable(11);

        Future<Long> submit1 = executor.submit(tarefa1);
        Future<Long> submit2 = executor.submit(tarefa2);
        Future<Long> submit3 = executor.submit(tarefa3);
        Future<Long> submit4 = executor.submit(tarefa4);
        Future<Long> submit5 = executor.submit(tarefa5);

        executor.shutdown();
        try{
            Long resultado1 = submit1.get();
            System.out.println("Fatorial de 10: " + resultado1);
            Long resultado2 = submit2.get();
            System.out.println("Fatorial de 8: " + resultado2);
            Long resultado3 = submit3.get();
            System.out.println("Fatorial de 7: " + resultado3);
            Long resultado4 = submit4.get();
            System.out.println("Fatorial de 12: " + resultado4);
            Long resultado5 = submit5.get();
            System.out.println("Fatorial de 11: " + resultado5);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            executor.shutdownNow();
        }
    }
}
