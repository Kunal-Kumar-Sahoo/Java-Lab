// Write a java program to check whether a given number is even or odd.

import javax.swing.*;

class EvenOdd {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        if(a % 2 == 1) JOptionPane.showMessageDialog(null, a + " is an Odd number.");
        else JOptionPane.showMessageDialog(null, a + " is an Even number.");
    }
}
