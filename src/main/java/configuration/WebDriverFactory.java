package configuration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverFactory {
    public static EventFiringWebDriver driver;
    public static final String CHROME = "CHROME";
    public static final String FIREFOX = "FIREFOX";
    public static final String IE = "IE";
    public static final String HUB = "http://localhost:4444/wd/hub";


    private static final ThreadLocal<EventFiringWebDriver> DRIVER_THREAD_LOCAL = new InheritableThreadLocal<>();

    public static ThreadLocal<EventFiringWebDriver> getDriver(String name) throws MalformedURLException {

        if (FIREFOX.equalsIgnoreCase(name)){
            System.setProperty("webdriver.gecko.driver",Constant.FIREFOX_DRIVER_HOME_DIRECTORY);
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();

            EventFiringWebDriver firefoxEventFiringWebDriver = new EventFiringWebDriver(new RemoteWebDriver(new URL(HUB),capabilities));
            firefoxEventFiringWebDriver.register(new WedDriverLogger());
            DRIVER_THREAD_LOCAL.set(firefoxEventFiringWebDriver);
        }

        else if (CHROME.equalsIgnoreCase(name)){
            System.setProperty("webdriver.chrome.driver",Constant.CHROME_DRIVER_HOME_DIRECTORY);
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            EventFiringWebDriver chromeEventFiringWebDriver = new  EventFiringWebDriver(new RemoteWebDriver(new URL(HUB), capabilities));
            chromeEventFiringWebDriver.register(new WedDriverLogger());
            DRIVER_THREAD_LOCAL.set(chromeEventFiringWebDriver);
        }

        else if (IE.equalsIgnoreCase(name)){

        }

        return DRIVER_THREAD_LOCAL;
    }


}

