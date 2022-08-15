import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Duong");
        IntStream stream = IntStream.range(0,10);
        stream.forEach(value -> {
            if (builder.length() >0)builder.append(",");
            builder.append(value);
        });
        System.out.println("Text value = "+builder);

    }
}
