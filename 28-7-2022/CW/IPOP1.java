import javax.swing.*;

class IPOP1 {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));
        JOptionPane.showMessageDialog(null, "The sum is: " + (a+b));
    }
}
