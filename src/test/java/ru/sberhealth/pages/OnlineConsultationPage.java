package ru.sberhealth.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class OnlineConsultationPage {

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
}
