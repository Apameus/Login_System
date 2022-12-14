package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome");
    JButton logoutButton = new JButton("Logout");

    WelcomePage(){

        welcomeLabel.setBounds(140,20,200,35);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,25));

        logoutButton.setBounds(150,300,100,25);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(this);

        frame.setSize(420,420);
        frame.add(welcomeLabel);
        frame.add(logoutButton);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

//              .Failed Trial.
//  *With ActionEvent e as a parameter in the constructor
//        if (e.getSource() == logoutButton){
//            LoginPage loginPage = new LoginPage(LoginPage.loginINFO);
//        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton){
            LoginPage loginPage = new LoginPage(LoginPage.loginINFO);
            frame.dispose();
        }
    }
}
