import java.awt.*;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class LockFileNIOExp {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Temp\\io_sample.txt");
        RandomAccessFile raf = new RandomAccessFile(file,"rw");

        FileChannel channel = raf.getChannel();
        FileLock lock = channel.tryLock(0,Long.max(10,20),false);

        Desktop.getDesktop().edit(file);
        Thread.sleep(15*1500l);
        lock.release();
    }

}
