package selenium.uj.project.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CustomDriverFactory {

    private CustomFile customFile;

    public CustomDriverFactory() {
        customFile = new CustomFile();
    }

    public WebDriver getConfiguredDriver(String driverType) {
        return getConfiguredDriver(driverType, BaseProperties.IMPLICITLY_WAIT, BaseProperties.WINDOW_MAXIMIZE);
    }

    public WebDriver getConfiguredDriver(String driverType, long implicitlyWait) {
        return getConfiguredDriver(driverType, implicitlyWait, BaseProperties.WINDOW_MAXIMIZE);
    }

    public WebDriver getConfiguredDriver(String driverType, boolean windowMaximize) {
        return getConfiguredDriver(driverType, BaseProperties.IMPLICITLY_WAIT, windowMaximize);
    }

    public WebDriver getConfiguredDriver(String browserType, long implicitlyWait, boolean windowMaximize) {
        WebDriver driver = null;
        if (browserType.equalsIgnoreCase(BaseProperties.CHROME_BROWSER_TYPE)) {
            System.setProperty("webdriver.chrome.driver", customFile.getResourceFilePathString(BaseProperties.CHROME_DRIVER_FILE_NAME));
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
        if (windowMaximize) {
            driver.manage().window().maximize();
        }
        return driver;
    }
}