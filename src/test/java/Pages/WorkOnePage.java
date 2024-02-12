package Pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class WorkOnePage {
    public ElementsCollection languageJava = $$("[data-ga-click='Repository, language stats search click, location:repo overview']");
    public ElementsCollection languageHTML = $$("[data-ga-click='Repository, language stats search click, location:repo overview']");
    public ElementsCollection languageJS = $$("[data-ga-click='Repository, language stats search click, location:repo overview']");
    public ElementsCollection sizePeople = $$(".avatar.circle");

    public static void transitionToSelenide() {
        $(".search-input-container").shouldHave(text("Search or jump to...")).click();
        $("#query-builder-test").setValue("selenide/selenide").pressEnter();
        $("[href='/selenide/selenide']").should(visible).click();
    }



}
