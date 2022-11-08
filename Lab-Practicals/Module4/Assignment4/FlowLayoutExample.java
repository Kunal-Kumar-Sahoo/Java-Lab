import javax.swing.*;
import java.awt.*;
import java.util.*;

public class FlowLayoutExample {
    public void initGUI() {
        JFrame frame = new JFrame("FlowLayout example");
        ArrayList<JButton> buttons = new ArrayList<JButton>();
        for(int i = 0; i < 10; i++) 
            buttons.add(new JButton((i+1) + ""));
        buttons.forEach((button) -> frame.add(button));

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    FlowLayoutExample() { initGUI();  }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
