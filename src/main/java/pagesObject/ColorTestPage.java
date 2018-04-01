package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ColorTestPage extends BasePage {
    public ColorTestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath= "//button[@id='kolor-start']" )
    public WebElement startButton;


    public WebElement getStartButton() {
        return startButton;
    }

    @FindBy (xpath= "//div[@id='kolor-kolor']" )
    public WebElement targetColor;

    public WebElement getTargetColor() {
        return targetColor;
    }

    @FindBy (xpath= "//ul[@id='kolor-options']" )
    public WebElement chosenColor;

    @FindBy (xpath = "//strong[@id='kolor-score']")
    public WebElement scoreField;

    public WebElement getScoreField(){
        return scoreField;
    }



}
