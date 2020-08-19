package TestCases;

import org.testng.annotations.Test;
import PageObject.DoctorSchdule;

public class TC_DoctorSchedule extends TC_Login {


        @Test(priority = 7)
        public  void DoctorSchdule()
        {
            DoctorSchdule DS=new   DoctorSchdule(driver);
            DS.DoctorSchdule();
        }
}
