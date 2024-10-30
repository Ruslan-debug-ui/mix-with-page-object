package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class TextBoxTests {



    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {

        String name = "woo";
        open("/text-box");
        sleep(1000);
        $("#userName").val("woo");
        sleep(1000);
        $("#userEmail").setValue("woo@woo.ru");
        sleep(1000);
        $("#currentAddress").setValue("Some street 1");
        sleep(1000);
        $("#permanentAddress").setValue("Another street 2");
        sleep(1000);
        $("#submit").click();
        sleep(1000);
        $("#submit").shouldBe(visible).click();
        sleep(1000);

        // Asserts
        $("#output").shouldHave(text(name), text("woo@woo.ru"),
                text("Some street 1"), text("Another street 2"));

//        $("[id=output] [id=name]").shouldHave(text(name));
//        $("[id=output]").$("[id=name]").shouldHave(text(name));
//        $("[id=name]").shouldHave(text(name));
//
//        $("[id=permanentAddress]").shouldHave(text("Permananet Address :Another street 2")); // wrong
//        $("[id=permanentAddress]", 1).shouldHave(text("Permananet Address :Another street 2"));
//        $("p[id=permanentAddress]").shouldHave(text("Permananet Address :Another street 2"));
//
//        String expectedPermanentAddress = "Another street 2";
//        String actualPermanentAddress = $("p[id=permanentAddress]").text();
//        assertEquals(expectedPermanentAddress, actualPermanentAddress);
    }
}
