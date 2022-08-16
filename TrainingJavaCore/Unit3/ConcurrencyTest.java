import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrencyTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,4,2,3,6,3,3,8);

        System.out.println("Before remove: size of list = " +list.size());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3)list.remove(i);
        }
        System.out.println("After remove: size of list = "+list.size());
    }
}
