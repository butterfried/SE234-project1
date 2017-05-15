package systemtest;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

/**
 * Created by GL552J on 14/5/2560.
 */
public class Script1 {

    WebDriver driver;

    @Before
    public void initDriver(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testScript1() throws InterruptedException {
        String baseUrl = "http://localhost:4200/";

        driver.get(baseUrl + "/noom");
        Thread.sleep(1500);
        assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());

        driver.get(baseUrl + "/nay");
        Thread.sleep(1500);
        assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());

        driver.get(baseUrl + "/max");
        Thread.sleep(1500);
        assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());
    }
}