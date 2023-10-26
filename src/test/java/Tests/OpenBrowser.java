package Tests;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import pages.*;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenBrowser {
    TextBoxPage textBoxPage = new TextBoxPage();
    MainPage mainPage = new MainPage();
    ButtonsPage buttonsPage = new ButtonsPage();
    BrowserWindowsPage browserWindowsPage = new BrowserWindowsPage();
    AlertsPage alertsPage = new AlertsPage();

    @BeforeAll
    static void baseUrl() {
        step("Перейти на https://demoqa.com/", () -> {
            open("https://demoqa.com/");
            WebDriverRunner.getWebDriver().manage().window().maximize();
        });

    }
}
