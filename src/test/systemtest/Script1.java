/**
 * Created by l3Jmax on 5/15/2017.
 */
public class Script1 {
    driver.get(baseUrl + "/noom");
    assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());

    driver.get(baseUrl + "/nay");
    assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());

    driver.get(baseUrl + "/noom");
    assertEquals("The resource you have asked is not in the server", driver.findElement(By.cssSelector("h2")).getText());


}
