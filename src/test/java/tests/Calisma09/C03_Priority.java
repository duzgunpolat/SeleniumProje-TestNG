package tests.Calisma09;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C03_Priority extends TestBaseBeforeClassAfterClass {

    //Test adımlarına öncelkiklendirme verir.
    //sayısı en düşük olandan başlar

    @Test(priority = -5)
    public void testAmazon() {
        driver.get("https://www.amazon.com.tr");
    }

    @Test(priority = 100)
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test // Default olarak 0 kabul eder.
    public void testTrendyol() {
        driver.get("https://www.trendyol.com");
    }

    @Test(priority = 3)
    public void testHepsiburada() {
        driver.get("https://www.Hepsiburada.com");
    }
}
