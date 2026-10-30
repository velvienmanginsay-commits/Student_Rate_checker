import javax.swing.*;
import java.awt.event.*;
public class ButtonGUI {
   public static void main(String[] args) {
       JFrame frame = new JFrame("Swing Button Example");
       JButton button = new JButton("Click Me");
       button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               System.out.println("Button was clicked!");
           }
       });
       frame.add(button);
       frame.setSize(300, 200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }
}