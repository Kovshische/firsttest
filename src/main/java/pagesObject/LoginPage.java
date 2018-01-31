package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    /*
        @FindBy(id = "android.webkit.WebView")
        private WebElement endUserAgreementWebView;
     */

    @FindBy(xpath = "//*[@id=\"user_email\"]")
    public WebElement loginField;

    @FindBy(xpath = "//input[@id='password']" )
    public WebElement passField;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;
}
