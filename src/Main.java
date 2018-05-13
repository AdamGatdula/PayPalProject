import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    private static WebDriver driver;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\automiton\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        //driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        options.addArguments("-incognito");
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.get("https://www.paypal.com/il/webapps/mpp/merchant?locale.x=en_IL&gclid=Cj0KCQjw8YXXBRDXARIsAMzsQuUUWnYsGJf8kMKqWFg5qrEjsNPiTtB8kM9X5IBz9s6PW-iMaEjPUMwaAqz5EALw_wcB&gclsrc=aw.ds&dclid=CILAhf-42NoCFS-HUQodq0kM_g");
        }
    @Test
    public void Registration()throws AWTException{
        RegistrationScreen.SignupButton(driver).click();
        RegistrationScreen.Continue(driver).click();
        //RegistrationScreen.Nation(driver).click();
        //RegistrationScreen.Nation(driver).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.id(Constant.EMAIL)).sendKeys("adam.gatdula2836@gmail.com");
        driver.findElement(By.id(Constant.PASSWORD)).sendKeys("adamgatdula8!");
        driver.findElement(By.id(Constant.REPASSWORD)).sendKeys("adamgatdula8!");



    }
}