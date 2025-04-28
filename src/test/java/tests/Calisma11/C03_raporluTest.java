package tests.Calisma11;

import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_raporluTest extends TestBaseRapor {

    @Test
    public void test(){
        BrcPage brcPage = new BrcPage();

        extentTest = extentReports.createTest("login test","giriş sayfasının doğrulanması");
        //Blue Rent Car sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue Rent A Car Sitesine Gidildi");

        //Login botonuna bas
        brcPage.loginFirst.click();
        extentTest.info("Giriş Login Butonuna Basıldı");

        //email ve pass bilgilerini girip Login butonuna basalım
        brcPage.email.sendKeys(ConfigReader.getProperty("brcUser"));
        extentTest.info("email adresi Girildi");

        brcPage.pass.sendKeys(ConfigReader.getProperty("brcPass"));
        extentTest.info("Password adresi Girildi");

        brcPage.loginButton.click();
        extentTest.info("Login Butonuna Basıldı");

        extentTest.pass("Siteye Başarılı Bir Şekilde Giriş Yapıldı");
    }
}
