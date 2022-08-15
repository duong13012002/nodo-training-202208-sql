public class ConcatenateStringTest {
    public static void main(String[] args) {
        int max = 10000;
        StringBuilder builder = new StringBuilder("Hello");
        long start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
             builder.append(String.valueOf(i));
        }
        System.out.println("Time 1 = "+(System.currentTimeMillis()-start));

        StringBuffer buffer = new StringBuffer("Hello");

        for (int i = 0; i < max; i++) {
            buffer.append(String.valueOf(i));
        }
        System.out.println("Time 2 = "+(System.currentTimeMillis()-start));

        String text ="Duong";
        start = System.currentTimeMillis();
        for (int i = 0; i <max ; i++) {
            text += String.valueOf(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time 3 = "+(end - start));

    }


}
