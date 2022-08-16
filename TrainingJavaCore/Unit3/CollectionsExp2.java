import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExp2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"Tu","An","Hoa","Binh");
        list.toArray();
        Collections.sort(list);
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i)+ ",");
        }
        System.out.println("Vi tri cua Hoa la vi tri thu "+Collections.binarySearch(list,"Hoa"));
    }
}
