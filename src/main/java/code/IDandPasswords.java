package code;

import java.util.HashMap;
import java.util.Map;

public class IDandPasswords {
    static Map <String, String> loginInfo = new HashMap();
    IDandPasswords(){
        loginInfo.put("Ioannis","Ioannis123");
        loginInfo.put("Ilias","Ilias123");
        loginInfo.put("Apameus","Apameus123");
    }
    public Map getInfo(){
        return loginInfo;
    }
}
