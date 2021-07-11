package validateRightArticle;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class ValidateRightArticleTest extends BaseTests {
    @Test
    public void testSuccessfullyOrangeHome() {
        SearchResult searchResult = homaPage.searchForOBS("Orange Business services");
        OrangeHome orangeHome = searchResult.clickOrangeLink();
        orangeHome.clickOnSolutions();
        Products products = orangeHome.clickOnAllProducts();
        CloudPage cloudPage = products.selectCloud();
        CloudArticle cloudArticle = cloudPage.chooseCloudArticle();
        cloudArticle.getArticleText();
        Assert.assertEquals(cloudArticle.getArticleText(),
                "Managed Applications: improve operational capability in the cloud",
                "Text does not match");

    }

}
