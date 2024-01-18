package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import run.DriverTest;

public class SearchBarSteps {

  private static final WebDriver driver = DriverTest.getInstance();

  private static final Functions function = Functions.getInstance();

  @When("the user enters {string} in the search bar")
  public void theUserEntersInTheSearchBar(String bookName) {
    function.driverWaitSeconds(1);
    function.writeTextOnElementGivenId("search-input-desk", bookName);
    System.out.println("Keys sent");
  }

  @And("the user clicks enter in search bar")
  public void theUserClicksEnterInSearchBar() {
    function.driverWaitSeconds(1);
    WebElement KE = driver.findElement(By.id("search-input-desk"));
    Actions actions = new Actions(driver);
    actions.sendKeys(KE, Keys.ENTER).build().perform();
  }

  @Then("the page with the results of {string} search is displayed")
  public void thePageWithTheResultsOfSearchIsDisplayed(String keysSent) {
    String searchResultsText = function.getTextFromElementGivenClassName("product-count-container");
    Assert.assertTrue(searchResultsText.contains(keysSent));
    function.driverWaitSeconds(1);
  }
}
