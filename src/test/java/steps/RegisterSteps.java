package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import run.DriverTest;

import java.time.Duration;


public class RegisterSteps {

  private static final WebDriver driver = DriverTest.getInstance();

  private static final Functions function = Functions.getInstance();


  @Given("the user is in the register or login page and accepts or not the cookies")
  public void theUserIsInTheRegisterOrLoginPageAndAcceptsOrNotTheCookies() {
    driver.navigate().to("https://www.abacus.coop/ca/identificat");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    System.out.println("Antes de accept cookies");
    try {
      WebElement cookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
      wait.until(ExpectedConditions.elementToBeClickable(cookies));
      cookies.click();
      System.out.println("Cookies aceptadas");

    } catch (org.openqa.selenium.NoSuchElementException e) {
      System.out.println("No se ha requerida aceptar cookies");
    }
    function.driverWaitSeconds(1);
  }

  @And("the user selects the not member option")
  public void theUserSelectsTheNotMemberOption() {
    function.clickOnElementGivenXpath("//*[@id=\"logintab2\"]/div/ul/li[2]");
  }

  @And("the user enters the mail")
  public void theUserEntersTheMail() {
    // Esperem dos segons perquè hi ha una animació
    function.driverWaitSeconds(2);
    function.writeTextOnElementGivenId("dwfrm_registrationemail_email", "winef86706@grassdev.com");
  }


  @And("the user clicks enter register")
  public void theUserClicksEnterRegister() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"content2\"]/form/button");
    //function.submitEnterToElementGivenXpath("//*[@id=\"dwfrm_abacusmember_email\"]");
  }

  @And("the user fill in the fields")
  public void theUserFillInTheFields() {

    function.writeTextOnElementGivenId("dwfrm_profile_customer_firstname", "Arnau");
    function.writeTextOnElementGivenId("dwfrm_profile_customer_lastname", "Colomer");
    function.writeTextOnElementGivenId("dwfrm_profile_login_password", "abcde12345");
    function.writeTextOnElementGivenId("dwfrm_profile_login_passwordconfirm", "abcde12345");
    function.driverWaitSeconds(1);
  }


  @And("the user accepts the privacy policy")
  public void theUserAcceptsThePrivacyPolicy() {
    function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/div[6]/label");
    //Appears pop up message, that we wait until os displayed completely and close it
    function.driverWaitSeconds(4);

    //Fall no deixa clicar a l'element i pert tant acceptar les polítiques de privacitat
    function.clickOnElementGivenXpath("//*[@id=\"privacypolicy-close-btn\"]");
  }


  @And("the user submits the register")
  public void theUserSubmitsTheRegister() {
    function.driverWaitSeconds(1);
    function.submitEnterToElementGivenClassName("aba-btn-primary");
  }

}
