import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class HttpServerExp {
    public static void main(String[] args) throws Exception{
        TestHandler testHandler = new TestHandler();
        HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
        server.createContext("/test",testHandler);
        server.setExecutor(Executors.newFixedThreadPool(5));
        server.start();
    }
}
