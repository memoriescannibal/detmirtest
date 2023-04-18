package web.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage {
    private ElementsCollection searchResult = $$x("//section[@class='It Ix wo']");
    private SelenideElement searchText = $x("//span[@class='gV']");

    public SearchResultPage(){
        searchText.shouldBe(Condition.visible);
    }
    public SearchResultPage checkResultGreaterThan(int i){
        searchResult.shouldBe(CollectionCondition.sizeGreaterThan(i));
        return this;
    }

    public SearchResultPage checkSearchText(String SearchText){
        String formatedSearchText = searchText.getAttribute("innerHTML").replaceAll("(«|<|!|-|>|»)", "").trim();
        Assertions.assertThat(formatedSearchText).isEqualTo(SearchText);
        return this;
    }

}
