import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class SocketClientExp {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",8080);
        System.out.println("Client start sending.....");
        try (DataInputStream input = new DataInputStream(socket.getInputStream());
             DataOutputStream output = new DataOutputStream(socket.getOutputStream());){
            output.writeUTF("Hello Server");
            System.out.println("Server Say: "+input.readUTF());
        } finally {
            socket.close();
        }
    }
}
