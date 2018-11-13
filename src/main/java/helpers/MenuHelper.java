package helpers;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesObject.Menu;

public class MenuHelper {


    public WebDriver driver;

    public MenuHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void isDashboardChosen() {
        Menu menu = new Menu(driver);

        final String attribute = menu.getDashboardActiveButton().getAttribute("class");
        Assert.assertTrue(attribute.equals("active"));
    }


    public void isDashboardDisplayed() {
        Menu menu = new Menu(driver);
        Assert.assertTrue(menu.getDashboardButton().isDisplayed());
    }

}
