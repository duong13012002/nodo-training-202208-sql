import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTimeFormatExp {
    public static void main(String[] args) {
        Locale locale = new Locale("vi","VN");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE,dd MMMMM yyyy",locale);
        Calendar calender = Calendar.getInstance();
        System.out.println(dateFormat.format(calender.getTime()));
    }
}
