package tests.Calisma09;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C04_DependsOnMethods extends TestBaseBeforeClassAfterClass {

    @Test
    public void testAmazon1() throws InterruptedException {
        //amazon ana sayfasına gidin
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-accept']")).click();
    }
    @Test(dependsOnMethods = "testAmazon1")
    public void testAmazon2() {
        //Iphone, kelimesini aratın
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);
    }
    @Test(dependsOnMethods = "testAmazon2")
    public void testAmazon3() {
        //Sonuc yazisinin amazon içerdiğini test edin
        WebElement resualt = driver.findElement(By.xpath("//*[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        Assert.assertTrue(resualt.getText().contains("Iphone"));
    }
}
