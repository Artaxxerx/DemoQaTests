package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AlertsPage {
    SelenideElement alertButton = $("#alertButton"),
            timerAlertButton = $("#timerAlertButton"),
            confirmButton = $("#confirmButton"),
            textSuccess = $(".text-success"),
            promtButton = $("#promtButton"),
            promtResult = $x("//span[@id='promptResult']");

    public AlertsPage clickAlertButton() {
        alertButton.click();
        return this;
    }

    public AlertsPage closeAlert() {
        Selenide.confirm();
        return this;
    }

    public AlertsPage clickTimerAlertButton() {
        timerAlertButton.click();
        return this;
    }

    public AlertsPage closeAlertWithTimeout() {
        timeout = 6000;
        Selenide.confirm();
        return this;
    }

    public AlertsPage clickConfirmButton() {
        confirmButton.click();
        return this;
    }

    public AlertsPage verifyYouSelectedOk() {
        textSuccess.shouldBe(visible);
        return this;
    }

    public AlertsPage clickPromtButton() {
        promtButton.click();
        return this;
    }

    public AlertsPage fillAlertWithText(String alertText) {
        Selenide.switchTo().alert().sendKeys(alertText);
        Selenide.confirm();
        return this;
    }

    public AlertsPage verifyYouEnteredTestName(String testName) {
        promtResult.shouldHave(text(testName));
        return this;
    }
}
