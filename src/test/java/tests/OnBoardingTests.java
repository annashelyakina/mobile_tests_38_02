package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

@Tag("mobile_tests")
public class OnBoardingTests extends TestBase {

    // Тест проходит all screens of the onboarding flow in mobile app
    @Test
    @DisplayName("Successful navigation through onboarding screens")
    public void completeOnboardingFlowTest() {

        // Шаг 1: Проверяем первый экран
        step("Check first onboarding screen", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(matchText("^.*The Free Encyclopedia.*?$"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        // Шаг 2: Проверяем второй экран
        step("Check second onboarding screen", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text("New ways to explore"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        // Шаг 3: Проверяем третий экран
        step("Check third onboarding screen", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(text("Reading lists with sync"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
        });

        // Шаг 4: Проверяем четвертый экран
        step("Check fourth onboarding screen", () -> {
            $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(text("Data & Privacy"));
            $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();
        });

        step("Verify content found", () ->
                $(accessibilityId("Search Wikipedia")).shouldBe(visible));
    }
}