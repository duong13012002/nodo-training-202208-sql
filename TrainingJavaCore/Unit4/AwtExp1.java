import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class AwtExp1 extends Frame {
    private List list;
    public AwtExp1(){
        //setLayout(new FlowLayout());
        setLayout(new BorderLayout());
        final TextField text = new TextField();
        text.setSize(100,50);
        add(text,BorderLayout.PAGE_START);

        list = new List(4,true);
        IntStream.range(0,10).forEach(i ->{
            list.add("Item "+i );
        });
        add(list,BorderLayout.CENTER);
        Button pushButton = new Button("Press me");
        add(pushButton,BorderLayout.PAGE_END);
        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Supplier<StringBuilder> supplier = StringBuilder::new;
                BiConsumer<StringBuilder,String> consumer = (builder,value) ->{
                    if (builder.length()>0) builder.append(", ");
                    builder.append(value);
                };
                BinaryOperator<StringBuilder> operator = StringBuilder::append;
                Function<StringBuilder,String> finisher = StringBuilder::toString;

                String [] values = list.getSelectedItems();
                Collector<String,StringBuilder,String> collector = Collector.of(supplier,consumer,operator,finisher);
                text.setText(Arrays.stream(values).collect(collector));
            }
        });
        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);
        Menu menu = new Menu("File");
        menuBar.add(menu);

        MenuItem menuItem = new MenuItem("Exit ",new MenuShortcut('X'));
        menu.add(menuItem);
        menuItem.addActionListener(e -> {
            System.exit(1);
        });
    }


}
