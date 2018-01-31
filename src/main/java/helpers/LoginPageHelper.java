package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageHelper {

    private final WebDriver driver;

    //Loin credentials:
    public static final String RIGHT_EMAIL = "admin@iroofing.org";
    public static final String PASSWORD = "aPPlicasa1981aPPlosophy";
    private static final String INCORRECT_PASSWORD = "777";

    public LoginPageHelper(WebDriver driver){
        this.driver = driver;
    }

    public static void typeToElement (WebElement element, String message) {
        element.sendKeys(message);
    }

    public static void click (WebElement element){
        element.click();
    }
}
