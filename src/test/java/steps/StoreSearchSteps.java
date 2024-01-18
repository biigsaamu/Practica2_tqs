package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import run.DriverTest;

public class StoreSearchSteps {

  private static final WebDriver driver = DriverTest.getInstance();

  private static final Functions function = Functions.getInstance();

  @When("the user clicks search stores option")
  public void theUserClicksSearchStoresOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenClassName("store-link");
  }

  @And("the user enters the city {string} in the store search bar")
  public void theUserEntersTheCityInTheStoreSearchBar(String cityName) {
    function.driverWaitSeconds(1);
    function.writeTextOnElementGivenId("search-store-input", cityName);
  }

  @And("the user clicks enter in the store search bar")
  public void theUserClicksEnterInTheStoreSearchBar() {
    function.driverWaitSeconds(1);
    WebElement KE = driver.findElement(By.id("search-store-input"));
    Actions actions = new Actions(driver);
    actions.sendKeys(KE, Keys.ENTER).build().perform();
  }

  @Then("the {string} store information is displayed")
  public void theStoreInformationIsDisplayed(String cityName) {
    function.driverWaitSeconds(1);
    //Espera a que carregui el contingut de la nova pagina. Sinó agafava l'store name de la pàgina anterior
    //ja que s'executaba abans el codi de que la pàgina estigués carregada
    String storeName = function.getTextFromElementGivenClassName("store-name");
    Assert.assertEquals(storeName, ("Abacus " + cityName));
  }

}
