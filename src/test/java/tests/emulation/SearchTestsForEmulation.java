package tests.emulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;

import static com.codeborne.selenide.Selenide.*;

@Tag("emulation_tests")
public class SearchTestsForEmulation extends TestBaseEmulation {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @DisplayName("Поиск 'Appium' в Wikipedia")
    void successfulSearchAppiumTest() {

        back();
        searchScreen.typeAndSearchAppiumEng()
                    .verifyFoundContent()
        ;
    }

    @Test
    @DisplayName("Поиск 'Java' в Wikipedia")
    void successfulSearchJavaTest() {

        back();
        searchScreen.typeAndSearchJavaEng()
                    .verifyFoundContent()
        ;

    }
}
