package tests.Calisma10;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_FacebookPageClass {

    Faker faker;
    // Baska "Test annotation" larda da kullanacağımız için class seviyesinde oluşturduk

    @Test
    public void test() throws InterruptedException {

        //FacebookPaga deki locatelere ulaşmak için Facebook Objesi oluşturduk
        FacebookPage facebookPage = new FacebookPage();

        //facebook adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        //POM'a uygun olarak email,şifre ve giriş yap alanlarını locate edip Faker class ında yazalım.
        faker = new Faker();

        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.login.click();

        //Başarılı bir giriş yapılamadığını test edelim.
        Thread.sleep(1500);
        Assert.assertTrue(facebookPage.basarisizDeneme.isDisplayed());

        //Sayfayı kapatalım
        Thread.sleep(1500);
        Driver.closeDrive();
    }
}
