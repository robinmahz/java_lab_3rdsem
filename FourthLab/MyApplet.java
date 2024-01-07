import java.awt.*;
import java.awt.event.*;
/**
 * MyApplet
 */
public class MyApplet extends Frame implements ActionListener{

    TextField textfield;
    Button button1;
    Button button2;

    MyApplet(){
        setBackground(Color.BLACK);
        //text field
        textfield = new TextField();
        textfield.setBounds(50,100,150,20);
        textfield.setBackground(Color.BLACK);
        textfield.setForeground(Color.green);
        add(textfield);
        //buttons
        button1 = new Button("Click me");
        button2 = new Button("Change text");
        button1.setBounds(50,50,80,30);
        button2.setBounds(50,140,80,30);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button1.setBackground(Color.BLACK);
        button2.setBackground(Color.BLACK);
        button1.setForeground(Color.GREEN);
        button2.setForeground(Color.GREEN);
        add(button1);
        add(button2);
        //Margins
        setSize(300, 200); // Set the size of the frame;
        setLayout(null); // Set layout to null for absolute positioning
        setVisible(true);
    }
    public static void main(String[] args) {
        MyApplet appletObj = new MyApplet();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1){
			textfield.setText("Play game during class");
			System.out.println("hello");
		}
		else if (e.getSource()== button2) {
			textfield.setText("Very bad");
			System.out.println("bieeeeeeee");
		}
    }
}