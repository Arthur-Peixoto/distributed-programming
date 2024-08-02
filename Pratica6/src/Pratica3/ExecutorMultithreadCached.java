package Pratica3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorMultithreadCached {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        try {
            Future<String> submit1 = executor.submit(new ThreadCallable());
            System.out.println(submit1.get());
            Future<String> submit2 = executor.submit(new ThreadCallable());
            System.out.println(submit2.get());
            Future<String> submit3 = executor.submit(new ThreadCallable());
            Future<String> submit4 = executor.submit(new ThreadCallable());
            Future<String> submit5 = executor.submit(new ThreadCallable());
            System.out.println(submit3.get());
            System.out.println(submit4.get());
            System.out.println(submit5.get());
            executor.shutdown();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executor.shutdownNow();
        }


    }
}
