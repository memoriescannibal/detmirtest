package web.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage extends BasePage {
    private SelenideElement searhButton = $x("//*[text()[contains(.,'Поиск')]]/..");
    private SelenideElement searchInput = $x("//input[@type='search']");

    private SelenideElement firstHinting = $x("//div[@class='le']//div");

    public MainPage(){
        Configuration.browser = "firefox";
        open(BASE_URL);
    }

    public MainPage openSearch(){

        searhButton.shouldBe(enabled).click();
        return this;
    }

    public MainPage fillSearchText(String str){
        searchInput.shouldBe(enabled).val(str);
        return this;
    }

    public SearchResultPage clickFirstHinting(){
        firstHinting.shouldBe(visible).click();
        return page(SearchResultPage.class);
    }



}
