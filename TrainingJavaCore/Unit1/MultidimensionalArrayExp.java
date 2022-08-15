public class MultidimensionalArrayExp {
    public static void main(String[] args) {
        String [][] values = {
                {"Duong","Qua"},
                {"Tieu","Long","Nu"}
        };
        for (int i = 0; i < values.length; i++) {
            System.out.print("|");
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(i+" va "+j+"|");
                System.out.print(values[i][j] + "|");
            }
            System.out.println();
        }
    }
}
