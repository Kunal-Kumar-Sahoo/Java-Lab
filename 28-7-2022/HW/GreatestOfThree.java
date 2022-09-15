// Take three inputs and display the greatest number

import javax.swing.*;

class GreatestOfThree {
    public static void main(String[] args) {
        int a, b, c, max;
        a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Enter third number:"));
        
        if(a > b) {
            if(a > c) max = a;
            else max = c;
        }
        else {
            if(b > c) max = b;
            else max = c;
        }

        JOptionPane.showMessageDialog(null, "Maximum number is: " + max);
    }
}
