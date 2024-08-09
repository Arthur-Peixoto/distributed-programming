import java.util.concurrent.*;

public class BarreiraCiclicaApp5 {
    // problema: (543*4) + (4^10) + (56*256/4) = ?
// realizando a ação final
    static BlockingQueue<Double> resultados =
            new LinkedBlockingQueue<>();
    public static void main(String[] args) {
// cada tarefa vai executar uma parte da equação
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Runnable acaoFinal = () ->{
            System.out.println("Somando tudo...");
            double resultadoFinal = 0;
            for (int i = 0; i < 3; i++) {
                resultadoFinal += resultados.poll();
            }
            System.out.println("Ação final realizada: " +
                    resultadoFinal);
        };
        /* acaoFinal passada no construtor
         * significa que a thread será chamada
         * a partir da barreira */
        CyclicBarrier barreira = new CyclicBarrier(3, acaoFinal);
        Runnable r1 = () ->{
            System.out.println(543*4);
            resultados.add((double) 543*4);
            await(barreira);
//System.out.println("Processamento finalizado.");
        };
        Runnable r2 = () ->{
            System.out.println(Math.pow(4, 10));
            resultados.add(Math.pow(4, 10));
            await(barreira);
//System.out.println("Processamento finalizado.");
        };
        Runnable r3 = () ->{
            System.out.println(56 * (256/4));
            resultados.add((double) (56 * (256/4)));
            await(barreira);
//System.out.println("Processamento finalizado.");
        };
        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.shutdown();
    }
    static void await(CyclicBarrier b){
        try {
            b.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
