/**
 * Created by l3Jmax on 5/15/2017.
 */
public class Script4 {
    driver.get(baseUrl + "/login");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.0.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.1.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.1.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.1.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.2.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.2.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.2.2 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.3.0 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.3.1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getTable | css=table.table.3.2 | ]]

}
