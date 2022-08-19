import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessExp {
    public static void main(String[] args) throws  Exception{
        File file = new File("C:\\Temp\\io_sample.txt");
        try {
            RandomAccessFile randomAccess = new RandomAccessFile(file,"rw");
            randomAccess.seek(9);
            byte[] bytes = new byte[4*102];
            int read = randomAccess.read(bytes);
            System.out.println(new String(bytes,0,read,"UTF-8"));

            randomAccess.seek(file.length());
            randomAccess.write("\r\n".getBytes());
            randomAccess.writeChars("Hello, Duong ne!");
            Desktop.getDesktop().open(file);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
