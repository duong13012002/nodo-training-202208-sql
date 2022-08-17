import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;

public class RobotExp {
    public static void lefClick(Robot robot){
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(200);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(200);
    }
    public static void type(Robot robot,String s){
        byte[] bytes = s.getBytes();
        for (byte b : bytes){
            int code = b;
            if (code >96 && code<123) code = code-32;
            robot.delay(40);
            robot.keyPress(code);
            robot.keyRelease(code);
        }
    }

    public static void main(String[] args) {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.delay(2*1000);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        robot.mouseMove((int) dim.getWidth()/2,(int) dim.getHeight()/2);
        lefClick(robot);

        String userDir = System.getProperty("user.home");
        File file = new File(new File(userDir),"Temp.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Desktop.getDesktop().edit(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        robot.delay(500);
        type(robot,"Xin chao moi nguoi, minh ten la Duong, rat vui duoc gap cac ban");

        robot.delay(5*1000);
        System.exit(0);
    }
}
