package selenium.uj.project.tests;

import org.testng.annotations.Test;
import selenium.uj.project.pages.FatSecretLoginPage;

public class FatSecretLogoutTest extends DefaultTest {
    @Test
    public void successLogoutTest() {
        FatSecretLoginPage fatSecretLoginPage = new FatSecretLoginPage(driver, logger).logout();
    }
}
