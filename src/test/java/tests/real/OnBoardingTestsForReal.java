package tests.real;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.OnBoardingScreen;

@Tag("real")
public class OnBoardingTestsForReal extends TestBaseReal {

    OnBoardingScreen onBoardingScreen = new OnBoardingScreen();

    @Test
    @DisplayName("Successful navigation through onboarding screens")
     void checkOnBoardingScreenRu() {
        onBoardingScreen.checkFirstOnboardingScreenRu()
                .checkSecondOnboardingScreenRu()
                .checkThirdOnboardingScreenRu()
                .checkFourthOnboardingScreenRu()
                .verifySearchFieldRu()
        ;
    }
}