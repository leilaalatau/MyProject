package Lesson6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginInTest extends AbstractTest{
    @Test
    void loginIn(){
        new WordPressMainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().getTitle().equals("WordPress – Sign in"), "страница входа недоступна");
        new LoginPage(getWebDriver())
                .setLogin("alatau23")
                .setPassword("ozzi?123A")
                .loginIn();
        Assertions.assertTrue(getWebDriver().findElement(By.id("idcta-username")).getText().equals("Your account"));

    }

    @Test
    void loginInSecond(){
        new WordPressMainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().getTitle().equals("WordPress – Sign in"), "страница входа недоступна");
        new LoginPage(getWebDriver())
                .loginIn("alatau23","ozzi?123A");
        Assertions.assertTrue(getWebDriver().findElement(By.id("idcta-username")).getText().equals("Your account"));
    }



    @AfterEach
    void logout(){
        new WordPressMainPage(getWebDriver()).goToAccountPage();
        Assertions.assertTrue(getWebDriver().getTitle().equals("WordPress – account overview"), "страница аккаунта не доступна");
        new AccountPage(getWebDriver()).logOut();

    }

}
