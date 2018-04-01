package ua.org.mwdn;

import configuration.WebDriverFactory;
import helpers.ColorHelper;
import helpers.LoginPageHelper;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pagesObject.ColorTestPage;

import java.net.MalformedURLException;



public class ColorTest {


    public static WebDriver driver;

    public static ColorHelper colorHelper;
    public static ColorTestPage colorTestPage;

    @BeforeMethod
    public void setDriver () throws MalformedURLException{
        driver = WebDriverFactory.getDriver(WebDriverFactory.CHROME).get();

        colorHelper = new ColorHelper(driver);
        colorTestPage = new ColorTestPage(driver);
    }

    @Test
    public void test1000Score() throws InterruptedException {
        int score = 0;
        int targetScore = 1000;

        colorHelper.goToMainPage();
        colorHelper.waitUntilStartButtonPresent();
        colorHelper.pressStartButton();

        while (score < targetScore){
            String rightColor = colorHelper.getTargetColor();
            colorHelper.clickOnRightColor(rightColor);
            score = colorHelper.getScore();
        }
    }

    @AfterMethod
    public void closeChrome(){
//        driver.quit();
    }


}
