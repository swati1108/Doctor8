package TestCases;

import  PageObject.Login;
import org.testng.annotations.Test;
import  TestCases.TC_Login;



public class TC_Login extends TC_BaseClass{
    @Test(priority=1)
    public  void Login()
    {
        driver.get(url);
        Login lp=new Login(driver);
        lp.setUserName(usernamee);
        lp.setPassword(passwordd);
        lp.btnLogin();

    }

}
