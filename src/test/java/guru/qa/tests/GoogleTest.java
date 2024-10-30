package guru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void user_can_search_everything_in_google() {
        open("http://google.com/ncr");
      //  $(By.id("APjFqb")).val("selenide").pressEnter();
    //    $(By.name("q")).val("selenide").pressEnter();
    //    $("[name=q]").val("selenide").pressEnter();
        $("[id=APjFqb]").val("selenide").pressEnter();

//////        $$("#ires .g").shouldHave(size(10));
////
      //  $("[data-hveid='CAgQAA']").shouldHave(text("Selenide vs Selenium"));
//                text("Selenide: concise UI tests in Java"),
//                text("selenide.org"));
    }
}
