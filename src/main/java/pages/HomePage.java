package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.*;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;
import static org.openqa.selenium.By.cssSelector;

@Getter
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class HomePage {

    private static final String PAGE_TITLE = "WebDriverUniversity.com";

    public boolean isHomePageOpened() {
        return Wait().until(WebDriver::getTitle).equals(PAGE_TITLE);
    }

    public void openPageObjectModelPage() {
        $(cssSelector("#page-object-model h1")).click();
        switchTo().window("WebDriver | Page Object Model");
    }
}