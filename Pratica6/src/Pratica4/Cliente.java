package Pratica4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
             PrintWriter out = new PrintWriter(
                     socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(socket.getInputStream()));
             BufferedReader console = new BufferedReader(
                     new InputStreamReader(System.in))) {
            System.out.println("Conectado ao servidor. " +
                    "Mensagem de boas-vindas: " + in.readLine());
            String entrada;
            while ((entrada = console.readLine()) != null) {
                out.println(entrada);
                System.out.println("Resposta do servidor: " + in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
