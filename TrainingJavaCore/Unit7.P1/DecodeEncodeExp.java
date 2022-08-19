import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class DecodeEncodeExp {
    public static String encodeString(String text)
            throws UnsupportedEncodingException {
        byte[] bytes = text.getBytes("UTF-8");
        String encodeString = Base64.getEncoder().encodeToString(bytes);
        return encodeString;
    }

    // Giải mã hóa một đoạn text (Đã mã hóa trước đó).
    // Decode
    public static String decodeString(String encodeText)
            throws UnsupportedEncodingException {
        byte[] decodeBytes = Base64.getDecoder().decode(encodeText);
        String str = new String(decodeBytes, "UTF-8");
        return str;
    }
    public static void main(String[] args) {
        String text = "I Love You";

        System.out.println("Text before encode: "+ text);

        String encodeText = null;
        try {
            encodeText = encodeString(text);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Encode text: "+ encodeText);

        String decodeText = null;
        try {
            decodeText = decodeString(encodeText);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Decode text: "+ decodeText);
    }
}
