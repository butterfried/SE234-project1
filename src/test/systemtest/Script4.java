/**
 * Created by l3Jmax on 5/15/2017.
 */
public class Script4 {
    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
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
