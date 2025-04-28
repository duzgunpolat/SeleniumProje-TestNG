package tests.Calisma09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C06_SoftAssert extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test() throws InterruptedException {
        //SoftAssert kullanabilmemiz için kütüphaneden faydalanmalıyız.
        SoftAssert softAssert = new SoftAssert();
        //oluşturduğumuz bu objeyi her adım da çağırmalıyız

        //amazon ana sayfasına gidin
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-accept']")).click();

        //Title'ın "Amazon" içerdiğini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Girdiğiniz kelimeyi içermemektedir.");

        //Arama kutusunun erişilebilir olduğunu test edin
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"aradığınız web elemente erişilememektedir.");

        //Arama kutusuna "Iphone" yazıp gönderelim
        aramaKutusu.sendKeys("Iphone", Keys.ENTER);

        //Arama yapıldığını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"arama yapılamadı");

        //Arama sonucunun Iphone içerdiğini test edin.
        softAssert.assertTrue(sonuc.getText().contains("Iphone"),"sonuç metni arattığınız kelimeyi içermiyor");

        // softAssert'ü kullandıktan sonra bitirmezsek çalışmayacak.
        softAssert.assertAll();

        System.out.println("Eğer sistemde bir hata varsa bu yazı okunmayacak");
    }
}
