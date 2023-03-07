package ru.sberhealth.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DiagnosticsPage {

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
