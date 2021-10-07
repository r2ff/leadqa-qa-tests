package page.yandex;

import config.Project;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class YandexMainPageAfterLogin {

    @Step("Проверяем, что вошли под пользователем")
    public void checkLogin() {
        $(".desk-notif-card__user-name").shouldHave(text(Project.config.login()));
    }
}
