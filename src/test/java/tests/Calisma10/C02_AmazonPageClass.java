package tests.Calisma10;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_AmazonPageClass {

    @Test
    public void testAmazon() {
        AmazonPage amazonPage = new AmazonPage();
        //amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazunUrl"));

        //çerezleri kabul et seçeneğine tıklayınız
        amazonPage.cokkie.click();

        //Selenium kelimesini arama
        amazonPage.searchBox.sendKeys("Selenium",Keys.ENTER);

        //Sonuç yazısının "Selenium" içerdiğini test edin
        String expectedDate = "Selenium";
        String actualData = amazonPage.result.getText();

        Assert.assertTrue(actualData.contains(expectedDate));
        Driver.closeDrive();
    }
}
