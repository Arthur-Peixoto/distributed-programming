package Pratica2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorMultithread {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        try{
            Future<String> future1 = service.submit(new ThreadCallable());
            Future<String> future2 = service.submit(new ThreadCallable());
            Future<String> future3 = service.submit(new ThreadCallable());
            Future<String> future4 = service.submit(new ThreadCallable());
            Future<String> future5 = service.submit(new ThreadCallable());
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
            System.out.println(future4.get());
            System.out.println(future5.get());

            service.shutdown();

        } catch(Exception e){
            throw new RuntimeException(e);
        } finally {
            if(service != null) service.shutdownNow();
        }
    }
}
