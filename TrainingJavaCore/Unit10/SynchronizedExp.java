import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SynchronizedExp {
    public static void addData(List<Integer> list) {
        IntStream.range(0,1000).forEach(index ->{
            try {
                list.add(index);
            }catch (Exception e){
                System.out.println(e.toString());
            }
        });
    }

    public static void main(String[] args) {
        ArrayList<List<Integer>> values = new ArrayList<List<Integer>>();
        for (int i = 0; i < 10; i++) {
           List<Integer> list = new ArrayList<>();

            new Thread(() -> {
                addData(list);
            }).start();
            values.add(list);
        }
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        values.forEach(list -> System.out.println("Number items of list ------> " +list.size() ));
    }
}
