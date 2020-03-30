package ru.lanit.atschool.steps;

import io.cucumber.java.ru.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.lanit.atschool.pages.MainPage;
import ru.lanit.atschool.webdriver.WebDriverManager;

import java.util.HashMap;

public class MainPageSteps {
    WebDriver driver = WebDriverManager.getDriver();
    MainPage mainPage = new MainPage();

    @Пусть("открыт браузер и введен адрес \"(.*)\"$")
    public void openedBrowserAndEnteredUrl(String url) {
        mainPage.openPage(url);

//        driver = WebDriverManager.getDriver();
//        driver.get(url);
    }

    @Пусть("пользователь вводит \"(.*)\"$")
    public void userEnters(String arg0) {
        driver = WebDriverManager.getDriver();
        WebElement webElement = driver.findElement(By.name("q"));
    }

    @И("заведен новый пользователь")
    public void newUserRegistered() {
    }

    @Тогда("пользователь вводит учетные данные")
    public void userEnteredCredentials(HashMap<String, String> params) {
        params.get("login");
        params.get("password");
    }

    @И("вот")
    public void vot() {

    }
}
