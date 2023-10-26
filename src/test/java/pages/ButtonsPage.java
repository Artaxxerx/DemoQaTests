package pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ButtonsPage {
    private final String DYNAMIC_CLICK = "You have done a dynamic click";
    private final String RIGHT_CLICK = "You have done a right click";
    private final String DOUBLE_CLICK = "You have done a double click";

    SelenideElement clickMe = $(byText("Click Me")),
            dynamicClickMessage = $x("//p[@id='dynamicClickMessage']"),
            rightClickMe = $x("//button[@id='rightClickBtn']"),
            rightClickMessage = $x("//p[@id='rightClickMessage']"),
            doubleClickBtn = $x("//button[@id='doubleClickBtn']"),
            doubleClickMessage = $x("//p[@id='doubleClickMessage']");

    public ButtonsPage clickMe() {
        clickMe.click();
        return this;
    }

    public ButtonsPage verifyDynamicClick() {
        dynamicClickMessage.shouldHave(text(DYNAMIC_CLICK));
        return this;
    }

    public ButtonsPage rightClickBtn() {
        rightClickMe.contextClick();
        return this;
    }

    public ButtonsPage verifyRightClick() {
        rightClickMessage.shouldHave(text(RIGHT_CLICK));
        return this;
    }

    public ButtonsPage doubleClickMe() {
        doubleClickBtn.doubleClick();
        return this;
    }

    public ButtonsPage verifyDoubleclick() {
        doubleClickMessage.shouldHave(text(DOUBLE_CLICK));
        return this;
    }
}
