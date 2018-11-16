package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralHelper implements Environment {




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

    public static void sendKeys (WebElement element, String string){
        element.sendKeys(string);
    }

    public static void chooseFromDropBox (WebElement elementDropBox, WebElement elementToChose){
        elementDropBox.click();
        elementToChose.click();
    }
}
