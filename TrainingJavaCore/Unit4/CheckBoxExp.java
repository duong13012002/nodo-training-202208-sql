import java.awt.*;

public class CheckBoxExp extends Frame {
    public CheckBoxExp(){
        setLayout(new FlowLayout());

        Checkbox checkbox1 = new Checkbox("Lua chon 1 ");
        checkbox1.setFont(new Font("Arial",Font.BOLD,14));
        add(checkbox1);

        final Checkbox checkbox2 = new Checkbox("CheckBox2 ");
        add(checkbox2);
        checkbox2.addItemListener(e ->{
            System.out.println("Value 2 = " + checkbox2.getState());
        });
    }
}
