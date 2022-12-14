package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JFormattedTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("UserID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel infoLabel = new JLabel();

    public  static Map<String, String> loginINFO = new HashMap<>();

    LoginPage(Map<String, String> loginInfoOriginal) {
        loginINFO = loginInfoOriginal;

        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        userIdField.setBounds(150, 100, 150, 25);
        userPasswordField.setBounds(150, 150, 150, 25);

        loginButton.setBounds(130, 200, 75, 25);
        //Deleting the square of the word inside the button
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(230, 200, 75, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        infoLabel.setBounds(160, 300, 300, 35);
        infoLabel.setFont(new Font(null, Font.ITALIC, 25));

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(infoLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton) {
            String username = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());


//                              this would be a good method here..
//            isBlank(field){
//                if (field.isBlank()){
//                    infoLabel.setForeground(Color.red);
//                    infoLabel.setText(field + "must be specified");
//                }

            if (username.isBlank() || password.isBlank()) {
                infoLabel.setForeground(Color.red);
                infoLabel.setBounds(60, 300, 300, 35);
                infoLabel.setText("Fields must be specified !");
            }
            else if (loginINFO.containsKey(username) && loginINFO.get(username).equals(password)) {
                infoLabel.setForeground(Color.green);
                infoLabel.setText("Login successful !");
                frame.dispose();
                WelcomePage welcomePage = new WelcomePage();
            } else {
                infoLabel.setForeground(Color.red);
                infoLabel.setText("Wrong info !");
            }
        }
    }
}
