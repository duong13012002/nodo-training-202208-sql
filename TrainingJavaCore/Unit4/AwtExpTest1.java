import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtExpTest1 {
    public static void main(String[] args) {
        Frame screen = new AwtExp1();
        screen.setSize(500,100);
        screen.setVisible(true);

        screen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(1);
            }
        });
    }
}
