package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CloudPage {
    private WebDriver driver;
    private By CloudArticle = By.xpath("//a[@href='/en/products/managed-applications']");

    public CloudPage(WebDriver driver) {
        this.driver = driver;

    }

    public CloudArticle chooseCloudArticle() {
        driver.findElement(CloudArticle).click();
        return new CloudArticle(driver);
    }
}
