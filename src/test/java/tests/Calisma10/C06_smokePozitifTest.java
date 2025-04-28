package tests.Calisma10;

import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_smokePozitifTest {

    BrcPage brcPage = new BrcPage();

    @Test
    public void pozitifTest() throws InterruptedException {
        //Araç kiralama sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        //Login ol, butonuna tıklayalım
        brcPage.loginFirst.click();
        Thread.sleep(1000);

        //email ve pass bilgilerini otomatize edelim
        brcPage.email.sendKeys(ConfigReader.getProperty("brcUser"));
        brcPage.pass.sendKeys(ConfigReader.getProperty("brcPass"));
        Thread.sleep(1000);

        //Siteye Login olalım
        brcPage.loginButton.click();
        Thread.sleep(2000);

      //  Driver.closeDrive();
    }
}
