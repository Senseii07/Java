import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Web_App {
    public static void main(String[] args) {
        new SimpleWindow();
    }
}
class SimpleWindow extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JLabel firstNameLabel;
    private JTextField firstNameField;
    private JLabel lastNameLabel;
    private JTextField lastNameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel phoneNumberLabel;
    private JTextField phoneNumberField;
    private JButton submitButton;
    private JLabel messageLabel;

    public SimpleWindow() {
        setSize(500, 500);
        // Use GridBagLayout for flexible control
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(173, 216, 230)); // light blue color
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        firstNameLabel = new JLabel("First Name");
        firstNameField = new JTextField(10);

        lastNameLabel = new JLabel("Last Name");
        lastNameField = new JTextField(10);

        emailLabel = new JLabel("Email");
        emailField =  new JTextField(10);

        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberField = new JTextField(10);

        messageLabel = new JLabel();
        submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(0, 255, 0)); // light color for button
        submitButton.setForeground(Color.BLACK); // text color for button
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(firstNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(firstNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(lastNameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(lastNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(emailLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(phoneNumberLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(phoneNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_END;
        panel.add(submitButton, gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(messageLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;

        String[] columns = {"First Name", "Last Name", "Email", "Phone Number"};
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, gbc);

        add(panel);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstNameValue = firstNameField.getText();
                String lastNameValue = lastNameField.getText();
                String emailValue = emailField.getText();
                String phoneNumberValue = phoneNumberField.getText();
                messageLabel.setText("Hello "+firstNameValue + " "+lastNameValue);
                System.out.println("Hello "+firstNameValue + " "+lastNameValue);
                messageLabel.setText("Hello " + emailValue);
                messageLabel.setText("Hello " + phoneNumberValue);
                System.out.println("submitted successfully");

            }
        });

        setVisible(true);
    }
}