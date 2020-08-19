package TestCases;

import org.testng.annotations.Test;
import PageObject.AddDepartment;

public class TC_AddDepartment extends  TC_Login {
    @Test(priority = 3)

    public void AddDepartment()
    {
        AddDepartment AD=new AddDepartment(driver);
        AD.AddDept();
        AD.EditDept();
    }
}
