import java.util.Set;
import java.util.TreeSet;

public class SetExp {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(14);
        numbers.add(8);
        numbers.add(3);
        numbers.add(12);
        numbers.add(8);

        System.out.println("Size of set: "+numbers.size());
    }
}
