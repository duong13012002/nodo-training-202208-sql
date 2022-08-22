import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

public class DatagramServerExp implements Runnable{
    public DatagramServerExp() throws Exception{
        DatagramSocket socket = new DatagramSocket(8080);
        System.out.println("Data server listening......");
    }
    @Override
    public void run() {
        DatagramSocket socket = null;
        try {
            byte[] bytes = new byte[10];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket = new DatagramSocket(8080);
            System.out.println("From client: "+ new String(packet.getData(),10,packet.getLength()));
            bytes = "Server say Hello ".getBytes();
            socket.send(new DatagramPacket(bytes, bytes.length,packet.getAddress(),packet.getPort()));
        }catch (Exception e){
            e.printStackTrace();
            socket.close();
        }

    }

    public static void main(String[] args) throws Exception{
        new Thread(()->{
            try {
                new DatagramServerExp();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();

    }
}
