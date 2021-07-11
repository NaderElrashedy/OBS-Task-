package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class Products {

    private WebDriver driver;
    private By dropDownList = By.id("edit-solutions");
    private By applyButton = By.id("edit-submit-subhomes");
    String[] dropDownOptions = {"Solution", "Business innovation", "cloud", " collaborative workspace", "Customer experience", "Cyberdefense", "Data intelligence"
            , "Internet of Things", "Mobile connectivity", "Network transformation", "Services"};
    boolean compare = false;


    public Products(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getAllOptions() {
        Select options = new Select(driver.findElement(dropDownList));
        List<WebElement> elements = options.getOptions();
        //loop for all option and get name and collect them in a list 
        return elements.stream().map(e -> e.getText()).collect(Collectors.toList());

    }


    public CloudPage selectCloud() {
        Select op = new Select(driver.findElement(dropDownList));
        op.selectByValue("Cloud");
        driver.findElement(applyButton).click();
        return new CloudPage(driver);

    }


}
