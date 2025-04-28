package tests.Calisma11;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProvider {

    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void testAmazon(String kelimeler) {
        AmazonPage amazonPage = new AmazonPage();

        //Amazon Sayfasına Gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //java, selenium, samsung ve iphone kelimelerini aratalım
        amazonPage.searchBox.sendKeys(kelimeler+ Keys.ENTER);

        //Sonuçların aradığımız kelimeleri içerdiğini test edin
        String actualData = amazonPage.result.getText();
        Assert.assertTrue(actualData.contains(kelimeler));
    }
}
