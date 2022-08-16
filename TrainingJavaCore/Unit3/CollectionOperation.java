import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(7,4,1,3,8,9,2,6,10);
        Comparator<Integer> comparator = Integer :: compare;
        Collections.sort(listOfInteger,comparator);

        listOfInteger.stream().filter(v -> v > 5).forEach(v ->{
            System.out.println(v);
        });

        Collector<Integer,?,IntSummaryStatistics> collector = Collectors.summarizingInt(Integer :: intValue);
        IntSummaryStatistics summaryStatistics = listOfInteger.stream().collect(collector);
        System.out.println("Total = " + summaryStatistics.getSum());
        System.out.println("Overage = "+summaryStatistics.getAverage());

        Predicate<Integer> tester = v -> v<5;
        Consumer<Integer> myConsumer = n ->{

            System.out.println("User input value = "+n);
            if (n<5){
                System.out.println("Invalid value!");
                return;
            }
            else {
            listOfInteger.add(n);
            listOfInteger.forEach(x -> System.out.print(x+"-")
            );}
        };


        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Please in put a number: ");
            int value = scanner.nextInt();
            if (value<0){
                System.out.println("Invalid Number");
            }
            if (tester.test(value))
            myConsumer.accept(value);

        }



    }

}
