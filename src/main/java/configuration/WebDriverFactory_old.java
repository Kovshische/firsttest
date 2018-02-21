package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public enum WebDriverFactory_old {

    CHROME {
        public WebDriver create(){
          System.setProperty("webdriver.chrome.driver",Constant.CHROME_DRIVER_HOME_DIRECTORY);
          EventFiringWebDriver chromeEventFiringWebDriver = new  EventFiringWebDriver(new ChromeDriver());
          chromeEventFiringWebDriver.register(new WedDriverLogger());
          return chromeEventFiringWebDriver;
        }
    },
    IE {
        public WebDriver create (){
            System.setProperty("webdriver.ie.driver",Constant.IE_DRIVER_HOME_DIRECTORY);
            EventFiringWebDriver internetExplorerEventFiringWebDriver = new  EventFiringWebDriver(new InternetExplorerDriver());
            internetExplorerEventFiringWebDriver.register(new WedDriverLogger());
            return  internetExplorerEventFiringWebDriver;
        }
    },
    FIREFOX{
        public WebDriver create (){
            System.setProperty("webdriver.gecko.driver",Constant.FIREFOX_DRIVER_HOME_DIRECTORY);
            EventFiringWebDriver fireFoxEventFiringWebDriver = new  EventFiringWebDriver(new FirefoxDriver());
            fireFoxEventFiringWebDriver.register(new WedDriverLogger());
            return fireFoxEventFiringWebDriver;
        }
    };

    public WebDriver create (){
        return null;
    }
}
