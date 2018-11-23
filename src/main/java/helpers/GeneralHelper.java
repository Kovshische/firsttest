package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GeneralHelper implements Environment {

    private final WebDriver driver;
    private WebDriverWait webDriverWait;
    private Actions actions;


    public GeneralHelper(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 10);
        this.actions = new Actions(driver);
    }


    public static void typeToElement (WebElement element, String message) {
        element.clear();
        element.sendKeys(message);
    }


    public static void click (WebElement element){
        element.click();
    }

    public  void waitUntilElementPresent (WebElement element){
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public void moveAndClick (WebElement element){
//       actions = new Actions(driver);
       actions.moveToElement(element).click().perform();
    }

    public static void isElementPresent(WebElement element){
        Assert.assertTrue(element.isDisplayed());
    }

    public static void sendKeys (WebElement element, String string){
        element.sendKeys(string);
    }

}
