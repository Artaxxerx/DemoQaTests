package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {
    private SelenideElement userNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentPageInput = $("#permanentAddress"),
            submit = $("#submit"),
            output = $("#output"),
            textbox = $(byText("Text Box"));

    public TextBoxPage pressTextBox() {
        textbox.click();
        return this;
    }

    public TextBoxPage setUserName(String fullname) {
        userNameInput.setValue(fullname);
        return this;
    }

    public TextBoxPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public TextBoxPage currentAddress(String currentAddress) {
        currentAddressInput.setValue(currentAddress);
        return this;
    }

    public TextBoxPage permanentPage(String permanentAddress) {
        permanentPageInput.setValue(permanentAddress);
        return this;
    }

    public TextBoxPage submit() {
        submit.click();
        return this;
    }

    public TextBoxPage verifyIsDataSavedCorrectly(String fullname, String email, String currentAddress, String permanentAddress) {
        output.$("#name").shouldHave(text(fullname));
        output.$("#email").shouldHave(text(email));
        output.$("#currentAddress").shouldHave(text(currentAddress));
        output.$("#permanentAddress").shouldHave(text(permanentAddress));
        return this;
    }
}