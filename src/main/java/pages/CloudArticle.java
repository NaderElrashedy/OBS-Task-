package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloudArticle {
    private WebDriver driver;
    private By articleTitle = By.cssSelector("h1.page-header span");

    public CloudArticle(WebDriver driver) {

        this.driver = driver;
    }

    public String getArticleText() {
        return driver.findElement(articleTitle).getText();


    }
}
