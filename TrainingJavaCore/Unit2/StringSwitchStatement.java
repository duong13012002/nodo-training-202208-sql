import java.util.Calendar;
import java.util.Locale;

public class StringSwitchStatement {
    public static void main(String[] args) {
        StringSwitchStatement statement = new StringSwitchStatement();
        Calendar calendar = Calendar.getInstance();
        System.out.println("Today is "+statement.getTypeOfDay(calendar));

        calendar.set(Calendar.DATE,calendar.get(Calendar.DATE) + 1);
        System.out.println("Tomorow is "+ statement.getTypeOfDay(calendar));
    }
    String getTypeOfDay(Calendar calendar){
        String type = calendar.getDisplayName(
                Calendar.DAY_OF_WEEK,calendar.SHORT,new Locale("vi")
        );
        switch (type){
            case"Th 2":
                return "Start of work week";
            case"Th 3":
                return "Second day of week";
            case"Th 4":
                return "Middle week";
            case"Th 5":
                return "Fourth day of week";
            case"Th 6":
                return "Fifth day of week";
            case"Th 7":
                return "End of week";
            case"CN":
                return "Weekend";
        }
        return "Unknown";
    }
}
