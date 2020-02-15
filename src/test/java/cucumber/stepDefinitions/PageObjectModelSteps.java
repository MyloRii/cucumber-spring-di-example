package cucumber.stepDefinitions;

import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import pages.PageObjectModelPage;

import static org.junit.Assert.assertTrue;

public class PageObjectModelSteps {

    @Autowired
    PageObjectModelPage pageObjectModelPage;

    @Then("User is on page object model page")
    public void userIsOnHOmePage() {
        assertTrue(pageObjectModelPage.isPageObjectModelPageOpened());
    }
}
