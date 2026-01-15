package tests.real;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;

import static com.codeborne.selenide.Selenide.*;

@Tag("real")
public class SearchTestsForReal extends TestBaseReal {

    SearchScreen searchScreen = new SearchScreen();

    @Test
    @DisplayName("Поиск 'Appium' в Wikipedia")
    void successfulSearchAppiumTest() {

        back();
        searchScreen.typeAndSearchAppiumRu()
                .verifyFoundContent()
        ;
    }

    @Test
    @DisplayName("Поиск 'Java' в Wikipedia")
    void successfulSearchJavaTest() {

        back();
        searchScreen.typeAndSearchJavaRu()
                .verifyFoundContent()
        ;

    }
}
