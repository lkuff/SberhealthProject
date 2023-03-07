package ru.sberhealth.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.sberhealth.helpers.Attach;
import ru.sberhealth.pages.AQAVacancyPage;
import ru.sberhealth.pages.DiagnosticsPage;
import ru.sberhealth.pages.MainPage;
import ru.sberhealth.pages.OnlineConsultationPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    MainPage mainPage = new MainPage();
    OnlineConsultationPage onlineConsultationPage = new OnlineConsultationPage();
    AQAVacancyPage AQAVacancyPage  = new AQAVacancyPage ();
    DiagnosticsPage diagnosticsPage = new DiagnosticsPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://sberhealth.ru/";
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "100");
        Configuration.remote = System.getProperty("remoteUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeEach
    void setUp() {
        open("https://sberhealth.ru/");
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}