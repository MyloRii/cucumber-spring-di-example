package cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import pages.HomePage;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {

    @Autowired
    HomePage homePage;

    @Given("User is on home page")
    public void userIsOnHomePage() {
        assertTrue(homePage.isHomePageOpened());
    }

    @When("User navigated to page object model page")
    public void userNavigatedToPageObjectModelPage() {
        homePage.openPageObjectModelPage();
    }
}
