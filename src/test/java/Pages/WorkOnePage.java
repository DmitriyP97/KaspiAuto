package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class WorkOnePage {
    public SelenideElement languageJava = getLanguageElement("java");
    public SelenideElement languageHTML = getLanguageElement("html");
    public SelenideElement languageJS = getLanguageElement("javascript");
    public ElementsCollection sizePeople = $$(".avatar.circle");

    public static void transitionToSelenide() {
        $(".search-input-container").shouldHave(text("Search or jump to...")).click();
        $("#query-builder-test").setValue("selenide/selenide").pressEnter();
        $("[href='/selenide/selenide']").should(visible).click();
    }

    public SelenideElement getLanguageElement(String language) {
        return $("[href='/selenide/selenide/search?l=" + language + "']");
    }
}
