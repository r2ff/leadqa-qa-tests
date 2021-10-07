package helpers;


import com.codeborne.selenide.Configuration;
import config.Project;

public class DriverSettings {

    public static void configure() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
}
