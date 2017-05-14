/**
 * Created by l3Jmax on 5/15/2017.
 */
public class Script3 {
    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    assertTrue(isElementPresent(By.linkText("Add Course")));

    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("user");
    driver.findElement(By.id("password")).sendKeys("user");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    assertFalse(isElementPresent(By.linkText("Add Course")));


}
