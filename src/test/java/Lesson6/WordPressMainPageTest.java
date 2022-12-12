package Lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordPressMainPageTest extends AbstractTest{
    @Test
    void clickToSport(){
        new WordPressMainPage(getWebDriver()).navigateToSport();
        Assertions.assertEquals("https://www.bbc.com/sport",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToTravel(){
        new WordPressMainPage(getWebDriver()).navigateToTravel();
    }

    @Test
    void clickToWork(){
        new WordPressMainPage(getWebDriver()).navigateToWorklife();
    }

}
