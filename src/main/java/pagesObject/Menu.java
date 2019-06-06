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

    //Dashboard Button
    public WebElement getDashboardButton() {
        return dashboardButton;
    }

    @FindBy(xpath = "//a[@href='http://ec2-34-235-10-165.compute-1.amazonaws.com']")
    private WebElement dashboardButton;



//    @FindBy(xpath = "//a[@href='http://ec2-34-235-10-165.compute-1.amazonaws.com']")
    @FindBy(xpath = "//a[@href='http://ec2-34-235-10-165.compute-1.amazonaws.com']/ancestor::li")
    private WebElement dashboardActiveButton;

    public WebElement getDashboardActiveButton() {
        return dashboardActiveButton;
    }

    //Contractor Button
    public WebElement getContractorButton(){
        return contractorButton;
    }
    @FindBy(xpath = "")
    private WebElement contractorButton;


}
