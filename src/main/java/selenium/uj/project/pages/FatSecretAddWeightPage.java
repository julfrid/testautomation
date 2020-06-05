package selenium.uj.project.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FatSecretAddWeightPage extends DefaultPage {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//html/body/form/div[4]/div[3]/div/div[2]/table/tbody/tr/td[2]/div/div[1]/div[9]/a")
    private WebElement weightHistory;

    @FindBy(xpath = "//html/body/form/div[4]/div[3]/div/div[2]/table/tbody/tr/td[1]/div/div[3]/div[2]/a")
    private WebElement addWeight;

    @FindBy(xpath = "//html/body/form/div[4]/div[3]/div/div[2]/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input[2]")
    private WebElement fillWeight;

    @FindBy(xpath = "//html/body/form/div[4]/div[3]/div/div[2]/table/tbody/tr/td[1]/div/div[6]/a[1]")
    private WebElement saveWeight;

    public FatSecretAddWeightPage clickWeightHistory() {
        clickElement(weightHistory);
        return this;
    }


    public FatSecretAddWeightPage clickAddWeight() {
        js.executeScript("window.scrollBy(0,500)", "");
        clickElement(addWeight);
        return this;
    }
    public FatSecretAddWeightPage fillWieghtNumber () {
        fillElement(fillWeight, "76");
        js.executeScript("window.scrollBy(0,700)", "");
        return this;
    }

    public FatSecretAddWeightPage clickSaveWeight() {
        clickElement(saveWeight);
        return this;
    }

    public FatSecretAddWeightPage(WebDriver driver, Logger logger) {
        super(driver, logger);
    }
}