package ru.lanit.atschool.steps;

import io.cucumber.java.ru.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.lanit.atschool.helpers.ConfigReader;
import ru.lanit.atschool.pages.MainPage;
import ru.lanit.atschool.webdriver.WebDriverManager;

import java.io.IOException;
import java.util.HashMap;

public class MainPageSteps {


    MainPage mainPage = new MainPage();
    protected final Wait<WebDriver> wait = new WebDriverWait(WebDriverManager.getDriver(), 100, 1000);

    @Пусть("открыт браузер и введен адрес сайта$")
    public void openedBrowserAndEnteredUrl() throws IOException {
        mainPage.openPage(ConfigReader.getStringSystemProperty("url"));
    }

    @Пусть("^пользователь вводит поисковый запрос в \"(.*)\"$")
    public void userEnters(String string) throws InterruptedException {
       WebElement webElement = mainPage.get(string);
       wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
        try {
            webElement.sendKeys(ConfigReader.getStringSystemProperty("searchWord"));
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    @И("нажата кнопка {string}")
    public void pressButton(String button) {
        mainPage.get(button).click();
    }
}
