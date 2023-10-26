package Tests;


import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class Tests extends OpenBrowser {

    @Test
    void firstTest() throws InterruptedException {
        String fullname = "Имя";
        String email = "Qa@qa.com";
        String currentAddress = "Москва, Холодильный переулок, 3";
        String permanentAddress = "Уфа, улица Ленина, 70";
        String alertText = "Test name";
        String testName = "Test name";
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Нажать на «Elements»", stepContext -> {
            mainPage.clickElement();
        });
        step("Нажать на «Text box»", stepContext -> {
            textBoxPage.pressTextBox();
        });
        step("Заполнить поля: Full Name, Email, Current Address, Permanent Address", stepContext -> {
            textBoxPage.setUserName(fullname).setEmail(email).currentAddress(currentAddress).permanentPage(permanentAddress);
        });
        step("Нажать на кнопку «Submit»", stepContext -> {
            textBoxPage.submit();
        });
        step("Проверить, что данные в блоке сохранены корректно", stepContext -> {
            textBoxPage.verifyIsDataSavedCorrectly(fullname, email, currentAddress, permanentAddress);
        });
        step("Нажать на «Buttons»", stepContext -> {
            mainPage.clickButtons();
        });
        step("Нажать на кнопку «Click me»", stepContext -> {
            buttonsPage.clickMe();
        });
        step("Проверить, что появился текст «You have done a dynamic click»", stepContext -> {
            buttonsPage.verifyDynamicClick();
        });
        step("Нажать на кнопку «Right Click me»", stepContext -> {
            buttonsPage.rightClickBtn();
        });
        step("Проверить, что появился текст «You have done a right click»", stepContext -> {
            buttonsPage.verifyRightClick();
        });
        step("Нажать на кнопку «Double Click me»", stepContext -> {
            buttonsPage.doubleClickMe();
        });
        step("Проверить, что появился текст «You have done a double click»", stepContext -> {
            buttonsPage.verifyDoubleclick();
        });
        step("Нажать на «Alerts, Frame & Windows»", stepContext -> {
            mainPage.clickAlertsFrameWindows();
        });
        step("Нажать на «Browser Windows»", stepContext -> {
            mainPage.clickBrowserWindows();
        });
        step("Нажать на кнопку «New Tab»", stepContext -> {
            browserWindowsPage.newTab();
        });
        step("Закрыть новую вкладку", stepContext -> {
            browserWindowsPage.closeNewTabOrWindow();
        });
        step("Нажать на кнопку «New window»", stepContext -> {
            browserWindowsPage.newWindow();
        });
        step("Закрыть новое окно", stepContext -> {
            browserWindowsPage.closeNewTabOrWindow();
        });
        step("Нажать на «Alerts»", stepContext -> {
            mainPage.clickAlerts();
        });
        step("Нажать на кнопку «Click me»  рядом с Click Button to see alert", stepContext -> {
            alertsPage.clickAlertButton();
        });
        step("Закрыть уведомление", stepContext -> {
            alertsPage.closeAlert();
        });
        step("Нажать на кнопку «Click me» рядом с On button click, alert will appear after 5 seconds", stepContext -> {
            alertsPage.clickTimerAlertButton();
        });
        step("Закрыть уведомление", stepContext -> {
            alertsPage.closeAlertWithTimeout();
        });
        step("Нажать на кнопку «Click me» рядом с On button click, confirm box will appear", stepContext -> {
            alertsPage.clickConfirmButton();
        });
        step("Нажать на кнопку «Да» в уведомление", stepContext -> {
            alertsPage.closeAlert();
        });
        step("Проверить, что появился текст You selected Ok", stepContext -> {
            alertsPage.verifyYouSelectedOk();
        });
        step("Нажать  на  кнопку  «Click me»   рядом  с On button click, prompt box will appear", stepContext -> {
            alertsPage.clickPromtButton();
        });
        step("Заполнить поле в уведомлении данными: Test name", stepContext -> {
            alertsPage.fillAlertWithText(alertText);
        });
        step("Проверить, что появился текст You entered Test name", stepContext -> {
            alertsPage.verifyYouEnteredTestName(testName);
        });

    }

}