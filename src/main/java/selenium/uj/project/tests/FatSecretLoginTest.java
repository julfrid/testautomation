package selenium.uj.project.tests;

import org.testng.annotations.Test;
import selenium.uj.project.pages.FatSecretLoginPage;
import selenium.uj.project.utils.BaseProperties;

public class FatSecretLoginTest extends DefaultTest {
    @Test
    public void successLoginTest() {
        FatSecretLoginPage fatSecretLoginPage = new FatSecretLoginPage(driver, logger)
                .clickRedirect()
                .fillLoginForm(
                    BaseProperties.BASE_ADMIN_EMAIL,
                    BaseProperties.BASE_ADMIN_PASSWORD)
                .submitLoginForm();
    }
}
