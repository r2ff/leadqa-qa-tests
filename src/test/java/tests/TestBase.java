package tests;

import com.codeborne.selenide.Selenide;
import helpers.DriverSettings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        DriverSettings.configure();
    }

    @AfterEach
    void tearDown() {
        Selenide.closeWebDriver();
    }
}
