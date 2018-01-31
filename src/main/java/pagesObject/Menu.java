package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    private final WebDriver driver;

    public Menu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//li[@class='active']//a[@href='http://ec2-34-198-2-13.compute-1.amazonaws.com']")
    public WebElement dashboardButton;


    @FindBy(xpath = "//a[@href='http://ec2-34-198-2-13.compute-1.amazonaws.com']")
    public WebElement dashboardButton2;
}
