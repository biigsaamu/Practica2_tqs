package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import run.DriverTest;

import java.time.Duration;

public class SideBarSteps {

  private static final WebDriver driver = DriverTest.getInstance();
  private static final Functions function = Functions.getInstance();

  //Scenario Deals
  @When("the user clicks the dropdown menu")
  public void theUserClicksTheDropdownMenu() {
    driver.findElement(By.cssSelector(".abicon.abicon-burger")).click();
  }

  @And("the user clicks deals option in the dropdown menu")
  public void theUserClicksDealsOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement deals = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC022")));
    deals.click();
    function.driverWaitSeconds(1);
  }

  @Then("the user is redirected to the deals page")
  public void theUserIsRedirectedToTheDealsPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"promociones\"]/div/div[2]/figure/div/div/h1/strong");
    Assert.assertEquals(text, "DESCOBREIX TOTES LES NOSTRES OFERTES I PROMOCIONS D'ABACUS");
  }

  //Scenario Cultural Bonus
  @And("the user clicks cultural bonus option in the dropdown menu")
  public void theUserClicksCulturalBonusOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement bonus = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC13")));
    bonus.click();
    function.driverWaitSeconds(1);
  }

  @Then("the user is redirected to the cultural bonus page")
  public void theUserIsRedirectedToTheCulturalBonusPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"wrapper-1f4de9e4bb41d53bba6dfd3f12\"]/div[1]/a/p");
    Assert.assertEquals(text, "Pàgines per construir el teu futur");
  }

  //Scenario Toys
  @And("the user clicks toys option in the dropdown menu")
  public void theUserClicksToysOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement joguines = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC04")));
    joguines.click();
  }

  @Then("the user is redirected to the toys page")
  public void theUserIsRedirectedToTheToysPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"wrapper-7f8e6b57831dc14eb7a6e5e084\"]/div[1]/a/p");
    Assert.assertEquals(text, "Compra Joguines per edats");
  }

  //Scenario Stationery
  @And("the user clicks stationery option in the dropdown menu")
  public void theUserClicksStationeryOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement papereria = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC02")));
    papereria.click();
  }

  @Then("the user is redirected to the stationery page")
  public void theUserIsRedirectedToTheStationeryPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"wrapper-849945e9a69d2145cf26d54b87\"]/div[1]/a/p");
    Assert.assertEquals(text, "Tot ben organitzat!");
  }

  //Scenario Books
  @And("the user clicks books option in the dropdown menu")
  public void theUserClicksBooksOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement llibres = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC05")));
    llibres.click();
  }

  @Then("the user is redirected to the books page")
  public void theUserIsRedirectedToTheBooksPage() {
    function.driverWaitSeconds(1);
    String url = driver.getCurrentUrl();
    Assert.assertEquals(url, "https://www.abacus.coop/ca/llibres/llibres.html");
  }

  //Scenario Youth Books
  @And("the user clicks youth books option in the dropdown menu")
  public void theUserClicksYouthBooksOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement juvenil = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FAKENW18580162\"]/span/span")));
    juvenil.click();
  }

  @Then("the user is redirected to the youth books page")
  public void theUserIsRedirectedToTheYouthBooksPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"search-page\"]/div[3]/div/div/h1");
    Assert.assertEquals(text, "Llibres juvenils");
  }

  //Scenario Child Books
  @And("the user clicks child books option in the dropdown menu")
  public void theUserClicksChildBooksOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement infantil = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC03")));
    infantil.click();
  }

  @Then("the user is redirected to the child books page")
  public void theUserIsRedirectedToTheChildBooksPage() {
    function.driverWaitSeconds(1);
    String url = driver.getCurrentUrl();
    Assert.assertEquals(url, "https://www.abacus.coop/ca/llibres-infantil/llibres-infantil.html");
  }

  //Scenario Comics
  @And("the user clicks comics option in the dropdown menu")
  public void theUserClicksComicsOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement comics = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FAKEPC08\"]/span/span")));
    comics.click();
  }

  @Then("the user is redirected to the comics page")
  public void theUserIsRedirectedToTheComicsPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"d398f79728d3d0bfcef7d310c6\"]/div/div/figure/div/div/h1/span[2]");
    Assert.assertEquals(text, "CÒMIC!");
  }

  //Scenario Journals
  @And("the user clicks journals option in the dropdown menu")
  public void theUserClicksJournalsOptionInTheDropdownMenu() {
    function.driverWaitSeconds(1);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement journals = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC07")));
    journals.click();
  }

  @Then("the user is redirected to the journals page")
  public void theUserIsRedirectedToTheJournalsPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"da7f2527d608d794d4909102e1\"]/p");
    Assert.assertEquals(text, "Revistes Abacus");
  }

  //Scenario School Uniforms
  @And("the user clicks school uniforms option in the dropdown menu")
  public void theUserClicksSchoolUniformsOptionInTheDropdownMenu() {
    function.driverWaitSeconds(1);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement uniformes = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC06")));
    uniformes.click();
  }

  @Then("the user is redirected to the school uniforms page")
  public void theUserIsRedirectedToTheSchoolUniformsPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"wrapper-6056fae11c9c185f77957c18c3\"]/div[1]/a/p");
    Assert.assertEquals(text, "Tèxtil Escolar");
  }

  //Scenario Costumes
  @And("the user clicks costumes option in the dropdown menu")
  public void theUserClicksCostumesOptionInTheDropdownMenu() {
    function.driverWaitSeconds(1);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement disfresses = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC020")));
    disfresses.click();
  }

  @Then("the user is redirected to the costumes page")
  public void theUserIsRedirectedToTheCostumesPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"7fad827d86b11666a09a5a768b\"]/p");
    Assert.assertEquals(text, "Tot el que necessites pel carnestoltes");
  }

  //Scenario Customer Support
  @And("the user clicks customer support option in the dropdown menu")
  public void theUserClicksCustomerSupportOptionInTheDropdownMenu() {
    function.driverWaitSeconds(1);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement suport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/nav/div[3]/ul/div/li[1]/a/span/span")));
    suport.click();
  }
  @Then("the user is redirected to the customer support page")
  public void theUserIsRedirectedToTheCustomerSupportPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"wrapper-1f4de9e4bb41d53bba6dfd3f12\"]/div[1]/a/p");
    Assert.assertEquals(text, "Pàgines per construir el teu futur");
  }

  //Scenario FAQ
  @And("the user clicks FAQ option in the dropdown menu")
  public void theUserClicksFrequentlyAskedQuestionsOptionInTheDropdownMenu() {
    function.driverWaitSeconds(1);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement faq = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/nav/div[3]/ul/div/li[2]/a/span/span")));
    faq.click();
  }

  @Then("the user is redirected to the FAQ page")
  public void theUserIsRedirectedToTheFrequentlyAskedQuestionsPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromNewPageGivenXpath("//*[@id=\"maincontent\"]/div[1]/h1");
    Assert.assertEquals(text, "Preguntes freqüents");
  }
  //Scenario Professional Abacus
  @And("the user clicks professional abacus option in the dropdown menu")
  public void theUserClicksProfessionalAbacusOptionInTheDropdownMenu() {
    function.driverWaitSeconds(1);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement abacus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/nav/div[3]/ul/div/li[3]/a/span")));
    abacus.click();
  }

  @Then("the user is redirected to the professional abacus page")
  public void theUserIsRedirectedToTheProfessionalAbacusPage() {
    function.driverWaitSeconds(1);
    String text = function.getUrlFromNewPage();
    Assert.assertEquals(text, "https://materialescolar.abacus.coop/es_CA/");
  }

  //Scenario Others
  @And("the user clicks others option in the dropdown menu")
  public void theUserClicksOthersOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement altres = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC90")));
    altres.click();
  }

  @Then("the user is redirected to the others page")
  public void theUserIsRedirectedToTheOthersPage() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"search-page\"]/div[3]/div/div/h1");
    Assert.assertEquals(text, "Propostes de Lleure");
  }

  //Scenario Filter Others By Size
  @And("the user clicks on the size filter")
  public void theUserClickOnTheSizeFilter() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"product-search-results\"]/div[1]/div[2]/div[4]/div[5]/div[2]/div[7]/div[1]/p");
    function.driverWaitSeconds(1);
  }

  @And("the user clicks on the size option")
  public void theUserClickOnTheSizeOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"refinement-mida\"]/ul/li[3]/a/span");
    function.driverWaitSeconds(1);
  }

  @Then("the products of the size selected are displayed")
  public void theProductsOfTheSizeSelectedAreDisplayed() {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/h3/a");
    Assert.assertEquals(text, "Cola termofusible Plico Purpurina, 22 barres");
  }



  //Scenario Search School Books
  @And("the user clicks school books option in the dropdown menu")
  public void theUserClicksSchoolBooksOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not intractable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement escolar = wait.until(ExpectedConditions.elementToBeClickable(By.id("schools")));
    escolar.click();
    function.driverWaitSeconds(2);
  }

  @And("the user introduces {string} on the search bar for school books")
  public void theUserIntroducesTheSchoolOnTheSearchBarForSchoolBooks(String schoolName) {
    function.driverWaitSeconds(1);
    function.writeTextOnElementGivenId("search-school-input", schoolName);
    function.driverWaitSeconds(1);
  }

  @And("the user clicks on the search button for school books")
  public void theUserClicksOnTheSearchButtonForSchoolBooks() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[3]/div[2]/form/div[5]/button");
    function.driverWaitSeconds(1);
  }

  @Then("the user is redirected to the {string} page")
  public void theUserIsRedirectedToTheSchoolBooksPage(String schoolName) {
    function.driverWaitSeconds(1);
    String text = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div/h1");
    Assert.assertEquals(text, schoolName);
  }
  //Scenario Filter Technology By Price
  @And("the user clicks technology option in the dropdown menu")
  public void theUserClicksTechnologyOptionInTheDropdownMenu() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenId("PC01");
    function.driverWaitSeconds(1);
  }
  @And("the user clicks on the price filter")
  public void theUserClicksOnThePriceFilter() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("//*[@id=\"product-search-results\"]/div[1]/div[2]/div[4]/div[5]/div[2]/div[6]/div[1]/p");
    function.driverWaitSeconds(1);
  }

  @And("the user scrolls the price filter bar to 986 euros")
  public void theUserScrollsThePriceFilterBarTo992Euros() {

    WebElement scroll = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
    System.out.println("Scroll seleccionado");

    //Scroll the bar
    Actions actions = new Actions(driver);
    actions.moveToElement(scroll).perform();
    actions.clickAndHold().moveByOffset(180, 0).release().perform();
    System.out.println("Scroll desplazado");
  }

  @Then("the products of the price selected are displayed")
  public void theProductsOfThePriceSelectedAreDisplayed() {
    function.driverWaitSeconds(1);
    String obj1 = function.getTextFromElementGivenXpath("//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/h3/a");
    String obj2 = function.getTextFromElementGivenXpath("//*[@id=\"product-search-results\"]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/h3/a");
    String obj3 = function.getTextFromElementGivenXpath("//*[@id=\"product-search-results\"]/div[2]/div[2]/div[3]/div/div/div[2]/div[1]/div[1]/h3/a");
    String obj4 = function.getTextFromElementGivenXpath("//*[@id=\"product-search-results\"]/div[2]/div[2]/div[4]/div/div/div[2]/div[1]/div[1]/h3/a");
    Assert.assertEquals(obj1, "Cartutx original HP GF 771C cian clar pack 3u - B6Y36A");
    Assert.assertEquals(obj2, "Cartutx original HP GF 771C negre foto pack 3u - B6Y37A");
    Assert.assertEquals(obj3, "Cartutx original HP GF 771C magenta clar pack 3u - B6Y35A");
    Assert.assertEquals(obj4, "Cartutx original HP 91 magenta 3u - C9484A");
  }
}
