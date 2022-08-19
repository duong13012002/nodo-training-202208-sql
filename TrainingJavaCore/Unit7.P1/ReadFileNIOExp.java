import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFileNIOExp {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInput = null;
        FileChannel fileChannel = null;
        File file = new File("C:\\Temp\\io_sample.txt");

        try {
            fileInput = new FileInputStream(file);
            fileChannel = fileInput.getChannel();
            long size = fileChannel.size();
            ByteBuffer buff = ByteBuffer.allocate((int)size);
            fileChannel.read(buff);
            buff.rewind();
            System.out.println(new String(buff.array(),"UTF-8"));
        }finally {
            if (fileChannel != null) fileChannel.close();
            if (fileInput != null) fileInput.close();;
        }
    }
}
