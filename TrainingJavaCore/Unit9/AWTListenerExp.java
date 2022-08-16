import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTListenerExp{
    public static void main(String[] args) {
        Frame screen = new Frame();
        screen.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(1);
                    }
                }
        );
        Button button = new Button("Press me");
        screen.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Welcome to Java by Example",
                        "Java Sample",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        screen.setSize(250,400);
        screen.setVisible(true);
    }
}
