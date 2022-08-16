import java.util.ArrayList;
import java.util.List;

public class ConcurrencyExp {
     public static void addData(List list) {
        while (true){
            Integer random = (int)(Math.random()*100);
            list.add(random);
            System.out.println("Add new data" +random);
            try {
                Thread.sleep(100l);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }

        }
    }
    public static void prinData(List list){
         while (true){
             try {
                 System.out.println("===================");
                 list.forEach(value -> System.out.println("value = "+value));
                 Thread.sleep(80l);
             } catch (InterruptedException e) {
                 e.printStackTrace();
                 System.exit(1);
             }
         }
    }

    public static void main(String[] args) {
         List list = new ArrayList<>();
         new Thread(()-> {
             addData(list);
         }).start();
         new Thread(()->{prinData(list);}).start();
    }
}
