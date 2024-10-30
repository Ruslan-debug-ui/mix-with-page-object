package guru.qa.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void user_can_search_everything_in_google() {
        open("http://google.com/ncr");
        $(By.id("APjFqb")).val("selenide").pressEnter();
//        $(By.name("q")).val("selenide").pressEnter();

//////        $$("#ires .g").shouldHave(size(10));
////
        $(withText("Selenide vs Selenium")).click();
//                text("Selenide: concise UI tests in Java"),
//                text("selenide.org"));
    }
}
