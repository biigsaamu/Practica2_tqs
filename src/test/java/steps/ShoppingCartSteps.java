package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import run.DriverTest;
import org.openqa.selenium.WebElement;

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
        String productTitle = function.getTextFromElementGivenXpath("//*[@id=\"minicart-content-wrapper\"]/div[1]/div[4]/div/div/div/div[1]/div/div[2]/div[1]/div/div[1]/a");
        Assert.assertEquals(productTitle, "Jo mai mai: el llibre");
        function.driverWaitSeconds(1);
    }

    // Scenario: Modify quantity of product
    /*TODO: Check errors*/
    @And("the user clicks on the shopping cart")
    public void theUserClicksOnTheShoppingCart() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenClassName("button-link-wrapper aba-btn-primary go-to-cart");
    }

    @And("the user changes the quantity of the product")
    public void theUserAddTheQuantityField() {
        function.driverWaitSeconds(2);
        function.writeTextOnElementGivenClasName("quantity-input", "2");
    }

    @Then("the shopping cart displays the correct information")
    public void theShoppingCartDisplaysTheCorrectInformation() {
        function.driverWaitSeconds(1);
        String productQuantity = function.getTextFromElementGivenXpath("//*[@id=\"minicart-content-wrapper\"]/div[1]/div[4]/div/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/span");
        Assert.assertEquals(productQuantity, "2");
    }

    // Scenario: Remove product
    @And("the user removes the product from the shopping cart")
    public void theUserRemovesTheProductFromTheShoppingCart() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/button/span/svg");
        function.driverWaitSeconds(1);
    }

    @Then("the shopping cart is empty")
    public void theShoppingCartIsEmpty() {
        function.driverWaitSeconds(1);
        String emptyCart = function.getTextFromElementGivenXpath("//*[@id=\"maincontent\"]/div[1]/div/div[1]/div/div/h1");
        Assert.assertEquals(emptyCart, "La meva cistella està buida");
    }

}
