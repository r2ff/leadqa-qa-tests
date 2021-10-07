package page.yandex;

import io.qameta.allure.Step;
import page.GooglePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexMainPage {

    private static final String yandexUrl = "https://yandex.ru/";

    @Step("Открываем yandex.ru")
    public static YandexMainPage openYandexPage() {
        open(yandexUrl);
        return new YandexMainPage();
    }

    @Step("Нажимаем кнопку 'Войти'")
    public YandexLoginPage pressLoginButton() {
        $(".desk-notif-card__login-new-item-title").click();
        return new YandexLoginPage();
    }
}
