package ru.sberhealth.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class MainPage {

    public void cookiesShodBeVisible() {
        $(withText("Мы используем файлы cookies")).shouldBe(visible);
    }

    public void clickOnAgreeButtonCookie() {
        $(".cookie-popup__agree-btn").click();
    }

    public void cookiesShodBeHidden() {
        $(withText("Мы используем файлы cookies")).shouldBe(hidden);
    }

    public void clickOnVacanciesButton() {
        $(".the-footer__content").$(byText("Вакансии")).click();
    }
    public void switchToWindowOne() {
        switchTo().window(1);
    }

    public void checkVacanciesUrl() {
        webdriver().shouldHave(url("https://vacancy.sberhealth.ru/" +
                "?utm_source=main_sberhealth&utm_medium=internal&utm_campaign=footer#head"));
    }

    public void clickOnCheckVacanciesButton() {
        $$(".block-head__buttons .app-button ").findBy(text("Посмотреть вакансии")).click();
    }

    public void checkVacanciesHeader() {
        $(".block-vacancy h2").shouldHave(text("Вакансии"));
    }

    public void clickOnDropDownMenuVacancies() {
        $(".app-accordion__button").click();
    }

    public void checkDropDownMenuVacanciesAppear() {
        $(".vacancy-accordion--open").shouldBe(visible);
    }

    public void clickOnAQAVacancy(String vacancy) {
        $$(".app-accordion__content ul li").findBy(text(vacancy)).click();
    }

    public void checkPageHasAQAVacancy(String vacancy) {
        $(".container-with-aside__main h1").shouldHave(text(vacancy));
    }

    public void clickOnContactsButton() {
        $(".the-footer__content").$(byText("Контакты")).click();
    }

    public void checkContactsInformation() {
        $(".t433__contentbox").shouldHave(text("Москва, м. Автозаводская,"));
    }

    public void clickOnLKButton() {
        $(".the-header__login").click();
    }

    public void checkLKUrl() {
        webdriver().shouldHave(url("https://lk.sberhealth.ru/" +
                "login-v2?redirectUrl=%2Fcabinet%2Fprofile%3Fredirect%3D%252Fcabinet%252Fcard%3" +
                "Futm_source%3Dmain_sberhealth%26" +
                "utm_medium%3Dinternal%26utm_campaign%3Dheader"));
    }

    public void clickOnOnlineConsultationButton() {
        $$(".the-header__links a").findBy(text("Онлайн-консультации")).click();
    }

    public void checkOnlineConsultationHeader() {
        $("[data-testid=howto-video-block-wrapper]")
                .shouldHave(text("Узнайте как проходят онлайн-консультации"));
    }

    public void clickOnOnlineConsultationVideo() {
        $("[data-testid=howto-video-block-wrapper]").$(byText("Смотреть видео")).click();
    }

    public void videoShouldBeVisible() {
        $("[data-testid=modal-overlay]").shouldBe(visible);
    }

    public void clickOnVKIcon() {
        $$(".the-footer__socials a").findBy(href("https://vk.com/sber.health")).click();
    }

    public void checkVKUrl() {
        webdriver().shouldHave(url("https://vk.com/sber.health"));
    }

    public void clickOnDiagnosticsButton(String DiagnosticsUrl) {
        $$(".med-service__container .med-service__block a")
                .findBy(href(DiagnosticsUrl))
                .click();
    }

    public void checkDiagnosticsUrl(String DiagnosticsUrl) {
        webdriver().shouldHave(url(DiagnosticsUrl));
    }

    public void clickOnAllDiagnosticsButton() {
        $("#chosenDiagnostic").click();
    }

    public void clickOnMRILink() {
        $$("#spec-list ul li a").findBy(text("МРТ (магнитно-резонансная томография)")).click();
    }

    public void checkMRIPageHeader() {
        $(".diagnoctica-seo-header h1").shouldHave(text("МРТ (магнитно-резонансная томография) в Москве:"));
    }
}
