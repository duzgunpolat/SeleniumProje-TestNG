package tests.Calisma09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.com.tr");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testHepsiburada() {
        driver.get("https://www.Hepsiburada.com");
    }
}
