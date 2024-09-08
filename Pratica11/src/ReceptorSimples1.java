import java.io.IOException;
import java.net.*;

public class ReceptorSimples1 {
    public static void main(String[] args) throws IOException {
        int porta = 55554;
        /*
         * Criando o Multicast Socket
         */
        MulticastSocket ms = new MulticastSocket(porta);
        System.out.println("Receptor " +
                InetAddress.getLocalHost() +
                " executando na porta " +
                ms.getLocalPort());
        /*
         * Se juntando ao grupo
         */
        /*
         * Forma antiga: ms.joinGroup(InetAddress.getByName(group));
         */
        /*
         * Forma atual:
         */
        InetAddress multicastIP =
                InetAddress.getByName("225.17.8.9");
        InetSocketAddress grupo =
                new InetSocketAddress(multicastIP, 55555);
        NetworkInterface interfaceRede =
                NetworkInterface.getByName("wlp2s0");
        ms.joinGroup(grupo, interfaceRede);
        /*
         * Agora o MS está configurado e pronto para receber pacotes
         */
        System.out.println("Receptor " +

                InetAddress.getLocalHost() +
                        " entrou no grupo endereçado por " +
                        grupo);
        /*
         * Criando um DatagramPacket para recebimento
         */
        byte bufferRecepcao[] = new byte[1024];
        DatagramPacket pacoteRecepcao = new DatagramPacket(
                bufferRecepcao,
                bufferRecepcao.length);
        ms.receive(pacoteRecepcao);
// aqui, faz-se algo útil com os dados recebidos
        System.out.println("Dados recebidos de: " +
                pacoteRecepcao.getAddress().toString() +
                ":" + pacoteRecepcao.getPort() +
                " com tamanho: " + pacoteRecepcao.getLength());
        System.out.write(bufferRecepcao,
                0,
                pacoteRecepcao.getLength());
        System.out.println();
        /*
         * Ao terminar o processamento dos dados,
         * sair do grupo multicast e fechar o MS
         */
        /*
         * Forma antiga ms.leaveGroup(InetAddress.getByName(group));
         */
        /*
         * Forma atual:
         */
        ms.leaveGroup(grupo, interfaceRede);
        ms.close();
    }
}
