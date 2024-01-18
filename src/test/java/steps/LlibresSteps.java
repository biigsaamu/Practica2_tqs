package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import run.DriverTest;

public class LlibresSteps {

  private static final WebDriver driver = DriverTest.getInstance();
  private static final Functions function = Functions.getInstance();



  //Scenario Fiction
  @When("the user clicks books option")
  public void theUserClicksBooksOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/a");
    System.out.println("Llibres clicked");
  }

  @And("the user selects fiction option")
  public void theUserSelectsFictionOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a");
    System.out.println("Fiction selected");
  }

  @Then("the fiction page is displayed")
  public void theFictionPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Llibres de Narrativa i Novel·les");
  }

  //Scenario Non-fiction
  @And("the user selects non-fiction option")
  public void theUserSelectsNonFictionOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a");
    System.out.println("Non-fiction selected");
  }

  @Then("the non-fiction page is displayed")
  public void theNonFictionPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Llibres no ficció");
  }

  //Scenario books for youth people
  @And("the user selects youth option")
  public void theUserSelectsYouthOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[3]/a");
    System.out.println("Youth selected");
  }

  @Then("the youth page is displayed")
  public void theYouthPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Llibres juvenils");
  }

  //Scenario books for children
  @And("the user selects children option")
  public void theUserSelectsChildrenOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[4]/a");
    System.out.println("Children selected");
  }

  @Then("the children page is displayed")
  public void theChildrenPageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"carousel-4af3bf038e7f1d53f3d079ec8a\"]/div[1]/div[1]/figure/figcaption/div[1]/div[1]/span");
    Assert.assertEquals(pageTitle, "LA NOSTRA TRIA DE LLIBRES INFANTILS!");
  }

  //Scenario Comics and manga
  @And("the user selects comics and manga option")
  public void theUserSelectsComicsAndMangaOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[5]/a");
    System.out.println("Comic and manga selected");
  }

  @Then("the comics and manga page is displayed")
  public void theComicsAndMangaPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"d398f79728d3d0bfcef7d310c6\"]/div/div/figure/div/div/h1/span[2]");
    Assert.assertEquals(pageTitle, "CÒMIC!");
  }

  //Scenario textbooks
  @And("the user selects textbooks option")
  public void theUserSelectsTextbooksOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[6]/a");
    System.out.println("Textbooks selected");
  }

  @Then("the textbooks page is displayed")
  public void theTextbooksPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("breadcrumb-item");
    Assert.assertEquals(pageTitle, "Llibres de Text");
  }

  //Scenario Literature books
  @And("the user hovers the mouse over fiction category")
  public void theUserHoversTheMouseOverFictionCategory() {
    function.hoverElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a");
    System.out.println("Element hovered");
    function.driverWaitSeconds(1);
  }

  @And("the user clicks the literature option")
  public void theUserClicksTheLiteratureOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[1]/div/div/div/div/div[3]/ul/li[2]/a");
    System.out.println("Literatura clicked");
  }

  //Scenario IT books
  @Then("the literature page is displayed")
  public void theLiteraturePageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Literatura");
  }

  @And("the user hovers the mouse over non-fiction category")
  public void theUserHoversTheMouseOverNonFictionCategory() {
    function.hoverElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a");
    System.out.println("Element hovered");
  }

  @And("the user clicks the IT option")
  public void theUserClicksTheITOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/div/ul/li[2]/div/div/div/div/div[4]/ul/li[2]/a");
    System.out.println("IT clicked");
  }

  @Then("the IT page is displayed")
  public void theITPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Llibres d'Informàtica");
  }

}
