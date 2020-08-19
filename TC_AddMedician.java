package TestCases;

import org.testng.annotations.Test;
import PageObject.AddMedician;

public class TC_AddMedician extends TC_Login {
    @Test(priority = 4)

    public void AddMedician()
    {
        AddMedician AM=new AddMedician(driver);
        AM.AddMedician();
    }
}
