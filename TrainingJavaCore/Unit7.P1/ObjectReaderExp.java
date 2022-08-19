import java.io.*;
import java.lang.reflect.Method;

public class ObjectReaderExp {
    public static void main(String[] args) throws Exception {
        File folder = new File("C:\\Temp\\");
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(new File(folder,"my_object")));
        Object obj = input.readObject();
        Method method = obj.getClass().getMethod("run",new Class[0]);
        method.invoke(obj, new Object[0]);
        input.close();
    }
}
