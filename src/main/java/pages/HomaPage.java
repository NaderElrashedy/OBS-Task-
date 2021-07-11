package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomaPage {
    private WebDriver driver;
    private By searchField = By.cssSelector("input[name=q]");

    public HomaPage(WebDriver driver) {
        this.driver = driver;
    }

    public SearchResult searchForOBS(String name) {
        driver.findElement(searchField).sendKeys(name);
        driver.findElement(searchField).sendKeys(Keys.ENTER);
        return new SearchResult(driver);
    }


}

