package lautaudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll(){
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll(){
        driver.quit();

    }

    @Test
    public void openThePageAndCheckTheTitle(){
        String expectedTitle = "Example title";
        driver.get("https://www.example.com");
        Assertions.assertEquals(expectedTitle, driver.getTitle());
        assertEquals(expectedTitle, driver.getTitle());


    }
}
