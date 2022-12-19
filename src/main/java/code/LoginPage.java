package code;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class LoginPage {
    public static final String KEY = "LoginForm";
    private JPanel mainPanel;
    private JPanel panel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel buttonsPanel;
    private JButton loginButton;
    private JButton resetButton;
    private JLabel userIdLabel;
    private JLabel passwordIdLabel;
    private JLabel infoLabel;
    private IDandPasswords iDandPasswords = new IDandPasswords();


    public LoginPage(PanelManager manager){
        manager.addPanel(panel, KEY);
        resetButton.addActionListener(e -> {
            usernameField.setText("");
            passwordField.setText("");
        });
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            Map info = iDandPasswords.getInfo();
            if (username.isBlank() || password.isBlank()){
                showError("Text fields cannot be empty!");
            }
            else if (info.containsKey(username)){
                if (info.get(username).equals(password)){
                    //success
                    manager.showPanel(WelcomePage.KEY);
                }
                else {
                    showError("Wrong password!");
                }
            }
            else {
                showError("Invalid username!");
            }
        });
    }

    private void showError(String text) {
        infoLabel.setForeground(Color.red);
        infoLabel.setText(text);
    }


}
