/**
 * Класс хуков
 * Автор Васильев И.Н. atcc@mail.ru
 * 02.12.2018
 */
package ru.lanit.atschool.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import ru.lanit.atschool.webdriver.WebDriverManager;

public class Hooks {
    public final Logger logger = Logger.getLogger(getClass());

    /**
     * Хук для подготовки к запуску сценария
     *
     * @param scenario = Имя сценария
     */
    @Before
    public void beforeScenario(Scenario scenario) {
        logger.info("Началось выполнение сценария " + scenario.getName());

    }

    /**
     * Хук для дебага
     *
     * @param scenario = Имя сценария
     */
    @After
    public void afterScenario(Scenario scenario) {
        logger.info("Закончилось выполнение сценария " + scenario.getName());
        WebDriverManager.quit();
    }
}
