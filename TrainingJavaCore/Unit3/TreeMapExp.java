import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExp {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(3,"Nguyen Van A");
        map.put(1,"Nguyen Van B");
        map.put(2,"Nguyen Van C");
        map.put(4,"Nguyen Van X");

        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
