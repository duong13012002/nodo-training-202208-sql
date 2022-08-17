import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShowExpActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame screen = new AwtExp1();
        screen.setSize(250,400);
        screen.setVisible(true);

        screen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
}
