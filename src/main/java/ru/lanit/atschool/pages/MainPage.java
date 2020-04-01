package ru.lanit.atschool.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.lanit.atschool.Intefaces.NameOfElement;
import ru.lanit.atschool.webdriver.WebDriverManager;


import java.util.List;

public class MainPage extends BasePage {
    private final Logger logger = Logger.getLogger(MainPage.class);

    /**
     * Метод открывает браузер на заданной странице
     * страница задается в файле config.properties.
     */
    public void openPage(String url) {
        driver.get(url);
        logger.info("Выполнен вход на страницу: " + url);
    }

    /**
     * Поле "Search". "//*[@value='Мне повезёт!']"
     */
    @NameOfElement("Поле Поиска")
    @FindBy(name = "q")
    public WebElement searchField;
    /**
     * Поле "Search".
     */
    @NameOfElement("Кнопка Мне Повезёт!")
    @FindBy(xpath = "//*[@value='Мне повезёт!']")
    public WebElement iFeelLucky;


}

