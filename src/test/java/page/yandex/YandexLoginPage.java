package page.yandex;

import config.Project;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class YandexLoginPage {

    @Step("Вводим логин")
    public YandexLoginPage enterLogin() {
        $("#passp-field-login").setValue(Project.config.login()).pressEnter();
        return this;
    }

    @Step("Вводим пароль")
    public YandexMainPageAfterLogin enterPassword() {
        $("#passp-field-passwd").setValue(Project.config.password()).pressEnter();
        return new YandexMainPageAfterLogin();
    }
}
