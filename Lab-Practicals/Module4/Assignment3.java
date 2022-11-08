import javax.swing.*;

public class Assignment3 {
    Assignment3() {
        JFrame frame = new JFrame();
        String name = JOptionPane.showInputDialog(frame, "Enter your name: ");
        JOptionPane.showMessageDialog(frame, "Hello " + name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Assignment3();
        System.exit(0);
    }
}
