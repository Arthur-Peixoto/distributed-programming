public class Appl {
    public static void main(String[] args) {
        Buffer buffer = Buffer.getInstance();
        Productor productor = new Productor(buffer);
        Consumidor consumidor = new Consumidor(buffer);
        productor.start();
        consumidor.start();
    }
}
