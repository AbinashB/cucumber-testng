import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Created by abiswal on 5/17/17.  this is simple test for using annotation
 */


public class SerenityBDDTest extends RunnerClassTestForOneWay {

    WebElement element;
    String link_name="Flights";

    @Given("The app is launched")
    public void given(){
        driver.get("http://cleartrip.com");
    }

    @When("User clicked on the link")
    public void when(){
        driver.findElement(By.linkText(link_name)).click();
    }


    @Then("Text on the header should be dispayed")
    public void then(){
        element= driver.findElement(By.tagName("h1"));
        Assert.assertTrue(element.getText().contains(link_name.toLowerCase()));
    }

    @Test
    public void serenityBDDTest() throws InterruptedException {
        given();
        when();
        then();
    }
}

