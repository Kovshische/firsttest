package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralHelper {

    public static final String DOMAIN =  "http://ec2-34-235-10-165.compute-1.amazonaws.com";
    public static final String MANUFACTURER_ID =  "/10052";


    private final WebDriver driver;

    public GeneralHelper(WebDriver driver) {
        this.driver = driver;
    }

    public static void typeToElement (WebElement element, String message) {
        element.sendKeys(message);
    }

    public static void click (WebElement element){
        element.click();
    }

    public static void chooseFromDropBox (WebElement elementDropBox, WebElement elementToChose){
        elementDropBox.click();
        elementToChose.click();
    }
}
