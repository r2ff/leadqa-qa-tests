package tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import page.GooglePage;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static page.GooglePage.*;

public class GoogleTest extends TestBase{

    @Test
    void searchGoogleTest() {
        open("https://www.google.com");
        $(byName("q")).setValue("купить кофемашину bork c804").pressEnter();
        $$(".g").contains("mvideo.ru");
        $$(".g").shouldHave(CollectionCondition.sizeGreaterThan(10));
    }

    @Test
    void searchGoogleWithPageObjectTest() {
        openGooglePage()
                .inputTextToSearch()
                .resultsContainsText()
                .checkSizeResultsMoreThan10();
    }
}
