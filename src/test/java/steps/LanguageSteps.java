package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import run.DriverTest;

public class LanguageSteps {

  private static final Functions function = Functions.getInstance();

  //Scenario 1
  @Then("the web language is catalan")
  public void theWebLanguageIsCatalan() {
    String llibres = function.getTextFromElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/a");
    Assert.assertEquals(llibres, "Llibres");

    String papereria = function.getTextFromElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/a");
    Assert.assertEquals(papereria, "Papereria");

    String joguines = function.getTextFromElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/a");
    Assert.assertEquals(joguines, "Joguines");
  }

  //Scenario 2
  @And("the user selects the spanish language feature")
  public void theUserSelectsTheSpanishLanguageFeature() {
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[3]/div/div/div[3]/div/ul/li[2]/a");
  }

  @Then("the web language is spanish")
  public void theWebLanguageIsSpanish() {
    String libros = function.getTextFromElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[1]/a");
    Assert.assertEquals(libros, "Libros");

    String papeleria = function.getTextFromElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/a");
    Assert.assertEquals(papeleria, "Papelería");

    String juguetes = function.getTextFromElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/a");
    Assert.assertEquals(juguetes, "Juguetes");
  }
}
