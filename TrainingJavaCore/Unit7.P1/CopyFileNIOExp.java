import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class CopyFileNIOExp {
    public static void main(String[] args) throws Exception{
        File sourceFile = new File("C:\\Temp\\io_sample.txt");
        File desFile = sourceFile.getParentFile();
        FileChannel srcChannel = null;
        FileChannel desChannel = null;

        srcChannel = new FileInputStream(sourceFile).getChannel();
        desChannel = new FileOutputStream(desFile).getChannel();
        srcChannel.transferTo(0,srcChannel.size(),desChannel);

        Desktop.getDesktop().open(sourceFile.getParentFile());
    }
}
