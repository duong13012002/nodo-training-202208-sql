import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClientExp {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        byte[] bytes = new byte[0];
        bytes = "Client say Xin Chao ".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,address,8080);
        socket.send(packet);

        packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);

        System.out.println("From Server: " + new String(packet.getData(),10,packet.getLength()));
        socket.close();
    }
}
