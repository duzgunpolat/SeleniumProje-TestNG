package tests.Calisma11;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_WindowHandleReusableMethod {
    @Test
    public void test() {
        //herokuapp sitesine gidelim
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        //Acilan sayfa da "Click Here" butonuna tıklayın.
        ReusableMethods.wait(2);
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();

        //Acılan yeni sekmede title'ın "New Window" olduğunu test edin.
        ReusableMethods.switchToWindow("New Window"); // geçiş yapmak istediğimiz sayfanın title'ı
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle); //Doğrulama için yazarız

        ReusableMethods.waitFor(2);
        Driver.quitDriver();
    }
}
