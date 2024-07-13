//This is a program(Application ) to check if a number is Palindrome//
package java_programs;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the panel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Create a label for instructions
        JLabel userLabel = new JLabel("Enter a number:");
        userLabel.setBounds(10, 20, 160, 25);
        panel.add(userLabel);

        // Create a text field for user input
        JTextField userText = new JTextField(20);
        userText.setBounds(180, 20, 160, 25);
        panel.add(userText);

        // Create a label for result display
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 110, 330, 25);
        panel.add(resultLabel);

        // Create a button to check palindrome
        JButton checkButton = new JButton("Check");
        checkButton.setBounds(150, 60, 80, 25);
        panel.add(checkButton);

        // Add action listener to the button
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = userText.getText();
                if (isPalindrome(input)) {
                    resultLabel.setText("The number " + input + " is a palindrome.");
                } else {
                    resultLabel.setText("The number " + input + " is not a palindrome.");
                }
            }
        });
    }

    // Method to check if a number is a palindrome
    private static boolean isPalindrome(String number) {
        int length = number.length();
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
