import java.util.Calendar;
import java.util.Locale;

public class EnumExp {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Hom nay la "+VnDay.valueOf(calendar));
    }
    public enum VnDay{
        THU_HAI,THU_BA,THU_TU,THU_NAM,THU_SAU,THU_BAY,CHU_NHAT,KHONG_BIET;
        static VnDay valueOf(Calendar calendar){
          String type = calendar.getDisplayName(Calendar.DAY_OF_WEEK,calendar.SHORT,new Locale("vi"));
            switch (type){
                case "Th 2": return THU_HAI;
                case "Th 3": return THU_BA;
                case "Th 4": return THU_TU;
                case "Th 5": return THU_NAM;
                case "Th 6": return THU_SAU;
                case "Th 7": return THU_BAY;
                case "CN": return CHU_NHAT;
            }
            return KHONG_BIET;
        }
    }


}
