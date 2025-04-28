package tests.Calisma10;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AloTechPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SmokeNegatifTest {

    AloTechPage aloTechPage = new AloTechPage();
    //Locateleri tuttuğumuz aloTechPage sayfasının objesi oluşturulur.
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void yanlisKullanici() throws InterruptedException {
        //aloTech adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("aloTechUrl"));
        Thread.sleep(1000);
        //email, password, login elementlerini locate ediniz
        aloTechPage.email.sendKeys(ConfigReader.getProperty("WrongUser"));
        Thread.sleep(1000);
        aloTechPage.password.sendKeys(ConfigReader.getProperty("Password"));
        Thread.sleep(1000);
        actions.doubleClick(aloTechPage.login);

        //Degerleri girildiğinde sayfanın girilemediğini test edin
        Assert.assertTrue(aloTechPage.failedLogin.isDisplayed());

        //Sayfayı kapatın
        Driver.closeDrive();

    }
    @Test
    public void yanlisSifre() {


    }
    @Test
    public void yanlisKullaniciVeSifre() {


    }


}
