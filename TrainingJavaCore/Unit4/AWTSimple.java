import java.awt.*;

public class AWTSimple {
    public static void main(String[] args) {
        Frame screen = new Frame();
        screen.setLayout(null);
        Panel panel = new Panel();
        panel.setBounds(30,60,50,70);
        panel.setBackground(Color.RED);
        screen.add(panel);
        screen.setSize(300,200);
        screen.setVisible(true);
    }
}
