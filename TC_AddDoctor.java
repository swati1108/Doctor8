package TestCases;

import org.testng.annotations.Test;
import PageObject.AddDoctor;

public class TC_AddDoctor extends TC_Login{
    @Test(priority = 5)
    public void AddDoctor() throws InterruptedException {
        AddDoctor AD=new AddDoctor(driver);
        AD.AddDoctor();

    }
}
