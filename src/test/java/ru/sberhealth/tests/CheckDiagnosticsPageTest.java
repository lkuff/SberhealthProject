package ru.sberhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static ru.sberhealth.tests.TestData.DiagnosticsUrl;

public class CheckDiagnosticsPageTest extends TestBase{
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
            diagnosticsPage.clickOnAllDiagnosticsButton();
        });
        step("Click on mri link and check header", () -> {
            diagnosticsPage.clickOnMRILink();
            diagnosticsPage.checkMRIPageHeader();
        });
    }
}
