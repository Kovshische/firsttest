package configuration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.File;
import java.io.IOException;

public class WedDriverLogger implements WebDriverEventListener {

    private static final Logger LOG = LogManager.getLogger(WedDriverLogger.class);

    public void beforeAlertAccept(WebDriver webDriver) {
        LOG.info("Now your alert will be accept");
    }

    public void afterAlertAccept(WebDriver webDriver) {
        LOG.info("You alert accepted");
    }

    public void afterAlertDismiss(WebDriver webDriver) {
        LOG.info("You alert dismissed");
    }

    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    public void beforeNavigateTo(String s, WebDriver webDriver) {

    }

    public void afterNavigateTo(String s, WebDriver webDriver) {

    }

    public void beforeNavigateBack(WebDriver webDriver) {

    }

    public void afterNavigateBack(WebDriver webDriver) {

    }

    public void beforeNavigateForward(WebDriver webDriver) {

    }

    public void afterNavigateForward(WebDriver webDriver) {

    }

    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        LOG.info("You element fined");
    }

    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {

    }

    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        LOG.info("Your element clicked");
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    public void beforeScript(String s, WebDriver webDriver) {

    }

    public void afterScript(String s, WebDriver webDriver) {

    }

    public void onException(Throwable throwable, WebDriver webDriver) {
        WebDriver driver = webDriver;
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
        try {
            FileUtils.copyFile(scrFile, new File("src/main/temp/screenshort.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
