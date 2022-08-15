public class MethodExp {
    private static int add(int number1, int number2){
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println("4 + 7 = " + add(4,7));
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        System.out.println(value1 + " + " + value2 + " = " + add(value1,value2));
    }
}
