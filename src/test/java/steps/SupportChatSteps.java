package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import run.DriverTest;
import org.openqa.selenium.WebElement;

public class SupportChatSteps {

    private static final WebDriver driver = DriverTest.getInstance();
    private static final Functions function = Functions.getInstance();

    // Scenario: Open and close support chat
    @When("the user clicks support chat button")
    public void theUserClicksOnTheSupportChatPage() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenId("livechat-wrapper");
        function.driverWaitSeconds(1);
    }

    @Then("the support chat is displayed")
    public void theSupportChatIsDisplayed() {
        function.driverWaitSeconds(1);
        /*TODO: The path doesn't work*/
        WebElement out = driver.findElement(By.xpath("//*[@id=\"chat-wrapper\"]/div[1]/div[2]/div[2]/div[1]"));
        Assert.assertNotNull(out);
    }

    @And("the user clicks close support chat button")
    public void theUserClicksCloseSupportChatButton() {
        function.driverWaitSeconds(2);
        function.clickOnElementGivenId("livechat-wrapper");
        //*[@id="minimize-by-menu"]
    }

    @Then("the support chat is closed")
    public void theSupportChatIsClosed() {
        function.driverWaitSeconds(1);
        WebElement out = driver.findElement(By.className("chat-oct8ne-ball-icon"));
        Assert.assertNotNull(out);
    }




}