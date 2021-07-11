package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchResult {
    private WebDriver driver;
    private By orangeLink = By.cssSelector("div.yuRUbf h3");

    public SearchResult(WebDriver driver) {
        this.driver = driver;
    }

    public OrangeHome clickOrangeLink() {
        driver.findElement(orangeLink).click();
        return new OrangeHome(driver);
    }
}