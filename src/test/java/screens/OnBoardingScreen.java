package screens;

import io.qameta.allure.Step;
import tests.Constants;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class OnBoardingScreen {

    @Step("Check first onboarding screen in Russian")
    public OnBoardingScreen checkFirstOnboardingScreenRu(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(matchText("^.*"+ Constants.RU_TEXT_IN_FIRST_SCREEN +".*?$"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Check second onboarding screen in Russian")
    public OnBoardingScreen checkSecondOnboardingScreenRu(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(Constants.RU_TEXT_IN_SECOND_SCREEN));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Check third onboarding screen in Russian")
    public OnBoardingScreen checkThirdOnboardingScreenRu(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(text(Constants.RU_TEXT_IN_THIRD_SCREEN));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Check fourth onboarding screen in Russian")
    public OnBoardingScreen checkFourthOnboardingScreenRu(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(text(Constants.RU_TEXT_IN_FOURTH_SCREEN));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();

        return this;
    }

    @Step("Verify search field in Russian")
    public OnBoardingScreen verifySearchFieldRu(){
        $(accessibilityId(Constants.RU_TEXT_IN_SEARCH_FIELD)).shouldBe(visible);

        return this;
    }

    @Step("Check first onboarding screen in English")
    public OnBoardingScreen checkFirstOnboardingScreenEng(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(matchText("^.*"+ Constants.ENG_TEXT_IN_FIRST_SCREEN +".*?$"));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Check second onboarding screen in English")
    public OnBoardingScreen checkSecondOnboardingScreenEng(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldHave(text(Constants.ENG_TEXT_IN_SECOND_SCREEN));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Check third onboarding screen in English")
    public OnBoardingScreen checkThirdOnboardingScreenEng(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(text(Constants.ENG_TEXT_IN_THIRD_SCREEN));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();

        return this;
    }

    @Step("Check fourth onboarding screen in English")
    public OnBoardingScreen checkFourthOnboardingScreenEng(){
        $(id("org.wikipedia.alpha:id/primaryTextView")).shouldBe(text(Constants.ENG_TEXT_IN_FOURTH_SCREEN));
        $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).click();

        return this;
    }

    @Step("Verify search field in English")
    public OnBoardingScreen verifySearchFieldEng(){
        $(accessibilityId(Constants.ENG_TEXT_IN_SEARCH_FIELD)).shouldBe(visible);

        return this;
    }

}
