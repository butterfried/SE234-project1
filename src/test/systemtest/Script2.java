/**
 * Created by l3Jmax on 5/15/2017.
 */
public class Script2 {
    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("filled");
    driver.findElement(By.id("password")).sendKeys("filled");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    assertEquals("Unauthorized", driver.findElement(By.cssSelector("div.alert.alert-error")).getText());

    driver.get(baseUrl + "/login");
    driver.findElement(By.id("password")).sendKeys("filled");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    assertEquals("Username is required", driver.findElement(By.cssSelector("span.help-block")).getText());

    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("filled");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    assertEquals("Password is required", driver.findElement(By.cssSelector("span.help-block")).getText());

    driver.get(baseUrl + "/login");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    assertEquals("Username is required", driver.findElement(By.cssSelector("span.help-block")).getText());
    assertEquals("Password is required", driver.findElement(By.xpath("//div[2]/span")).getText());


}
