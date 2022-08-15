import java.util.prefs.Preferences;

public class PreferenceExp {
    public static void main(String[] args) {
        Preferences preferences = Preferences.userNodeForPackage(PreferenceExp.class);
        System.out.println("Old Value = "+preferences.get("data1","No value"));
        preferences.put("data1","value"+System.currentTimeMillis());
        System.out.println("New Value = "+preferences.get("data1","No value"));
    }
}
