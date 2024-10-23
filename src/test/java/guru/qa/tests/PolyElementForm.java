package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PolyElementForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void firstTest() {
        open("/automation-practice-form");
        executeJavaScript("window.scrollBy(0,500)");

        $("input#firstName").setValue("Ruslan");
        $("#lastName").setValue("Ibraev");
//        $("#userEmail").setValue("sobaka@sobaka.ru");
//        $(byText("Female")).click();
//        $("#userNumber").setValue("79999999999");
//        $("#dateOfBirthInput").click();
//        $(".react-datepicker__month-select").selectOptionByValue(String.valueOf(0));
//        $(".react-datepicker__year-select").selectOptionByValue(String.valueOf(2001));
//        $(byText("1")).click();
//        $("#subjectsInput").setValue("Math").pressEnter();
//        $(byText("Music")).click();
//        $("#uploadPicture").uploadFromClasspath("test pic.jpg");
//        $("#currentAddress").setValue("New address");
//        $("#state").click();
//        $(byText("NCR")).click();
//        $("#city").click();
//        $(byText("Delhi")).click();
//        $("#submit").click();
//
//        $$("tr").get(1).shouldHave(text("Ivanna Ivanova"));
//        $$("tr").get(2).shouldHave(text("sobaka@sobaka.ru"));
//        $$("tr").get(3).shouldHave(text("Female"));
//        $$("tr").get(4).shouldHave(text("7999999999"));
//        $$("tr").get(5).shouldHave(text("01 January,2001"));
//        $$("tr").get(6).shouldHave(text("Maths"));
//        $$("tr").get(7).shouldHave(text("Music"));
//        $$("tr").get(8).shouldHave(text("test pic.jpg"));
//        $$("tr").get(9).shouldHave(text("New address"));
//        $$("tr").get(10).shouldHave(text("NCR Delhi"));
    }
}


