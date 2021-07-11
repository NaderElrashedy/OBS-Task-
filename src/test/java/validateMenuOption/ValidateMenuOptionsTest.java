package validateMenuOption;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeHome;
import pages.Products;
import pages.SearchResult;

import java.util.Arrays;
import java.util.List;

public class ValidateMenuOptionsTest extends BaseTests {
    String[] dropDownOptions = {"Business innovation", "cloud", "collaborative workspace", "Customer Exp", "Cyber defense", "Data intelligence"
            , "IOT", "Mobile connectivity", "Network transformation", "Services"};


    @Test
    public void testSuccessfullyOrangeHome() {
        SearchResult searchResult = homaPage.searchForOBS("Orange Business services");
        OrangeHome orangeHome = searchResult.clickOrangeLink();
        orangeHome.clickOnSolutions();
        Products products = orangeHome.clickOnAllProducts();
        List allLIst = products.getAllOptions();
        //Convert array to list for easy comparison
        List newOption = Arrays.asList(dropDownOptions);
        // check if one list contains any element of other list
        boolean var = allLIst.stream().filter(element -> newOption.contains(element)).findFirst().isPresent();
        Assert.assertTrue(var);


    }
}
