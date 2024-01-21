package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import run.DriverTest;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartSteps {

    private static final WebDriver driver = DriverTest.getInstance();
    private static final Functions function = Functions.getInstance();

    // Scenario: Add product to shopping cart
    @And("the product is added to the shopping cart")
    public void theProductIsAddedToTheShoppingCart() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenXpath("//*[@id=\"llibres\"]/div/div[4]/div/div/div[2]/div[3]/div/div/div[2]/button");
        function.driverWaitSeconds(4);
    }

    @Then("the shopping cart displays the product added")
    public void theShoppingCartDisplaysTheProductAdded() {
        function.driverWaitSeconds(1);
        String productTitle = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/a");
        Assert.assertEquals(productTitle, "Jo mai mai: el llibre");
        function.driverWaitSeconds(1);
    }

    // Scenario: Modify quantity of product
    @And("the user clicks on the shopping cart visualizer")
    public void theUserClicksOnTheShoppingCart() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenXpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[2]/div[1]/span/a");
        function.driverWaitSeconds(1);
    }

    @And("the user changes the quantity of the product")
    public void theUserAddTheQuantityField() {
        function.driverWaitSeconds(2);
        function.writeTextOnElementGivenClasName("quantity-input", "2");
        function.driverWaitSeconds(1);
    }

    @And("the user enters the changes")
    public void theUserEntersTheChanges() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2");
        function.driverWaitSeconds(1);
    }

    @Then("the shopping cart displays the correct information")
    public void theShoppingCartDisplaysTheCorrectInformation() {
        function.driverWaitSeconds(1);
        //Check the name product
        String productTitle = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/a");
        Assert.assertEquals(productTitle, "Jo mai mai: el llibre");

        //Check the price
        String totalPrice = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[5]/div[2]/span");

        //Si s'executen tots els tests el preu sera de 396,00 €, si no, de 378,00 €
        List<String> acceptablePrices = Arrays.asList("378,00€", "396,00€");
        if (!acceptablePrices.contains(totalPrice)) {
            Assert.fail("The price is not correct");
        }
    }

    // Scenario: Remove product
    @And("the user removes the product from the shopping cart")
    public void theUserRemovesTheProductFromTheShoppingCart() {
        function.driverWaitSeconds(2);
        function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/button");
        function.driverWaitSeconds(1);
    }

    @Then("the shopping cart is empty")
    public void theShoppingCartIsEmpty() {
        function.driverWaitSeconds(1);
        String emptyCart = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div/div/h1");
        Assert.assertEquals(emptyCart, "La meva cistella està buida");
    }
    //Scenario Multiple products
    @And("the user adds multiple products to the shopping cart")
    public void theUserAddsMultipleProductsToTheShoppingCart() {
        function.driverWaitSeconds(5);
        function.clickOnElementGivenXpath("//*[@id=\"wrapper-39d7aae8f08f64b7be6371c9c1\"]/div[1]/div[2]/div/div/div/div[2]/div[3]/div/div/div[3]/button/span");
        /*function.driverWaitSeconds(6);
        function.clickOnElementGivenXpath("//*[@id=\"wrapper-39d7aae8f08f64b7be6371c9c1\"]/div[1]/div[3]/div/div/div/div[2]/div[3]/div/div/div[3]/button/span");
        function.driverWaitSeconds(1);*/
    }

    @Then("the shopping cart displays the products added")
    public void theShoppingCartDisplaysTheProductsAdded() {
        function.driverWaitSeconds(1);
        String productTitle1 = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/a");
        Assert.assertEquals(productTitle1, "Jo mai mai: el llibre");
        String productTitle2 = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[1]/a");
        Assert.assertEquals(productTitle2, "Soy joven, no gilipollas");
        /*String productTitle3 = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div/div[1]/a");
        Assert.assertEquals(productTitle3, "Los secretos de Hyrule");*/
    }

    //Scenario: Drop down shopping cart
    @Then("the shopping cart drop down displays the product added")
    public void theShoppingCartDropDownDisplaysTheProductAdded() {
        function.driverWaitSeconds(1);
        String productTitle = function.getTextFromElementGivenXpath("//*[@id=\"minicart-content-wrapper\"]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[1]/div/div[1]/a");
        Assert.assertEquals(productTitle, "Jo mai mai: el llibre");
        function.driverWaitSeconds(1);
    }
}
