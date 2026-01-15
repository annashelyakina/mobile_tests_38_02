package tests.emulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.OnBoardingScreen;

@Tag("emulation")
public class OnBoardingTestsForEmulation extends TestBaseEmulation {

    OnBoardingScreen onBoardingScreen = new OnBoardingScreen();

    @Test
    @DisplayName("Successful navigation through onboarding screens")
    public void checkOnBoardingScreenEng() {
        onBoardingScreen
                .checkFirstOnboardingScreenEng()
                .checkSecondOnboardingScreenEng()
                .checkThirdOnboardingScreenEng()
                .checkFourthOnboardingScreenEng()
                .verifySearchFieldEng()
        ;
    }
}