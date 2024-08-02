package Pratica1;

import java.util.concurrent.*;

public class SubmitThreadCallable2 {
    public static void main(String[] args) {
        ExecutorService executor = null;

        try{
            executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(new ThreadCallable());
            System.out.println(future.isDone());
            System.out.println(future.get(3, TimeUnit.SECONDS));
            System.out.println(future.isDone());
            Future<String> future2 = executor.submit(new ThreadCallable());
            System.out.println(future2.isDone());
            System.out.println(future2.get(3, TimeUnit.SECONDS));
            System.out.println(future2.isDone());
        } catch (Exception e){
            throw new RuntimeException(e);
        } finally {
            if(executor != null){
                executor.shutdown();
            }
        }
    }
}
