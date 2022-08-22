import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class HttpConnectionExp {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://cooc.net");
        URLConnection connection = (HttpURLConnection) url.openConnection();
        Path  path = Paths.get("test.html");
        int read;
        byte[] bytes = new byte[20];
        try (
            InputStream inputStream = connection.getInputStream();
            OutputStream outputStream = Files.newOutputStream(path,
                    StandardOpenOption.CREATE);
        ){
            while ((read = inputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,read);
            }
        }finally {
            Desktop.getDesktop().open(path.toFile());
        }
    }
}
