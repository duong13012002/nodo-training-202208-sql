import java.net.MalformedURLException;
import java.net.URL;

public class URLExp {
    public static void main(String[] args) {
        String link = "https://www.google.com.vn/search?q=hello";
        URL url = null;
        try {
            url = new URL(link);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("Protocol " + url.getProtocol());
        System.out.println("Port "+ url.getPort());
        System.out.println("Query "+ url.getQuery());
    }
}
