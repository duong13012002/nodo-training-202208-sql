import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputExp {
    public static void main(String[] args) throws IOException {
        File file = new File("C:" +File.separator + "Temp" + File.separator+"FileOutPutExp.txt");
        FileInputStream inputStream = new FileInputStream(file);
        try {
            byte[] bytes = new byte[4*1024];
            int read = -1;
            StringBuilder builder = new StringBuilder();
            while ((read = inputStream.read(bytes))!=-1){
                builder.append(new String(bytes,0,read));
            }
            System.out.println("[ "+ builder +" ]");
        }catch (Exception e){
            e.printStackTrace();
        }
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            String bytes = "Hello Java Class";
            byte[] b = bytes.getBytes();
            outputStream.write(b);
        } finally {
            if (outputStream != null) outputStream.close();
        }

    }
}
