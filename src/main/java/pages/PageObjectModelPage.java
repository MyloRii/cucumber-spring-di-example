package pages;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.Wait;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class PageObjectModelPage {

    private static final String PAGE_TITLE = "WebDriver | Page Object Model";

    public boolean isPageObjectModelPageOpened() {
        return Wait().until(WebDriver::getTitle).equals(PAGE_TITLE);
    }
}
