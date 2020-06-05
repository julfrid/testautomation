package selenium.uj.project.tests;

import org.testng.annotations.Test;;
import selenium.uj.project.pages.FatSecretAddWeightPage;

public class FatSecretAddWeightTest extends DefaultTest {
    @Test
    public void successLogoutTest() {
        FatSecretAddWeightPage fatSecretAddWeightPage = new FatSecretAddWeightPage(driver, logger)
                .clickWeightHistory()
                .clickAddWeight()
                .fillWieghtNumber()
                .clickSaveWeight();
    }
}
