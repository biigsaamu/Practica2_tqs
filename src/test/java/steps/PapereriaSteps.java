package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import run.DriverTest;

public class PapereriaSteps {

  private static final WebDriver driver = DriverTest.getInstance();
  private static final Functions function = Functions.getInstance();

  //Scenario: Arts
  @And("the user clicks stationery option")
  public void theUserClicksStationeryOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/a");
    System.out.println("Papereria selected");
  }

  @And("the user clicks arts category")
  public void theUserClicksArtsCategory() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a");
    System.out.println("Arts selected");
  }

  @Then("the arts page is displayed")
  public void theArtsPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Material belles arts i coloring");
  }

  //Scenario: Crafts
  @And("the user clicks crafts category")
  public void theUserClicksCraftsCategory() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a");
    System.out.println("Manualitats selected");
  }

  @Then("the crafts page is displayed")
  public void theCraftsPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Material per a manualitats");
  }

  //Scenario: School Supplies
  @And("the user clicks school supplies category")
  public void theUserClicksSchoolSuppliesCategory() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[4]/a");
    System.out.println("Material escolar selected");
  }

  @Then("the school supplies page is displayed")
  public void theSchoolSuppliesPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Motxilles i estoigs");
  }

  //Secenario: Cricut
  @And("the user clicks cricut category")
  public void theUserClicksCricutCategory() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[5]/a");
    System.out.println("Cricut selected");
  }

  @Then("the cricut page is displayed")
  public void theCricutPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"cricut_LP\"]/div/div[1]/figure/div/div/h1");
    Assert.assertEquals(pageTitle, "Crea tot el que imagines!");
  }

  //Scenario: Technology
  @And("the user clicks technology category")
  public void theUserClicksTechnologyCategory() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[6]/a");
    System.out.println("Tecnologia selected");
  }

  @Then("the technology page is displayed")
  public void theTechnologyPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Informàtica: portàtils, tablets i altres");
  }

  //Scenario: Gift
  @And("the user clicks gift category")
  public void theUserClicksGiftCategory() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[7]/a");
        System.out.println("Regals selected");
  }

  @Then("the gift page is displayed")
  public void theGiftPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Idees per regalar");
  }

  //Scenario: Brands
  @And("the user clicks brands category")
  public void theUserClicksBrandsCategory() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[8]/a");
  }

  @Then("the brands page is displayed")
  public void theBrandsPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Marques més buscades de Papereria i Manualitats");
  }

  //Scenario: White glue
  @And("the user hovers the mouse over crafts category")
  public void theUserHoversTheMouseOverCraftsCategory() {
    function.hoverElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a");
    System.out.println("Manualitats hovered");
    function.driverWaitSeconds(1);
  }

  @And("the user clicks white glue option")
  public void theUserClicksWhiteGlueOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[2]/div/div/div/div/div[2]/ul/li[2]/a");
    System.out.println("Cola blanca option selected");
  }

  @Then("the white glue page is displayed")
  public void theWhiteGluePageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Cola blanca");
  }

  //Scenario: Arts
  @And("the user hovers the mouse over arts category")
  public void theUserHoversTheMouseOverArtsCategory() {
    function.hoverElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[1]/a");
    System.out.println("Arts hovered");
    function.driverWaitSeconds(1);
  }

  @And("the user clicks oil painting option")
  public void theUserClicksOilPaintingOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[1]/div/div/div/div/div[1]/ul/li[4]/a");
    System.out.println("Oil option selected");
  }

  @Then("the oil painting page is displayed")
  public void theOilPaintingPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Pintura a l'oli");
  }
}
