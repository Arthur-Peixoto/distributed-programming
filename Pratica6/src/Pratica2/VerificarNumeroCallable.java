package Pratica2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VerificarNumeroCallable implements Callable<Boolean> {
    private final int numero;

    public VerificarNumeroCallable(int numero) {
        this.numero = numero;
    }

    private Boolean isPrime(int numero) {
        if(numero <= 1) {return false;}
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return isPrime(numero);
    }

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(4);
        int[] numeros = {2,3,4,5,16,17,19,23,24,29};
        List<Future<Boolean>> futures = new ArrayList<>();
        VerificarNumeroCallable tarefa;
        Future<Boolean> future;

        for (int i = 0; i < numeros.length; i++) {
            tarefa = new VerificarNumeroCallable(numeros[i]);
            future = executor.submit(tarefa);
            futures.add(future);
        }

        for(int i = 0; i < numeros.length; i++) {
            try {
                Boolean isPrime = futures.get(i).get();
                System.out.println("Numero: " + numeros[i] + "\n É primo: " + isPrime);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
