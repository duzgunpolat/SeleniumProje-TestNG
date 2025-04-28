package tests.Calisma11;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C05_DataProvider extends TestBaseRapor {

    @DataProvider
    public static Object[][] LoginTest() {
        return new Object[][]{{"user@gmail.com","12345"},{"user1@gmail.com","123451"},{"user2@gmail.com","123454"}};
    }

    @Test(dataProvider = "LoginTest")
    public void test(String mail,String password) {
        BrcPage brcPage = new BrcPage();
        extentTest = extentReports.createTest("login test","giriş sayfasının doğrulanması");

        //blueCar adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue Rent A Car Sitesine Gidildi");

        //login butonuna bas
        brcPage.loginFirst.click();
        extentTest.info("Giriş Login Butonuna Basıldı");

        //Data provider kullanarak 3 farklı email ve password ile giriş yap.
        brcPage.email.sendKeys(mail);
        brcPage.pass.sendKeys(password);

        //Login butonuna tıklayın
        brcPage.loginButton.click();

    }
}
