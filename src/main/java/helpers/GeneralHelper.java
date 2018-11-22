package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralHelper implements Environment {

    private final WebDriver driver;
    private WebDriverWait webDriverWait;


    public GeneralHelper(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 10);
    }


    public static void typeToElement (WebElement element, String message) {
        element.clear();
        element.sendKeys(message);
    }


    public static void click (WebElement element){
        element.click();
    }

    public  void waitUntilElementPresent (WebElement element){
        // webDriverWait.until(ExpectedConditions.visibilityOf(createShapePopUp.shapeNameField));
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void sendKeys (WebElement element, String string){
        element.sendKeys(string);
    }

}
