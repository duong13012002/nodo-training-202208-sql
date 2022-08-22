import com.sun.net.httpserver.Headers;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class HttpHeaderExp {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://cooc.net/");
        URLConnection connection = (HttpURLConnection) url.openConnection();
        System.out.println("Http method "+ connection.getRequestProperties());
        Map headers = connection.getHeaderFields();
        BiConsumer<String, List<String>> header = (key,values) ->{
            System.out.println("Key: "+key+"Values: " +values);
        };
        headers.forEach(header);
    }
}
