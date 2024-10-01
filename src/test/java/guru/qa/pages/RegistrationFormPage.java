package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    // locators # = id
    SelenideElement pageTextCenter = $(".text-center");
    SelenideElement userNameInput = $("#userName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement currentAddressInput = $("#currentAddress");
    SelenideElement permanentAddressInput = $("#permanentAddress");
    SelenideElement submitButton = $("#submit");
    SelenideElement outputField = $("#output");

    // actions

    public RegistrationFormPage openPage() {
        open("/text-box");
        pageTextCenter.shouldHave(text("Text Box"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        userNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public RegistrationFormPage checkResult(String value) {
        outputField.shouldHave(text(value));

        return this;
    }



}
