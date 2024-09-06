import java.io.IOException;
import java.net.DatagramSocket;
import java.net.*;

public class EmissorSimples1 {
    public static void main(String[] args) throws IOException {
        int porta = 55554;
        String grupo = "225.7.8.9";
        /*
         * Criando o socket mas não vinculando-o ao grupo.
         * Serve apenas para enviar dados.
         */
        DatagramSocket ds = new DatagramSocket();
        System.out.println("Emissor " +
                InetAddress.getLocalHost() +
                " executando na porta " +
                ds.getLocalPort());
        /*
         * Não é preciso se juntar a um grupo
         * se o processo vai apenas enviar dados e
         * não receber.
         */
        /*
         * Inserindo dados no buffer de envio
         */
        String msg = "mensagem";
        byte bufferEnvio[] = msg.getBytes();
        /*
         * Criando um DatagramPacket para envio
         */
        System.out.println("Enviando mensagem ao grupo multicast: mensagem");
        DatagramPacket pacoteEnvio = new DatagramPacket(
                bufferEnvio,
                bufferEnvio.length,
                InetAddress.getByName(grupo),
                porta);
        /*
         * Fazendo o envio
         */
        ds.send(pacoteEnvio);
        /*
         * Fechando o MS
         */
        ds.close();
    }
}
