package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Optional;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void beforeAll(){

        Optional<String> deviceHostValue = Optional.ofNullable(System.getProperty("deviceHost"));

        if ("emulation".equals(deviceHostValue.orElse(null)) ||
                "real".equals(deviceHostValue.orElse(null))) {
            Configuration.browser = LocalDriver.class.getName();
        } else {
            Configuration.browser = BrowserstackDriver.class.getName();
        }
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
    }

    @BeforeEach
    void beforeEach(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments(){

        Optional<String> deviceHostValue = Optional.ofNullable(System.getProperty("deviceHost"));

        if ("emulation".equals(deviceHostValue.orElse(null)) ||
                "real".equals(deviceHostValue.orElse(null))) {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            closeWebDriver();
        } else {
            String sessionId = Selenide.sessionId().toString();
            System.out.println(sessionId);
            Attach.pageSource();
            closeWebDriver();
            Attach.addVideo(sessionId);
        }
    }
}
