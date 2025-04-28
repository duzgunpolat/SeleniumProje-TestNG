package tests.Calisma09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C05_HardAssert extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void test() throws InterruptedException {
        //amazon ana sayfasına gidin
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-accept']")).click();

        //Title'ın "Amazon" içerdiğini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));

        //Arama kutusunun erişilebilir olduğunu test edin
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        Assert.assertTrue(aramaKutusu.isEnabled());

        //Arama kutusuna "Iphone" yazıp gönderelim
        aramaKutusu.sendKeys("Iphone", Keys.ENTER);

        //Arama yapıldığını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        Assert.assertTrue(sonuc.isDisplayed());

        //Arama sonucunun Iphone içerdiğini test edin.
        Assert.assertTrue(sonuc.getText().contains("Iphone"));

    }
}
