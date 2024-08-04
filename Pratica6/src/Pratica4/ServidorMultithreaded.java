package Pratica4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorMultithreaded {

    private static final int PORT = 12345;
    private static final int MAX_THREADS = 10;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(MAX_THREADS);

        try(ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor iniciado na porta");
            while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente encontrado" + socket.getInetAddress());
                pool.execute(new TratarClientes(socket));
            }
        }catch (IOException io){
            io.printStackTrace();
        }finally {
            pool.shutdownNow();
        }
    }
}
