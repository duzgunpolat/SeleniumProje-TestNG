package tests.Calisma11;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void testAll() throws IOException {
        //Hepsi burada sayfasına gidelim.
        Driver.getDriver().get("https://www.hepsiburada.com");

        //Sayfanın resmini alalım.
        ReusableMethods.getScreenshot("Hepsiburada sitesinin tüm ekran resmi");
        //Sayfayı kapatalım.
        Driver.closeDrive();
    }

    @Test
    public void testWebElement() throws IOException {
        AmazonPage amazonPage = new AmazonPage();

        //Amazon'un web sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // ReusableMethod, kullanarak 1 sn bekle
        ReusableMethods.wait(1);
        //Except Cokkie
        amazonPage.cokkie.click();
        //Iphone, aratalım
        amazonPage.searchBox.sendKeys("Iphone"+Keys.ENTER);

        //Arama sonuc yazisi WebElement resmini alalım.
        ReusableMethods.getScreenshotWebElement("Web elementin ekran görüntüsü",amazonPage.result);
    }
}
