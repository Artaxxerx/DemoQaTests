package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class MainPage {
    public SelenideElement elements = $(byText("Elements")),
            buttons = $x("//span[text()='Buttons']"),
            alertsFramesWindows = $x("//*[text()='Alerts, Frame & Windows']"),
            browserWindows = $(byText("Browser Windows")),
            alerts = $(byText("Alerts"));

    public MainPage clickElement() {
        elements.click();
        return this;
    }

    public MainPage clickButtons() {
        buttons.click();
        return this;
    }

    public MainPage clickAlertsFrameWindows() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        alertsFramesWindows.click();
        return this;
    }

    public MainPage clickBrowserWindows() {
        browserWindows.click();
        return this;
    }

    public MainPage clickAlerts() {
        alerts.click();
        return this;
    }

}
