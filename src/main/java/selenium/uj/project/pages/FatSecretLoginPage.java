package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FatSecretLoginPage extends DefaultPage {

    @FindBy(xpath = "//*[@id=\"Form1\"]/div[5]/div/div/div[3]/p[2]/a")
    private WebElement loginRedirect;

    @FindBy(id = "ctl08_Logincontrol2_Name")
    private WebElement loginField;

    @FindBy(id = "ctl08_Logincontrol2_Password")
    private WebElement passwordField;

    @FindBy(id = "ctl08_Logincontrol2_LoginButton")
    private WebElement submitButton;

    @FindBy(xpath = "//html/body/form/div[3]/div/div/a[3]")
    private WebElement logoutButton;



    public FatSecretLoginPage clickRedirect() {
        clickElement(loginRedirect);
        return this;
    }

    public FatSecretLoginPage fillLoginForm(String email, String password) {
        fillElement(loginField, email);
        fillElement(passwordField, password);
        return this;
    }

    public FatSecretLoginPage submitLoginForm() {
        clickElement(submitButton);
        return new FatSecretLoginPage(driver, logger);
    }

    public FatSecretLoginPage logout() {
        clickElement(logoutButton);
        return new FatSecretLoginPage(driver, logger);
    }

    public FatSecretLoginPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

}
