import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExp {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        for (String ele : args){
            list.add(ele);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("======> " +iterator.next());
        }
    }
}
