package Pratica2;

import java.util.Random;
import java.util.concurrent.Callable;

public class ThreadCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        //Descomente para ver a Thread cair em Exception
        int i = new Random().nextInt(100);
        return "Oi, eu sou a thread " + Thread.currentThread().getName() + ": " + i;
    }
}
