package code;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        IDandPasswords iDandPasswords = new IDandPasswords();


        LoginPage loginPage = new LoginPage(iDandPasswords.getInfo());
    }
}