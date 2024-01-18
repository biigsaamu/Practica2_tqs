package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import run.DriverTest;

public class ProductDetailsSteps {

  private static final WebDriver driver = DriverTest.getInstance();

  private static final Functions function = Functions.getInstance();

  //Scenario book
  @And("the user selects La cuenta atras para el verano book")
  public void theUserSelectsLaCuentaAtrasParaElVeranoBook() {
    function.driverWaitSeconds(1);
    String bookTitle = function.getTextFromElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/h3/a");

    Assert.assertTrue(bookTitle.contains("La cuenta atrás para el verano"));

    assert bookTitle.contains("La cuenta atrás para el verano");
    function.clickOnElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/h3/a");
  }

  @Then("{string} information is displayed")
  public void informationIsDisplayed(String productName) {
    String productWebName = function.getTextFromElementGivenClassName("product-name");
    Assert.assertEquals(productWebName, productName);
    function.driverWaitSeconds(1);
  }

  //Scenario UNO
  @And("the user selects UNO game")
  public void theUserSelectsUNOGame() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/h3/a");
    System.out.println("UNO selected");
  }


  //Scenario White glue
  @And("the user selects the withe glue")
  public void theUserSelectsTheWitheGlue() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/h3/a");
    System.out.println("Cola blanca product selected");
  }

  //Scenario Atomic Habits book
  @And("the user selects the Atomic Habits book")
  public void theUserSelectsTheAtomicHabitsBook() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[1]/h3/a");
    System.out.println("Hábitos Atómicos book selected");
  }

  //Scenario Sapiens book
  @And("the user selects the Sapiens book")
  public void theUserSelectsTheSapiensBook() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[3]/div[1]/div/div/div[2]/div[1]/div[1]/h3/a");
    System.out.println("Sapiens book selected");
  }

}
