package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import run.DriverTest;

import java.time.Duration;

public class CookiesSteps {

  private static final WebDriver driver = DriverTest.getInstance();

  private static final Functions function = Functions.getInstance();


  @Given("the user is in the home page and accepts or not the cookies")
  public void theUserIsInTheHomePageAndAcceptsOrNotTheCookies() {
    driver.navigate().to("https://www.abacus.coop/ca/botiga-abacus?storeid=B027");

    //Us de WebDriverWait perque el botó d'acceptar cookies apareix amb una transició.
    //Fins que aquesta no es carrega no deixa interactuar amb l'element del botó.
    function.driverWaitSeconds(2);
    function.clickOnElementGivenId("onetrust-accept-btn-handler");
    /*
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    System.out.println("Antes de accept cookies");
    try {
      WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
      wait.until(ExpectedConditions.elementToBeClickable(cookies));
      cookies.click();
      System.out.println("Cookies aceptadas");

    } catch (org.openqa.selenium.NoSuchElementException e) {
      System.out.println("No se ha requerida aceptar cookies");
    }
    function.driverWaitSeconds(1);*/
  }

  @Then("the home screen is displayed")
  public void theHomeScreenIsDisplayed() {
    String shopName = function.getTextFromElementGivenClassName("store-name");
    Assert.assertTrue(shopName.equals("Abacus Mataró"));
  }


}
