package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

/**
 * Created by girija on 29/09/2016.
 */
public class TravelexPage extends BaseMain {
    public void assertHomePage()
    {
        String actualTitle=driver.getTitle();
        Assert.assertEquals("Currency Exchange | Buy Travel Money | Travelex",actualTitle);
    }
    public void resizeWindow(int width)
    {
        int height=550;
        Dimension dimension=new Dimension(width,height);
        driver.manage().window().setSize(dimension);
    }
    public void navigateToThirdSlide() throws InterruptedException {
        List<WebElement> sliders=driver.findElements(By.className("slick-dots"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,400)", "");
        if(browser.equals("firefox") || (browser == "firefox"))
        {
            for(WebElement slider: sliders){
                for(int i=0;i<=2;i++) {
                    slider.sendKeys(Keys.ARROW_RIGHT);
                    Thread.sleep(500);
                }
            }
        }
        else {
            Actions slideRight = new Actions(driver);
            for (WebElement slider : sliders) {
                slideRight.click(slider).build().perform();
                Thread.sleep(1000);
                for (int i = 0; i <= 2; i++) {
                    slideRight.sendKeys(Keys.ARROW_RIGHT).build().perform();
                    Thread.sleep(500);
                }
            }
        }
    }
    public void assertThirdSlide(String slideName)
    {
        String actualSlideName=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/section[2]/article/div[1]/div/div/div[3]/div/h4/span/a")).getText();
        Assert.assertEquals(slideName,actualSlideName);


    }

}
