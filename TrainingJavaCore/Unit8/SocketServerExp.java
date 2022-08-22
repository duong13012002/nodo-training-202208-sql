import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExp {
    public SocketServerExp(int serverPort) throws  Exception{
        ServerSocket serverSock = new ServerSocket(serverPort);
        System.out.println("Server Listening....");
        while (true){
            Socket socket = serverSock.accept();
            new Thread(()->{
                    try (
                            DataInputStream input = new DataInputStream(socket.getInputStream());
                            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                    ){
                System.out.println("Client Say: " + input.readUTF());
                output.writeUTF("I'm a socket server!");
            } catch (Exception e){
                    e.printStackTrace();
            }
            }).start();
        }
    }

    public static void main(String[] args) throws Exception{
        SocketServerExp socketServerExp = new SocketServerExp(8080);
    }
}
