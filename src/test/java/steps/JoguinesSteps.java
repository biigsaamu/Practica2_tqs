package steps;

import io.cucumber.java.bs.A;
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

public class JoguinesSteps {

  private static final WebDriver driver = DriverTest.getInstance();

  private static final Functions function = Functions.getInstance();

  //Scenario Table games
  @And("the user clicks toys option")
  public void theUserClicksToysOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/a");
    System.out.println("Joguines selected");
  }

  @And("the user selects table games option")
  public void theUserSelectsTableGamesOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[2]/a");
    System.out.println("Table games selected");

  }

  @Then("the table games page is displayed")
  public void theTableGamesPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Jocs de taula");
    function.driverWaitSeconds(1);
  }

  //Scenario Symbolic games
  @And("the user selects symbolic games option")
  public void theUserSelectsSymbolicGamesOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[3]/a");
    System.out.println("Symbolic games selected");
  }

  @Then("the symbolic games page is displayed")
  public void theSymbolicGamesPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Jocs Simbòlics");
    function.driverWaitSeconds(1);
  }

  //Scenario Video games
  @And("the user selects video games option")
  public void theUserSelectsVideoGamesOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[6]/a");
    System.out.println("Video games selected");
  }

  @Then("the video games page is displayed")
  public void theVideoGamesPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Videojocs i consoles");
    function.driverWaitSeconds(1);
  }

  //Scenario Ages
  @And("the user selects ages option")
  public void theUserSelectsAgesOption() {
     function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[7]/a");
    System.out.println("Ages selected");
  }

  @Then("the toys by ages page is displayed")
  public void theToysByAgesPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Joguines per edats");
    function.driverWaitSeconds(1);
  }

  //Scenario brands
  @And("the user selects brands option")
  public void theUserSelectsBrandsOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[8]/a");
    System.out.println("Brands selected");
  }

  @Then("the most searched brands page is displayed")
  public void theMostSearchedBrandsPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Marques més buscades");
    function.driverWaitSeconds(1);
  }

  //Scenario Classic games
  @And("the user hovers the mouse over table games category")
  public void theUserHoversTheMouseOverTableGamesCategory() {
    function.hoverElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[2]/a");
    System.out.println("Table games hovered");
    function.driverWaitSeconds(1);
  }

  @And("the user clicks the classic games option")
  public void theUserClicksTheClassicGamesOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[2]/div/div/div/div/div[1]/ul/li[1]/a");
    System.out.println("Classic games clicked");
  }

  @Then("the classic games page is displayed")
  public void theClassicGamesPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Jocs de taula clàssics");
    function.driverWaitSeconds(1);
  }

  //Scenario pair games
  @And("the user clicks the pair games option")
  public void theUserClicksThePairGamesOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[3]/div/ul/li[2]/div/div/div/div/div[4]/ul/li[1]/a");
    System.out.println("Pair games clicked");
  }

  @Then("the pair games page is displayed")
  public void thePairGamesPageIsDisplayed() {
    String pageTitle = function.getTextFromElementGivenClassName("title-container");
    Assert.assertEquals(pageTitle, "Jocs de taula en parella");
    function.driverWaitSeconds(1);
  }


  //Scenario Filter 9-10€
  @And("the user selects the age range")
  public void theUserSelectsTheAgeRange() {
    function.clickOnElementGivenXpath("//*[@id=\"7f8e6b57831dc14eb7a6e5e084\"]/div[3]/div/figure/a");
  }

  @And("the user clicks the price dropdown menu")
  public void theUserClicksThePriceDropdownMenu() {

    //Click on price
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement preu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
        "//*[@id=\"product-search-results\"]/div[1]/div[2]/div[4]/div[5]/div[2]/div[3]/div[1]/p")));
    preu.click();

    //Assert
    String price = function.getTextFromElementGivenXpath("//*[@id=\"refinement-preu\"]/div/div/div[3]");
    System.out.println("Price text: " + price);
    Assert.assertTrue(price.equals("50€"));
    System.out.println("Barra desplegada");

  }

  @And("the user scrolls the price filter bar to ten euros")
  public void theUserScrollsThePriceFilterBarToTenEuros() {

    WebElement scroll = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
    System.out.println("Scroll seleccionado");

    //Scroll the bar
    Actions actions = new Actions(driver);
    actions.moveToElement(scroll).perform();
    actions.clickAndHold().moveByOffset(-200, 0).release().perform();
    System.out.println("Scroll desplazado");
  }

  @Then("the web loads toys between nine and ten euros")
  public void theWebLoadsToysBetweenNineAndTenEuros() {

    //Fiquem una espera d'un segon perquè carregui els elements html de la pàgina
     function.driverWaitSeconds(1);

    String product_name = function.getTextFromElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/h3");
    System.out.println("Name: " + product_name);
    Assert.assertEquals(product_name, "Bloopies Floaties Dinos");

    String product_price = function.getTextFromElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/span/span/span");
    System.out.println("Price: " + product_price);
    Assert.assertEquals(product_price, "9,99€");

  }

  //Scenario Filter 10-15€
  @And("the user scrolls the price filter bar to fifteen euros")
  public void theUserScrollsThePriceFilterBarToFifteenEuros() {
    WebElement scroll = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
    System.out.println("Scroll seleccionado");

    //Scroll the bar to the right because in last scenario the scroll bar maximum price was ten
    Actions actions = new Actions(driver);
    actions.moveToElement(scroll).perform();
    actions.clickAndHold().moveByOffset(15, 0).release().perform();
    System.out.println("Scroll desplazado");
  }

  @Then("the web loads toys between nine and fifteen euros")
  public void theWebLoadsToysBetweenNineAndFifteenEuros() {
    //Fiquem una espera d'un segon perquè carregui els elements html de la pàgina
     function.driverWaitSeconds(1);

    String product_name = function.getTextFromElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/h3");
    System.out.println("Name: " + product_name);
    Assert.assertEquals(product_name, "LEGO® Duplo base construcció verda 10980");

    String product_price = function.getTextFromElementGivenXpath(
        "//*[@id=\"product-search-results\"]/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/div/span/span/span");
    System.out.println("Price: " + product_price);
    Assert.assertEquals(product_price, "14,99€");
  }

  //Scenario 3
  @And("the user selects classic games option")
  public void theUserSelectsClassicGamesOption() {
    function.clickOnElementGivenXpath("//*[@id=\"NW18020135\"]");
    System.out.println("Classic games selected");
  }

}
