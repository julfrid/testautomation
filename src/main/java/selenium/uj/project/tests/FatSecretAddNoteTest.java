package selenium.uj.project.tests;

import org.testng.annotations.Test;
import selenium.uj.project.pages.FatSecretAddNotePage;

public class FatSecretAddNoteTest extends DefaultTest {
    @Test
    public void successAddNote() {
        FatSecretAddNotePage ewkaLoginPage = new FatSecretAddNotePage(driver, logger).clickAddNote().fillTextArea().clickSaveTextArea();
    }
}
