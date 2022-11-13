import javax.swing.*;
import java.awt.*;

class BoxLayoutTest extends JFrame {
    public JButton b1,b2,b3,b4,b5;
    public void createButton() {
        b1=new JButton ("Button 1");
        b2=new JButton ("Button 2");
        b3=new JButton ("Button 3");
        b4=new JButton ("Button 4");
        b5=new JButton ("Button 5");
    }
    BoxLayoutTest() {
        createButton();
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        add(b1);add(b2);add(b3);add(b4);add(b5);
        setTitle("Assignment 11");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String [] args) {
        new BoxLayoutTest();
    }
}
