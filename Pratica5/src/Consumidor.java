public class Consumidor extends Thread{
    private Buffer buffer;
    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                buffer.consumir();
                sleep(500);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            
        }
    }

}
