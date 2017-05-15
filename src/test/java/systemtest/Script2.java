package systemtest;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by l3Jmax on 5/15/2017.
 */
public class Script2 {

    WebDriver driver;

    @Before
    public void initDriver(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testScript2() throws InterruptedException {
        String baseUrl = "http://localhost:4200/";

        driver.get(baseUrl + "/login");
        driver.findElement(By.id("username")).sendKeys("filled");
        driver.findElement(By.id("password")).sendKeys("filled");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(1500);
        assertEquals("Unauthorized", driver.findElement(By.cssSelector("div.alert.alert-error")).getText());

        driver.get(baseUrl + "/login");
        driver.findElement(By.id("password")).sendKeys("filled");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(1500);
        assertEquals("Username is required", driver.findElement(By.cssSelector("span.help-block")).getText());

        driver.get(baseUrl + "/login");
        driver.findElement(By.id("username")).sendKeys("filled");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(1500);
        assertEquals("Password is required", driver.findElement(By.cssSelector("span.help-block")).getText());

        driver.get(baseUrl + "/login");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(1500);
        assertEquals("Username is required", driver.findElement(By.cssSelector("span.help-block")).getText());
        assertEquals("Password is required", driver.findElement(By.xpath("//div[2]/span")).getText());
    }


}
