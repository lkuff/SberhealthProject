package ru.sberhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static ru.sberhealth.tests.TestData.vacancy;

public class CheckAQAVacancyTest extends TestBase{
    @DisplayName("Check Automation QA vacancy on vacancy sbertech page")
    @Test
    public void checkAQAVacancy() {
        step("Click on vacancies button from footer of the page", () -> {
            mainPage.clickOnVacanciesButton();
            mainPage.switchToWindowOne();
            mainPage.checkVacanciesUrl();
        });
        step("Click on 'check vacancies' button and check page has 'vacancies' header", () -> {
            AQAVacancyPage.clickOnCheckVacanciesButton();
            AQAVacancyPage.checkVacanciesHeader();
        });
        step("Click on drop-down menu button and check it appear", () -> {
            AQAVacancyPage.clickOnDropDownMenuVacancies();
            AQAVacancyPage.checkDropDownMenuVacanciesAppear();
        });
        step("Click on QA Automation Engineer vacancy and check page has 'QA Automation Engineer' header", () -> {
            AQAVacancyPage.clickOnAQAVacancy(vacancy);
            AQAVacancyPage.checkPageHasAQAVacancy(vacancy);
        });
    }
}
