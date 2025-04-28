package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='sp-cc-accept']")
    public WebElement cokkie;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")
    public WebElement result;

}
