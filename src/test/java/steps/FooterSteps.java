package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import run.DriverTest;

public class FooterSteps {
  private static final WebDriver driver = DriverTest.getInstance();

  private static final Functions function = Functions.getInstance();

  //Scenario: About us
  @When("the user clicks about us option")
  public void theUserClicksAboutUsOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[1]/div[2]/div[1]/div/div/ul/li[1]/a");
    System.out.println("Clicked in about us");
    function.driverWaitSeconds(1);
  }

  @Then("the about us page is displayed")
  public void theAboutUsPageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromNewPageGivenXpath("//*[@id=\"genesis-content\"]/article/header/div[1]/span/span[2]");
    Assert.assertEquals(pageTitle, "Cooperativa");
  }
  //Scenario: Membership
  @When("the user clicks membership option")
  public void theUserClicksMembershipOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[1]/div[2]/div[2]/div/div/ul/li[2]/a");
    System.out.println("Clicked in membership");
    function.driverWaitSeconds(1);
  }

  @Then("the membership subscription form appears")
  public void theMembershipSubscriptionFormAppears() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromNewPageGivenXpath("//*[@id=\"yosoyabacus-header\"]");
    Assert.assertEquals(pageTitle, "Fes-te soci");
    function.driverWaitSeconds(1);
  }

  // Scenario: Frequent questions
  @When("the user clicks frequent questions option")
  public void theUserClicksFrequentQuestionsOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[1]/div[2]/div[3]/div/div/ul/li[1]/a");
    System.out.println("Clicked in frequent questions");
    function.driverWaitSeconds(1);
  }

  @And("the user selects a question")
  public void theUserSelectsAQuestion() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/ul/li[3]");
    System.out.println("Question selected");
    function.driverWaitSeconds(1);
  }

  @Then("the question information appears")
  public void theQuestionInformationAppears() {
    function.driverWaitSeconds(1);
    String answer = driver.findElement(By.xpath("//*[@id=\"03\"]/div/p")).getText();
    Assert.assertEquals(answer, "Es poden efectuar compres en tot el territori espanyol peninsular i a les Illes Balears.");
    function.driverWaitSeconds(1);
  }

  //Scenario: Contact us
  @When("the user clicks contact us option")
  public void theUserClicksContactUsOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[1]/div[2]/div[4]/div/div/ul/li[1]/span[1]/a");
    System.out.println("Clicked in contact us");
    function.driverWaitSeconds(1);
  }

  @Then("the contact us page is displayed")
  public void theContactUsPageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/h1");
    Assert.assertEquals(pageTitle, "Contacta amb Abacus");
    function.driverWaitSeconds(1);
  }

  //Scenario: Youtube
  @When("the user clicks youtube option")
  public void theUserClicksYoutubeOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[1]/div[2]/div[5]/div/div/ul/li[4]/a");
    System.out.println("Clicked in youtube");
    function.driverWaitSeconds(3);
  }
  @And("the user refuses the youtube cookies")
  public void theUserRefusesTheYoutubeCookies() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/div/div[2]/div[1]/div[3]/div[1]/form[1]/div/div/button");
    System.out.println("Clicked in refuse cookies");
    function.driverWaitSeconds(1);
  }

  @Then("the youtube page is displayed")
  public void theYoutubePageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"text\"]");
    Assert.assertEquals(pageTitle, "Abacus");
  }

  //Scenario: Cookies policy
  @When("the user clicks cookies policy option")
  public void theUserClicksCookiesPolicyOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[2]/div/div/div/div[2]/ul/li[5]/a");
    System.out.println("Clicked in cookies policy");
    function.driverWaitSeconds(1);
  }

  @Then("the cookies policy page is displayed")
  public void theCookiesPolicyPageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div/div/h1");
    Assert.assertEquals(pageTitle, "Política d'ús de Cookies");
    function.driverWaitSeconds(1);
  }

  //Scenario: Map
  @When("the user clicks map option")
  public void theUserClicksMapOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[2]/div/div/div/div[2]/ul/li[2]/a");
    System.out.println("Clicked in map");
    function.driverWaitSeconds(1);
  }

  @Then("the map page is displayed")
  public void theMapPageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"wrapper-e4a24e0e81b13d141adec25d3e\"]/div[1]/a/p");
    Assert.assertEquals(pageTitle, "Mapa del Lloc");
    function.driverWaitSeconds(1);
  }

  //Scenario: Terms and conditions
  @When("the user clicks terms and conditions option")
  public void theUserClicksShoppingConditionsOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[2]/div/div/div/div[2]/ul/li[3]/a");
    System.out.println("Clicked in shopping conditions");
    function.driverWaitSeconds(1);
  }

  @Then("the terms and conditions page is displayed")
  public void theShoppingConditionsPageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div/div/h1");
    Assert.assertEquals(pageTitle, "Condicions de compra");
    function.driverWaitSeconds(1);
  }

  //Scenario: Privacy policy
  @When("the user clicks privacy policy option")
  public void theUserClicksPrivacyPolicyOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[2]/div/div/div/div[2]/ul/li[4]/a");
    System.out.println("Clicked in privacy policy");
    function.driverWaitSeconds(1);
  }

  @Then("the privacy policy page is displayed")
  public void thePrivacyPolicyPageIsDisplayed() {
    function.driverWaitSeconds(1);
    String pageTitle = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div/div/h1");
    Assert.assertEquals(pageTitle, "Política de privadesa de dades");
    function.driverWaitSeconds(1);
  }
}
