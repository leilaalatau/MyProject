package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WordPressMainPage extends AbstractPage{
    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-sport>a")
    private WebElement sport;

    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-reeldotcom>a")
    private WebElement reel;

    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-worklife>a")
    private WebElement worklife;

    @FindBy(css = "div.orb-nav-section.orb-nav-links.orb-nav-focus>ul>li.orb-nav-traveldotcom>a")
    private WebElement travel;

    @FindBy(id = "idcta-username")
    private WebElement signIn;

    public WordPressMainPage(WebDriver driver){
        super(driver);

    }


    public void navigateToSport() {
    }

    public void navigateToTravel() {
    }

    public void navigateToWorklife() {
    }

    public void goToAccountPage() {
    }
}
