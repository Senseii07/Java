import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ClassName extends JFrame {
    private JLabel message;
    private JTextField kilometers;
    private JButton calButton;
    private JLabel feet;
    private JTextField messageField;


    public ClassName(){
        setSize(720, 1080);
        setLayout(new FlowLayout());

        message = new JLabel("Write Your message here.\n");
        messageField = new JTextField(10);

        kilometers = new JTextField(10);
        calButton = new JButton("Next");
        feet = new JLabel("In Feet\n");

        calButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                String messageValue = messageField.getText();
                System.out.println("Button Clicked\n" + messageValue);
            }
        });

        add(message);
        add(messageField);
        add(calButton);
        add(kilometers);
        add(feet);
        

        setVisible(true);
    }
}
