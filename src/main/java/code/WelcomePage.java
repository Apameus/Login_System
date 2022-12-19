package code;

import javax.swing.*;

public class WelcomePage {
    public static final String KEY = "WelcomePage";
    private JButton backButton;
    private JPanel panel;

    WelcomePage(PanelManager manager){
        manager.addPanel(panel, KEY);
        backButton.addActionListener(e -> {
            manager.showPanel(LoginPage.KEY);
        });

    }
}
