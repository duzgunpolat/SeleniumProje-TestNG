package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AloTechPage {
    public AloTechPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='login-login-email-input']")
    public WebElement email;

    @FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1s09ub6']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='login-login-loginform-form-submit-button']")
    public WebElement login;

    @FindBy(xpath = "//*[@class='LoginLayout_LoginTemplate_Title__2jTDU MuiBox-root css-0']")
    public WebElement failedLogin;
}
