package SeventhLab;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Layoutforexam
 */
public class Layoutforexam {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
 
        JLabel label1 = new JLabel("Email");
        JLabel label2 = new JLabel("Password");


        JLabel successLabel = new JLabel("");
        JDialog successDialog = new JDialog(frame, "Hellow");
        
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();

        JCheckBox checkbox = new JCheckBox("Accept all terms and conditons");
        
        ButtonGroup G1 = new ButtonGroup();
        JRadioButton radioButton = new JRadioButton("here");
        JRadioButton radioButton2 = new JRadioButton("there");
        
        G1.add(radioButton);
        G1.add(radioButton2);
        
        JButton btn = new JButton("login");
        
        // Add vertical space between components
        
        panel.add(successLabel);
        
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(radioButton2);
        panel.add(radioButton);
        panel.add(checkbox);

        panel.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = field1.getText();
                String password = field2.getText();
                if (checkbox.isSelected()) {

                successLabel.setText(email+' '+password);
                }
                else{
                    successLabel.setText("Check all the conditions first");
                }
                successDialog.add(successLabel);
                successDialog.setSize(100, 100);
                successDialog.setVisible(true);
            }
        }
        );

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

}
}