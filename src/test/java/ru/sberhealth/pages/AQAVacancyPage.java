package ru.sberhealth.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AQAVacancyPage {
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
}
