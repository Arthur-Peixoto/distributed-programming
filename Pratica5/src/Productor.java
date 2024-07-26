public class Productor extends Thread{
    private Buffer buffer;
    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                buffer.produzir(i);
                 sleep(500);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            
        }
    }
}
