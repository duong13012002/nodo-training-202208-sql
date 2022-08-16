import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrencyTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,4,2,3,6,3,3,8);

        System.out.println("Before remove: size of list = "+list.size());

        list.forEach(v ->{
            if (v == 3)list.remove(v);
        });
        System.out.println("After remove: size of list = "+list.size());

        //Remove with Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 3)iterator.remove();
        }
        //Remove with if
        list.removeIf(item ->{return  item == 3;});
        //Remove with singleton
        list.removeAll(Collections.singleton(3));
    }
}
