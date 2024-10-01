package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import guru.qa.pages.RegistrationFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RegistrationFormWithPageObjectsTests {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();



    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest()  {

        registrationFormPage.openPage()
                .setFirstName("woo")
                .setEmail("woo@woo.ru")
                .setCurrentAddress("Some street 1")
                .setPermanentAddress("Another street 2")
                .clickSubmit();

        registrationFormPage.checkResult("woo")
                .checkResult("woo@woo.ru")
                .checkResult("Some street 1")
                .checkResult("Another street 2");

    }
}
