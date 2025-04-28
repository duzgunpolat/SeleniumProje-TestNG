package tests.Calisma10;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverFirstTest {
    @Test
    public void testFirstCheck() throws InterruptedException {
        Driver.getDriver().get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.closeDrive();

        Driver.getDriver().get("https://www.hepsiburada.com");
        Driver.closeDrive();
    }
}
