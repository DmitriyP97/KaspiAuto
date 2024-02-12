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
        homeWorkOne.languageJava.shouldHave(text("95.7%"));
        homeWorkOne.languageHTML.shouldHave(text("3.1%"));
        homeWorkOne.languageJS.shouldHave(text("1.2%"));
    }
}
