package cucumber.stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class BaseStep {

    @Before
    public void setup() {
        Configuration.baseUrl = "http://www.webdriveruniversity.com/";
        open("/");
    }
}
