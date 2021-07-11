package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomaPage;
import pages.SearchResult;

public class BaseTests {

    private WebDriver driver;
    protected HomaPage homaPage;
@BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/en");
       // driver.manage().window().maximize();
        homaPage = new HomaPage(driver);

    }
    @AfterClass
    public void tearDown(){
    driver.quit();
    }

}