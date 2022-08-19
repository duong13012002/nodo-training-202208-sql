import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class PrintMessage implements Runnable, Serializable {
    private String message;

    public PrintMessage(String can_noi_noi) {
        this.message = message;
    }


    @Override
    public synchronized void run() {
        String[] elements = message.split("");
        Arrays.stream(elements).forEach(ele ->{
            System.out.println(Thread.currentThread().getName() + " print "+ele);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        try {
            Thread.sleep((int)(Math.random()*3)*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PrintMessage message = new PrintMessage("Say hello to everyone");
        new Thread(message).start();
    }
}
