import java.awt.*;
import java.io.*;

public class ReaderWriteExp {
    public static void main(String[] args) {
        File file = new File("C:\\Temp\\io_sample.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("\r\n");
            writer.write("Nguyen Quang Duong");
            writer.close();
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder builder = null;
        try {
            FileReader reader= new FileReader(file);
            char[] buffer = new char[4 * 1024];
            int read = -1;
            builder = new StringBuilder();
            while ((read = reader.read(buffer)) != -1) {
                builder.append(buffer, 0, read);
            }
            reader = new FileReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(builder);

    }
}
