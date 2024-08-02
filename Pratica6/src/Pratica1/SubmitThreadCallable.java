package Pratica1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitThreadCallable {
    public static void main(String[] args) {
        ExecutorService executor = null;

        try{
            executor = Executors.newSingleThreadExecutor();
            Future<String> future = executor.submit(new ThreadCallable());
            System.out.println(future.isDone());
            System.out.println(future.get());
            System.out.println(future.isDone());
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(executor != null){
            executor.shutdown();
            }
        }
    }
}
