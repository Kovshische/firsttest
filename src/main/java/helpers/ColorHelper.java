package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import pagesObject.ColorTestPage;
import pagesObject.LoginPage;

import java.util.logging.Logger;


// //ul[@id='kolor-options']/li/a[@style='background-color: rgb(63, 200, 100);']



public class ColorHelper extends GeneralHelper {
    private static final String LOG_TAG = ColorHelper.class.getSimpleName();

    private static Logger log = Logger.getLogger(ColorHelper.class.getName());

    public static final String COLOR_PAGE_ADDRESS = "http://kolor.moro.es/";

    private static final String TARGET_COLOR_LOCATOR_1_PART = "//ul[@id='kolor-options']/li/a[@style='";
    private static final String TARGET_COLOR_LOCATOR_3_PART = "']";

    private WebDriver driver;
    private ColorTestPage colorTestPage;

    public ColorHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        colorTestPage = new ColorTestPage(driver);
    }

    public void goToMainPage (){
        driver.get(COLOR_PAGE_ADDRESS);
    }

    public void pressStartButton(){
        click(colorTestPage.getStartButton());
    }

    public void waitUntilStartButtonPresent() throws InterruptedException {
        log.info("7777777");
        Thread.sleep(2000);
    }

    public String getTargetColor (){
        colorTestPage = new ColorTestPage(driver);
        final String color1 = colorTestPage.getTargetColor().getAttribute("background-color");
        final String color = colorTestPage.getTargetColor().getAttribute("style");
        log.info(color);
        return color;
    }

    public void clickOnRightColor(String color){
        colorTestPage = new ColorTestPage(driver);

        String rightColorLocator = color;
        String separator = "; ";
        String [] parts = rightColorLocator.split(separator);
        rightColorLocator = parts[1];

        rightColorLocator = TARGET_COLOR_LOCATOR_1_PART + rightColorLocator + TARGET_COLOR_LOCATOR_3_PART;
        log.info(rightColorLocator);
        WebElement rightColorWebElement = driver.findElement(By.xpath(rightColorLocator));
        click(rightColorWebElement);
    }

    public int getScore(){
        int scoreInt = 0;
        String scoreString;

        scoreString = colorTestPage.getScoreField().getText();
        scoreInt = Integer.parseInt(scoreString);
        log.info(scoreString);
        return scoreInt;
    }




}
