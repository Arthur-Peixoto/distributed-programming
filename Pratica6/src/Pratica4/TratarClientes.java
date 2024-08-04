package Pratica4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TratarClientes implements Runnable{
    private Socket socket;
    public TratarClientes(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        ){
            pw.println("HTTP/1.1 200 OK");
            String msgCliente;
            while((msgCliente = br.readLine()) != null) {
                System.out.println("Mensagem do cliente: " + msgCliente);
                pw.println("Echo: " + msgCliente);
            }

        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
