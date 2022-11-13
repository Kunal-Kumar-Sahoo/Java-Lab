import javax.swing.*;

public class Assignment8 {
    Assignment8() {
        JFrame frame = new JFrame();
        String name = JOptionPane.showInputDialog(frame, "Enter your name: ");
        JOptionPane.showMessageDialog(frame, "Hello " + name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Assignment8();
        System.exit(0);
    }
}