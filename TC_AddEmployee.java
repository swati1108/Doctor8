package TestCases;

import org.testng.annotations.Test;
import PageObject.AddEmployee;

public class TC_AddEmployee extends  TC_Login{
    @Test(priority = 2)
    public  void AddEmployee() throws InterruptedException {
        AddEmployee AE=new AddEmployee(driver);
        AE.AddEmp();
    }

}
