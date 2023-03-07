package ru.sberhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CheckOnlineConsultationPageTest extends TestBase{

    @DisplayName("Check video appear on online consultation page")
    @Test
    public void checkVideoOnOnlineConsultationPage() {
        step("Click on online consultation button and check text", () -> {
            mainPage.clickOnOnlineConsultationButton();
            onlineConsultationPage.checkOnlineConsultationHeader();
        });
        step("Click on watch video button and check div is appear", () -> {
            onlineConsultationPage.clickOnOnlineConsultationVideo();
            onlineConsultationPage.videoShouldBeVisible();
        });
    }
}
