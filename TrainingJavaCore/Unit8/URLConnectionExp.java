import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.stream.Stream;

public class URLConnectionExp {
    public static void main(String[] args) throws Exception {
        String link = "http://www.cooc.net/";
        URL url = new URL(link);
        URLConnection connection = url.openConnection();
        System.out.println(url.openConnection());
        InputStream stream = connection.getInputStream();
        int read;
        byte[] bytes = new byte[20];
        while ((read=stream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,read));
        }
    }
}
