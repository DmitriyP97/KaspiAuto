import Pages.WorkOnePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkOne {
    @BeforeAll
    public static void openURL() {
        String URL = "https://github.com/";
        open(URL);
        WorkOnePage.transitionToSelenide();
    }

    static WorkOnePage homeWorkOne = new WorkOnePage();
    @Test
    void contributors() {
        homeWorkOne.sizePeople.shouldBe(size(12));

    }

    @Test
    void languages() {
        homeWorkOne.languageJava.get(0).shouldHave(text("Java")).shouldHave(text("95.7%"));
        homeWorkOne.languageHTML.get(1).shouldHave(text("HTML")).shouldHave(text("3.1%"));
        homeWorkOne.languageJS.get(2).shouldHave(text("JavaScript")).shouldHave(text("1.2%"));
    }
}
