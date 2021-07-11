package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class OrangeHome {
    private WebDriver driver;
    private By solutions = By.linkText("Solutions");
    private By allProducts = By.linkText("All products");

    public OrangeHome(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSolutions() {
        driver.findElement(solutions).click();
    }

    public Products clickOnAllProducts() {
        driver.findElement(allProducts).click();
        return new Products(driver);
    }

}
