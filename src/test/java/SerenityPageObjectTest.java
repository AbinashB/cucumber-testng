import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClearTripHomePage;

/**
 * Created by abiswal on 5/17/17.  this is simple test for using annotation
 */


public class SerenityPageObjectTest {

    @Managed(driver = "chrome")
    WebDriver driver;


    ClearTripHomePage homepage;

    @Test
    public void serenityPageObjectTest() throws InterruptedException {
        String headertext;
        String link_name="Flight";
        homepage.open();
        homepage.clickOnFlightLink();
        headertext=homepage.getTextFromTheHeader();
        Assert.assertTrue(headertext.contains(link_name.toLowerCase()));
    }


}
