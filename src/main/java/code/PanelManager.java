package code;

import javax.swing.*;
import java.awt.*;

public class PanelManager {

    JFrame frame ;
    JPanel mainPanel;
    CardLayout cardLayout;

    public PanelManager(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        frame.add(mainPanel);

        LoginPage loginPage = new LoginPage(this);
        WelcomePage welcomePage = new WelcomePage(this);
    }

    public void addPanel(JPanel panel, String key){
        mainPanel.add(panel,key);
    }

    public void showPanel(String key){
        cardLayout.show(mainPanel, key);
    }

    public void showFrame(){
        frame.setSize(400,400);
        frame.setVisible(true);
    }

}
