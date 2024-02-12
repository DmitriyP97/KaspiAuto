package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class WorkOnePage {
    public SelenideElement languageJava = $("[href='/selenide/selenide/search?l=java']");
    public SelenideElement languageHTML = $("[href='/selenide/selenide/search?l=html']");
    public SelenideElement languageJS = $("[href='/selenide/selenide/search?l=javascript']");
    public ElementsCollection sizePeople = $$(".avatar.circle");

    public static void transitionToSelenide() {
        $(".search-input-container").shouldHave(text("Search or jump to...")).click();
        $("#query-builder-test").setValue("selenide/selenide").pressEnter();
        $("[href='/selenide/selenide']").should(visible).click();
    }



}
