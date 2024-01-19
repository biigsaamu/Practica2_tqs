package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import run.DriverTest;

public class LoginSteps {

  private static final WebDriver driver = DriverTest.getInstance();
  private static final Functions function = Functions.getInstance();

  @When("the user clicks login button")
  public void theUserClicksLoginButton() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"logintab1\"]/form/button");
  }

  @Then("a massage error {string} appears in both fields \\(user and pwd)")
  public void aMassageErrorAppearsInBothFieldsUserAndPwd(String errorMessage) {
    String userFieldMessage = function.getTextFromElementGivenXpath("//*[@id=\"logintab1\"]/form/div[1]/div");
    String pwdFieldMessage = function.getTextFromElementGivenXpath("//*[@id=\"logintab1\"]/form/div[2]/div/div");
    Assert.assertEquals(userFieldMessage, errorMessage);
    Assert.assertEquals(pwdFieldMessage, errorMessage);
    function.driverWaitSeconds(1);
  }


  @When("the user enters {string} in user field and {string} pwd field")
  public void theUserEntersInUserFieldAndPwdField(String user, String pwd) {
    function.writeTextOnElementGivenId("dwfrm_profile_customer_email", user);
    function.writeTextOnElementGivenId("dwfrm_profile_login_password", pwd);
  }

  @Then("a massage error {string} appears in pwd field")
  public void aMassageErrorAppearsInPwdField(String errorMessage) {
    String pwdFieldMessage = function.getTextFromElementGivenXpath("//*[@id=\"logintab1\"]/form/div[2]/div/div");
    Assert.assertEquals(pwdFieldMessage, errorMessage);
    function.driverWaitSeconds(1);
  }

  @Then("a massage error {string} appears in user field")
  public void aMassageErrorAppearsInUserField(String errorMessage) {
    String userFieldMessage = function.getTextFromElementGivenXpath("//*[@id=\"logintab1\"]/form/div[1]/div");
    Assert.assertEquals(userFieldMessage, errorMessage);
    function.driverWaitSeconds(1);
  }


  @When("the user enters a wrong mail and right pwd")
  public void theUserEntersAWrongMailAndRightPwd() {
    function.writeTextOnElementGivenId("dwfrm_profile_customer_email", "incorrect@gmail.com");
    function.writeTextOnElementGivenId("dwfrm_profile_login_password", "P2tqs2024");
  }

  @Then("a massage error {string} appears in the form")
  public void aMassageErrorAppearsInTheForm(String errorMessage) {
    function.driverWaitSeconds(2);
    String feedbackError = function.getTextFromElementGivenClassName("invalid-feedback-form");
    Assert.assertEquals(feedbackError, errorMessage);
  }

  @When("the user enters a right mail and wrong pwd")
  public void theUserEntersARightMailAndWrongPwd() {
    function.writeTextOnElementGivenId("dwfrm_profile_customer_email", "samupautqs@gmail.com");
    function.writeTextOnElementGivenId("dwfrm_profile_login_password", "P2tqs2023");
  }

  @Then("the user {string} profile page appears")
  public void theUserProfilePageAppears(String user) {
    function.driverWaitSeconds(5);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[1]/div/h1");
    String userMail = function.getTextFromElementGivenXpath(
        "//*[@id=\"maincontent\"]/div[1]/div[2]/div[2]/div[1]/div[1]/p[2]/span");
    Assert.assertEquals(pageTitle, "El meu compte");
    Assert.assertEquals(userMail, user);
  }



  //Logout scenario
  @Given("the user profile page")
  public void theUserProfilePage() {
    driver.navigate().to("https://www.abacus.coop/ca/meu-compte");
  }

  @When("user clicks logout button")
  public void userClicksLogoutButton() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[2]/div[1]/div[2]/a[2]");
  }

  @Then("the register or login page appears")
  public void theRegisterOrLoginPageAppears() {
    function.driverWaitSeconds(1);
    String loginTitle = function.getTextFromElementGivenXpath("//*[@id=\"logintab1\"]/h2");
    Assert.assertEquals(loginTitle, "Iniciar sessió");
  }

}
