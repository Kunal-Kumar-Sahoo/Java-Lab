import java.awt.*;
import javax.swing.*;
import java.util.*;

public class GridLayoutExample {
    public void initGUI() {
        JFrame frame = new JFrame("GridLayout example");
        ArrayList<JButton> buttons = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            buttons.add(new JButton(i+1+""));
        buttons.forEach((button) -> frame.add(button));
        frame.setLayout(new GridLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public GridLayoutExample() { initGUI(); }
    
    public static void main(String[] main) {
        new GridLayoutExample();
    }
}
