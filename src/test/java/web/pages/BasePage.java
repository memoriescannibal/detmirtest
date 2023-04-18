package web.pages;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public abstract class BasePage {
    protected static final String BASE_URL = "http://www.detmir.ru";

    public BasePage(){
        Configuration.timeout = Duration.of(1, ChronoUnit.MINUTES).toMillis();
    }
}
