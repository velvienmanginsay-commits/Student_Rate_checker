import javax.swing.*;
import java.awt.*;

public class jlabel {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JLabel and JTextField");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel("Enter your name:");

        // JTextField
        JTextField textField = new JTextField(20);

        // JButton
        JButton button = new JButton("Submit");

        // Result Label
        JLabel result = new JLabel("");

        // Button Action
        button.addActionListener(e -> {
            String name = textField.getText();
            result.setText("Hello, " + name + "!");
        });

        // Add components
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

