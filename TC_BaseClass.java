package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.net.URL;

public class TC_BaseClass {
    public String url ="http://app.doctor8.in/";
    public String usernamee = "9421444999";
    public String passwordd = "1234";
    public static WebDriver driver;

    @Test

    public void setup() {


        //if (browsername.equalsIgnoreCase("firefox")) {
      /*  DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "72.0");
        capabilities.setCapability("platform", "win8"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("build", "TestNG_login_1");
        capabilities.setCapability("name", "TestNG_login_1");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs
        try {

            String auth_key;
            String username;
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + auth_key + URL), capabilities);

        } catch (Exception e) {

            System.out.println("Invalid grid URL" + e.getMessage());
        }*/
        System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Loginpage\\Driver\\ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }


}
