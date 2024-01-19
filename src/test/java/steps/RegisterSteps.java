package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
    function.writeTextOnElementGivenId("dwfrm_registrationemail_email", "aaaa@gmail.com");
  }

  @And("the user clicks the register button")
  public void theUserClicksTheRegisterButton() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"content2\"]/form/button");
    //function.submitEnterToElementGivenXpath("//*[@id=\"dwfrm_abacusmember_email\"]");
  }

  @And("the user clicks the register button of the form")
  public void theUserClicksTheRegisterButtonOfTheForm() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/button");
  }

  @Then("a message error {string} appears in all fields")
  public void aMessageErrorAppearsInAllFields(String errorMessage) {

    aMessageErrorAppearsInNameField(errorMessage);

    aMessageErrorAppearsInLastnameField(errorMessage);

    aMessageErrorAppearsInPwdField(errorMessage);

    aMessageErrorAppearsInConfirmPwdField(errorMessage);

    aMessageErrorAppearsInPrivacyPolicyField(errorMessage);
  }


  //Name field
  @And("the user fills the name field")
  public void theUserFillsTheNameField() {
    function.writeTextOnElementGivenId("dwfrm_profile_customer_firstname", "Arnau");
  }

  @Then("a message error {string} appears in name field")
  public void aMessageErrorAppearsInNameField(String errorMessage) {
    String nomFieldErrorMessage = function.getTextFromElementGivenXpath(
        "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/div[1]/div");
    Assert.assertEquals(nomFieldErrorMessage, errorMessage);
  }

  //Cognoms field
  @And("the user fills the lastname field")
  public void theUserFillsTheLastnameField() {
    function.writeTextOnElementGivenId("dwfrm_profile_customer_lastname", "Colomer");
  }

  @Then("a message error {string} appears in lastname field")
  public void aMessageErrorAppearsInLastnameField(String errorMessage) {
    String cognomsFieldErrorMessage = function.getTextFromElementGivenXpath(
        "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/div[2]/div");
    Assert.assertEquals(cognomsFieldErrorMessage, errorMessage);
  }

  //Pwd field
  @And("the user fills the pwd field")
  public void theUserFillsThePwdField() {
    function.writeTextOnElementGivenId("dwfrm_profile_login_password", "abcde12345");
  }

  @Then("a message error {string} appears in pwd field")
  public void aMessageErrorAppearsInPwdField(String errorMessage) {
    String pwdFieldErrorMessage = function.getTextFromElementGivenXpath(
        "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/div[4]/div/div");
    Assert.assertEquals(pwdFieldErrorMessage, errorMessage);
  }

  //Confirm pwd field
  @And("the user fills the confirm pwd field")
  public void theUserFillsTheConfirmPwdField() {
    function.writeTextOnElementGivenId("dwfrm_profile_login_passwordconfirm", "abcde12345");
  }

  @Then("a message error {string} appears in confirm pwd field")
  public void aMessageErrorAppearsInConfirmPwdField(String errorMessage) {
    String confirmPwdFieldErrorMessage = function.getTextFromElementGivenXpath(
        "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/div[5]/div/div");
    Assert.assertEquals(confirmPwdFieldErrorMessage, errorMessage);
  }

  //Privacy policy (only message error as was not possible to accept them. Explained in the report)
  @Then("a message error {string} appears in privacy policy field")
  public void aMessageErrorAppearsInPrivacyPolicyField(String errorMessage) {
    String privacyPolicyFieldErrorMessage = function.getTextFromElementGivenXpath(
        "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/div[6]/div[2]");
    Assert.assertEquals(privacyPolicyFieldErrorMessage, errorMessage);
    function.driverWaitSeconds(1);
  }

  @And("the user fill in the fields")
  public void theUserFillInTheFields() {
    theUserFillsTheNameField();
    theUserFillsTheLastnameField();
    theUserFillsThePwdField();
    theUserFillsTheConfirmPwdField();
    function.driverWaitSeconds(1);
  }


  @And("the user fills wrong the pwd field")
  public void theUserFillsWrongThePwdField() {
    function.writeTextOnElementGivenId("dwfrm_profile_login_password", "a");
    function.driverWaitSeconds(1);
  }

  @And("the user fills wrong the confirm pwd field")
  public void theUserFillsWrongTheConfirmPwdField() {
    function.writeTextOnElementGivenId("dwfrm_profile_login_passwordconfirm", "a");
    function.driverWaitSeconds(1);
  }

  //METHOD FAIL (Element not interactable)
  @And("the user accepts the privacy policy")
  public void theUserAcceptsThePrivacyPolicy() {
    function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/form/div[6]/label");
    //Appears pop up message, that we wait until os displayed completely and close it
    function.driverWaitSeconds(4);

    //Fall no deixa clicar a l'element i pert tant acceptar les polítiques de privacitat
    function.clickOnElementGivenXpath("//*[@id=\"privacypolicy-close-btn\"]");
  }
}
