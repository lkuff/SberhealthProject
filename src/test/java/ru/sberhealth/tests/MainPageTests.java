package ru.sberhealth.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase{

    @DisplayName("Check accept cookies")
    @Test
    public void checkAcceptCookies() {
        step("Click on close cookies button and check it disappear", () -> {
            mainPage.cookiesShodBeVisible();
            mainPage.clickOnAgreeButtonCookie();
            mainPage.cookiesShodBeHidden();
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
}
