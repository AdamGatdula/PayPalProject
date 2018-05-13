import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationScreen {
    private static WebElement element = null;
    public static WebElement SignupButton(WebDriver driver) {
        element = driver.findElement(By.id("signup-button"));
        return element;
    }

    private static WebElement element1 = null;
    public static WebElement Continue(WebDriver driver) {
        element1 = driver.findElement(By.id("cta-btn"));
        return element1;
    }
    private static WebElement element2 = null;
    public static WebElement Nation(WebDriver driver) {
        element2 = driver.findElement(By.id("country"));
        return element2;
    }
    private static WebElement element3 = null;
    public static WebElement Continu2(WebDriver driver){
        element3 = driver.findElement(By.id("_eventId_personal"));
        return element3;
    }
}