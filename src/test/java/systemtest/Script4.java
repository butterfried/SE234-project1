package systemtest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

public class Script4 {

    WebDriver driver;

    @Before
    public void initDriver(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }


    @Test
    public void testScript4() throws InterruptedException {
        String baseUrl = "http://localhost:4200/";

        driver.get(baseUrl + "/login");
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(3000);
        assertEquals("1", driver.findElement(By.cssSelector("td")).getText());
        assertEquals("953331", driver.findElement(By.xpath("//td[2]")).getText());
        assertEquals("CBSD", driver.findElement(By.xpath("//td[3]")).getText());
        assertEquals("2", driver.findElement(By.xpath("//tr[2]/td")).getText());
        assertEquals("953323", driver.findElement(By.xpath("//tr[2]/td[2]")).getText());
        assertEquals("Software Construction", driver.findElement(By.xpath("//tr[2]/td[3]")).getText());
        assertEquals("3", driver.findElement(By.xpath("//tr[3]/td")).getText());
        assertEquals("953499", driver.findElement(By.xpath("//tr[3]/td[2]")).getText());
        assertEquals("Software Project", driver.findElement(By.xpath("//tr[3]/td[3]")).getText());
    }



}
