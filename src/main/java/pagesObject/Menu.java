package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu extends BasePage {

//#kolor-options > li:nth-child(1) > a
    // //*[@id="kolor-options"]/li[1]/a



    public Menu(WebDriver driver) {
        super(driver);
    }

    public WebElement getDashboardButton() {
        return dashboardButton;
    }

    @FindBy(xpath = "//a[@href='http://ec2-34-198-2-13.compute-1.amazonaws.com']")
    private WebElement dashboardButton;

    public WebElement getDashboardActiveButton() {
        return dashboardActiveButton;
    }

    @FindBy(xpath = "//a[@href='http://ec2-34-198-2-13.compute-1.amazonaws.com']/ancestor::li")
    private WebElement dashboardActiveButton;
}
