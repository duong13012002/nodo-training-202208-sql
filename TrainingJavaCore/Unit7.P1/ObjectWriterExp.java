import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterExp {
    public static void main(String[] args) throws  Exception{
        File folder = new File("C:\\Temp\\");
        ObjectOutputStream output = null;
        FileOutputStream fileOutput = new FileOutputStream(new File(folder,"my_object"));
        output = new ObjectOutputStream(fileOutput);

        PrintMessage prinMessage;
        output.writeObject(new PrintMessage("Can Noi Noi"));
        output.close();
    }
}
