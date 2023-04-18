package web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import web.pages.MainPage;
import web.pages.SearchResultPage;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class DetMirTest {

    @Test
    public void TestHinting(){
        String searchText = "синий трактор";

        new MainPage().openSearch()
                      .fillSearchText(searchText)
                      .clickFirstHinting();

        new SearchResultPage().checkResultGreaterThan(1)
                              .checkSearchText(searchText);
    }

}
