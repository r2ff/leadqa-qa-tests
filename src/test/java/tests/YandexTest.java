package tests;

import com.codeborne.selenide.Condition;
import config.Project;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static page.yandex.YandexMainPage.*;

public class YandexTest extends TestBase{

    @Test
    void loginYandexRawTest() {
        open("https://yandex.ru/");
        $(".desk-notif-card__login-new-item-title").click();
        $("#passp-field-login").setValue(Project.config.login()).pressEnter();
        $("#passp-field-passwd").setValue(Project.config.password()).pressEnter();
        $(".desk-notif-card__user-name").shouldHave(Condition.text(Project.config.login()));
    }

    @Test
    void loginYandexWithPageObjectTest() {
        openYandexPage()
                .pressLoginButton()
                .enterLogin()
                .enterPassword()
                .checkLogin();
    }
}
