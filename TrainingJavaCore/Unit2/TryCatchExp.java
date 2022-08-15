import java.util.logging.Logger;

public class TryCatchExp {
    private final static Logger LOGGER = Logger.getLogger(Throwable.class.getName());

    public static class SaiSoException extends Exception{
        private String so;
        public SaiSoException(String value){
            this.so = value;
        }
        public String getMessage(){
            return "Gia tri "+so +" Khong phai la so!";
        }
    }
    public static int toNumber(String value) throws SaiSoException{
        try {
            Integer integer = Integer.parseInt(value);
            return integer.intValue();
        }catch (NumberFormatException e){
            throw new SaiSoException(value);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Number" +toNumber(args[0]));
        }catch (SaiSoException e){
            System.err.println(e.getMessage());
        }
    }
}
