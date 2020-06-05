package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FatSecretAddNotePage extends DefaultPage {

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr/td[2]/div/div[1]/div[10]")
    private WebElement GoToNote;

    @FindBy(xpath = "//html/body/form/div[4]/div[3]/div/div[2]/table/tbody/tr/td[1]/div/div[2]/div[1]/div[2]/a")
    private WebElement AddNote;

    @FindBy(xpath = "//html/body/form/div[4]/div[3]/div/div[2]/table/tbody/tr/td[1]/div/div[3]/textarea")
    private WebElement TextArea;

    @FindBy(xpath = "//*[@id=\"content\"]/table/tbody/tr/td[1]/div/div[5]/a[1]")
    private WebElement SaveTextArea;

    public FatSecretAddNotePage clickAddNote() {
        clickElement(GoToNote);
        clickElement(AddNote);
        return this;
    }

    public FatSecretAddNotePage fillTextArea() {
        fillElement(TextArea, "fgjkvj;iga;iudl;vnlkjfkfjlgkj");
        return this;
    }

    public FatSecretAddNotePage clickSaveTextArea() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");

        clickElement(SaveTextArea);
        return this;
    }

    public FatSecretAddNotePage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }
}
