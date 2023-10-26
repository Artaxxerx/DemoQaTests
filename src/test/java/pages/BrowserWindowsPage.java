package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.switchTo;

public class BrowserWindowsPage {
    SelenideElement tabButton = $("#tabButton"),
            windowButton = $("#windowButton");

    public BrowserWindowsPage newTab() {
        tabButton.click();
        return this;
    }

    public BrowserWindowsPage closeNewTabOrWindow() {
        switchTo().window(1);
        closeWindow();
        switchTo().window(0);
        return this;
    }

    public BrowserWindowsPage newWindow() {
        windowButton.click();
        return this;
    }

}
