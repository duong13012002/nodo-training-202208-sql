import javax.swing.*;
import java.awt.*;

public class SystemTrayExp {
    public static void main(String[] args) {
        SystemTray tray = SystemTray.getSystemTray();
        Icon icon = UIManager.getIcon("OptionPane.informationIcon");
        Image image = ((ImageIcon) icon).getImage();

        TrayIcon trayIcon = new TrayIcon(image,"Tray Demo",null);
        trayIcon.addActionListener(new ShowExpActionListener());
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
