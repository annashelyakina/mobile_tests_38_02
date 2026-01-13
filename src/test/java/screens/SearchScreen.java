package screens;

import io.qameta.allure.Step;
import tests.Constants;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchScreen {

    @Step("Type and search 'Appium' in English Wikipedia")
    public SearchScreen typeAndSearchAppiumEng(){
        $(accessibilityId(Constants.ENG_TEXT_IN_SEARCH_FIELD)).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(Constants.APPIUM);

        return this;
    }

    @Step("Type and search 'Java' in English Wikipedia")
    public SearchScreen typeAndSearchJavaEng(){
        $(accessibilityId(Constants.ENG_TEXT_IN_SEARCH_FIELD)).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(Constants.JAVA);

        return this;
    }

    @Step("Type and search 'Appium' in Russian Wikipedia")
    public SearchScreen typeAndSearchAppiumRu(){
        $(accessibilityId(Constants.RU_TEXT_IN_SEARCH_FIELD)).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(Constants.APPIUM);

        return this;
    }

    @Step("Type and search 'Java' in Russian Wikipedia")
    public SearchScreen typeAndSearchJavaRu(){
        $(accessibilityId(Constants.RU_TEXT_IN_SEARCH_FIELD)).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(Constants.JAVA);

        return this;
    }

    @Step("Verify found content")
    public SearchScreen verifyFoundContent(){
        $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));

        return this;
    }
}
