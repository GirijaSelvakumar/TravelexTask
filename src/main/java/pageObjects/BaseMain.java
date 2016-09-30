package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by girija on 29/09/2016.
 */
    public class BaseMain {
        public static WebDriver driver;
        public static String url;
        public static String browser;
        public void openBrowser() throws IOException {
            InputStream is = BaseMain.class.getClassLoader().getResourceAsStream("config.properties");
            Properties prop=new Properties();
            prop.load(is);
            browser=prop.getProperty("browser");
            switch (browser)
            {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver","src\\test\\resources\\geckodriver.exe");
                    driver=new FirefoxDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
                    driver=new ChromeDriver();
                    break;

            }
             url=prop.getProperty("url");
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        public void closeBrowser()
        {

            driver.close();
        }
    }


