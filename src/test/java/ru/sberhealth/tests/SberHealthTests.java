package ru.sberhealth.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static ru.sberhealth.tests.TestData.*;

public class SberHealthTests extends TestBase{

    @BeforeEach
    void setUp() {
        open("https://sberhealth.ru/");
    }

    @DisplayName("Check accept cookies")
    @Test
    public void checkAcceptCookies() {
        step("Click on close cookies button and check it disappear", () -> {
            mainPage.cookiesShodBeVisible();
            mainPage.clickOnAgreeButtonCookie();
            mainPage.cookiesShodBeHidden();
        });
    }

    @DisplayName("Check Automation QA vacancy on vacancy sbertech page")
    @Test
    public void checkAQAVacancy() {
        step("Click on vacancies button from footer of the page", () -> {
            mainPage.clickOnVacanciesButton();
            mainPage.switchToWindowOne();
            mainPage.checkVacanciesUrl();
        });
        step("Click on 'check vacancies' button and check page has 'vacancies' header", () -> {
            mainPage.clickOnCheckVacanciesButton();
            mainPage.checkVacanciesHeader();
        });
        step("Click on drop-down menu button and check it appear", () -> {
            mainPage.clickOnDropDownMenuVacancies();
            mainPage.checkDropDownMenuVacanciesAppear();
        });
        step("Click on QA Automation Engineer vacancy and check page has 'QA Automation Engineer' header", () -> {
            mainPage.clickOnAQAVacancy(vacancy);
            mainPage.checkPageHasAQAVacancy(vacancy);
        });
    }


    @DisplayName("Check company contacts from footer of the page")
    @Test
    public void checkContacts() {
        step("Click on contacts button", () -> {
            mainPage.clickOnContactsButton();
        });
        step("Switch to the new window and check address", () -> {
            mainPage.switchToWindowOne();
            mainPage.checkContactsInformation();
        });
    }

    @DisplayName("Check LK button")
    @Test
    public void checkLKButton() {
        step("Click on LK button and check url", () -> {
            mainPage.clickOnLKButton();
            mainPage.checkLKUrl();
        });
    }

    @DisplayName("Check video appear on online consultation page")
    @Test
    public void checkVideoOnOnlineConsultationPage() {
        step("Click on online consultation button and check text", () -> {
            mainPage.clickOnOnlineConsultationButton();
            mainPage.checkOnlineConsultationHeader();
        });
        step("Click on watch video button and check div is appear", () -> {
            mainPage.clickOnOnlineConsultationVideo();
            mainPage.videoShouldBeVisible();
        });

    }

    @DisplayName("Check VK page icon from footer of the page")
    @Test
    public void checkVKIcon() {
        step("Click on VK icon form footer of the page", () -> {
            mainPage.clickOnVKIcon();
        });
        step("Switch to new page and check url", () -> {
            mainPage.switchToWindowOne();
            mainPage.checkVKUrl();
        });
    }

    @DisplayName("Check mri from diagnostics button in medical services")
    @Test
    public void checkDiagnosticsButton() {
        step("Click on diagnostics button in medical services", () -> {
            mainPage.clickOnDiagnosticsButton(DiagnosticsUrl);
        });
        step("Switch to new page and check url", () -> {
            mainPage.switchToWindowOne();
            mainPage.checkDiagnosticsUrl(DiagnosticsUrl);
        });
        step("Click on all diagnostics button", () -> {
            mainPage.clickOnAllDiagnosticsButton();
        });
        step("Click on mri link and check header", () -> {
            mainPage.clickOnMRILink();
            mainPage.checkMRIPageHeader();
        });
    }
}
