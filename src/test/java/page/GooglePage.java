package page;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.*;

public class GooglePage {

    private static final String googleUrl = "https://www.google.com/";
    private final String textInput = "купить кофемашину bork c804";
    private final String mvideo = "mvideo.ru";

    @Step("Открываем google.com")
    public static GooglePage openGooglePage() {
        open(googleUrl);
        return new GooglePage();
    }

    @Step("Вводим в поле поиск значение")
    public GooglePage inputTextToSearch() {
        $(byName("q")).setValue(textInput).pressEnter();
        return this;
    }

    @Step("Проверяем что значений больше 10")
    public GooglePage checkSizeResultsMoreThan10() {
        $$(".g").shouldHave(CollectionCondition.sizeGreaterThan(10));
        return this;
    }

    @Step("Проверяем что в результатах поиска есть mvideo.ru")
    public GooglePage resultsContainsText() {
        $$(".g").contains(mvideo);
        return this;
    }
}
