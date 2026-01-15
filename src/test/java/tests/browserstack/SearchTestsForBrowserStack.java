package tests.browserstack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;

@Tag("browserstack")
public class SearchTestsForBrowserStack extends TestBaseBrowserStack {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @DisplayName("Поиск 'Appium' в Wikipedia")
    void successfulSearchAppiumTest() {

        searchScreen.typeAndSearchAppiumEng()
                .verifyFoundContent()
        ;
    }

    @Test
    @DisplayName("Поиск 'Java' в Wikipedia")
    void successfulSearchJavaTest() {

        searchScreen.typeAndSearchJavaEng()
                .verifyFoundContent()
        ;
    }
}
