package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import run.DriverTest;

import java.util.List;

public class ProfessionalAbacusSteps {
    private static final WebDriver driver = DriverTest.getInstance();
    private static final Functions function = Functions.getInstance();

    //Scenario: Professional link
    @When("the user clicks professional abacus link")
    public void theUserClicksProfessionalAbacusLink() {
        function.driverWaitSeconds(1);
        function.clickOnElementGivenXpath("//*[@id=\"footercontent\"]/div[1]/div[2]/div[1]/div/div/ul/li[5]/a");
        System.out.println("Professional abacus selected");
    }

    @Then("the professional abacus page is displayed")
    public void theProfessionalAbacusPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String url = function.getUrlFromNewPage();
        String [] urlSplit = url.split("/");
        String urlBase = urlSplit[0] + "//" + urlSplit[2];
        Assert.assertEquals(urlBase, "https://professional.abacus.coop");
    }

    //Scenario: Professional Stationery
    @Given("the user is on the professional home page and accepts or not the cookies")
    public void theUserIsOnTheProfessionalHomePageAndAcceptsOrNotTheCookies() {
        function.driverWaitSeconds(1);
        driver.navigate().to("https://professional.abacus.coop/");

        function.driverWaitSeconds(2);

        //Comprovem si apareix el botó d'acceptar cookies
        String elementID = "/html/body/app-root/cx-storefront/footer/cx-page-layout/cx-page-slot/cx-anonymous-consent-management-banner/div/div/div/div[2]/button[2]";
        List<WebElement> elements = driver.findElements(By.xpath(elementID));
        if (!elements.isEmpty()) {
            function.clickOnElementGivenXpath(elementID);
        } else {
            System.out.println("No s'ha requerit acceptar cookies");
        }
    }

    @When("the user clicks professional stationery link")
    public void theUserClicksProfessionalStationeryLink() {
        function.driverWaitSeconds(2);
        driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[8]/cx-category-navigation/app-abacus-navigation-ui/nav/ul/li[2]/cx-generic-link/a")).click();
        function.driverWaitSeconds(1);
        //function.hoverElementGivenXpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[5]/cx-searchbox/div[1]/label/input");
        System.out.println("Professional stationery selected");
    }

    @Then("the professional stationery page is displayed")
    public void theProfessionalStationeryPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/h1")).getText();
        Assert.assertEquals(text.split(" ")[3], "papereria");
    }

    //Scenario: Professional Material
    @When("the user clicks professional material link")
    public void theUserClicksProfessionalMaterialLink() {
        function.driverWaitSeconds(2);
        driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[8]/cx-category-navigation/app-abacus-navigation-ui/nav/ul/li[3]/cx-generic-link/a/div")).click();
        System.out.println("Professional material selected");
    }

    @Then("the professional material page is displayed")
    public void theProfessionalMaterialPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/nav/ol/li[2]/a")).getText();
        Assert.assertEquals(text, "Material Didàctic");
    }

    //Scenario: Professional Technology
    @When("the user clicks professional technology link")
    public void theUserClicksProfessionalTechnologyLink() {
        function.driverWaitSeconds(1);
        driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[8]/cx-category-navigation/app-abacus-navigation-ui/nav/ul/li[4]/cx-generic-link/a/div")).click();
        System.out.println("Professional technology selected");
    }

    @Then("the professional technology page is displayed")
    public void theProfessionalTechnologyPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/nav/ol/li[2]/a")).getText();
        Assert.assertEquals(text, "Tecnologia");
    }

    //Scenario: Furniture
    @When("the user clicks professional furniture link")
    public void theUserClicksBookshopLink() {
        function.driverWaitSeconds(1);
        driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[8]/cx-category-navigation/app-abacus-navigation-ui/nav/ul/li[6]/cx-generic-link/a/div")).click();
        System.out.println("Bookshop selected");
    }

    @Then("the professional furniture page is displayed")
    public void theBookshopPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/nav/ol/li[2]/a")).getText();
        Assert.assertEquals(text, "Mobiliari");
    }

    //Scenario: Professional Catalogs
    @When("the user clicks professional catalogs link")
    public void theUserClicksProfessionalCatalogsLink() {
        function.driverWaitSeconds(1);
        driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[8]/cx-category-navigation/app-abacus-navigation-ui/nav/ul/li[7]/cx-generic-link/a/div")).click();
        System.out.println("Professional catalogs selected");
        function.driverWaitSeconds(1);
    }

    @Then("the professional catalogs page is displayed")
    public void theProfessionalCatalogsPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/h1")).getText();
        Assert.assertEquals(text, "catàlegs 2023");
    }

    //Scenario: Professional Paper
    @When("the user hovers the mouse of stationery link")
    public void theUserHoversTheMouseOfStationeryLink() {
        function.driverWaitSeconds(1);
        WebElement elementToHover = driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[8]/cx-category-navigation/app-abacus-navigation-ui/nav/ul/li[2]/cx-generic-link/a/div"));
        System.out.println("Hover element: " + elementToHover);
        //Actions instance
        Actions actions = new Actions(DriverTest.getInstance());
        //Hover action
        actions.moveToElement(elementToHover).perform();
        function.driverWaitSeconds(1);
    }

    @And("the user clicks professional paper link")
    public void theUserClicksProfessionalPaperLink() {
        function.driverWaitSeconds(1);
        driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[8]/cx-category-navigation/app-abacus-navigation-ui/nav/ul/li[2]/div/ul/div[1]/li/cx-generic-link/a/div")).click();
        System.out.println("Professional paper selected");
        function.driverWaitSeconds(1);
    }

    @Then("the professional paper page is displayed")
    public void theProfessionalPaperPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/nav/ol/li[2]/a")).getText();
        Assert.assertEquals(text, "Paper");
    }


    //Scenario: Professional Footer Quality
    @When("the user clicks professional quality link")
    public void theUserClicksProfessionalQualityLink() {
        function.driverWaitSeconds(1);
        driver.findElement(By.xpath("//html/body/app-root/cx-storefront/footer/cx-page-layout/cx-page-slot/cx-footer-navigation/cx-navigation-ui/nav/ul/li[1]/div/ul/li[2]/cx-generic-link/a")).click();
        System.out.println("Professional quality selected");
        function.driverWaitSeconds(1);
    }

    @Then("the professional quality page is displayed")
    public void theProfessionalQualityPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/h1")).getText();
        Assert.assertEquals(text, "qualitat i mediambient");
    }

    //Scenario: Professional Footer Contact
    @When("the user clicks professional contact link")
    public void theUserClicksProfessionalContactLink() {
        function.driverWaitSeconds(1);
        driver.findElement(By.xpath("/html/body/app-root/cx-storefront/footer/cx-page-layout/cx-page-slot/cx-footer-navigation/cx-navigation-ui/nav/ul/li[2]/div/ul/li[1]/cx-generic-link/a")).click();
        System.out.println("Professional contact selected");
        function.driverWaitSeconds(1);
    }

    @Then("the professional contact page is displayed")
    public void theProfessionalContactPageIsDisplayed() {
        function.driverWaitSeconds(1);
        String text = driver.findElement(By.xpath
                ("/html/body/app-root/cx-storefront/cx-page-slot/cx-breadcrumb/h1")).getText();
        Assert.assertEquals(text, "contacta'ns");
    }

    //Scenario: Professional SearchBar
    @When("the user enters {string} in the professional search bar")
    public void theUserEntersInTheProfessionalSearchBar(String bookName) {
        function.driverWaitSeconds(1);
        driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[5]/cx-searchbox/div[1]/label/input")).sendKeys(bookName);
        System.out.println("Keys sent");
    }

    @And("the user clicks enter in professional search bar")
    public void theUserClicksEnterInProfessionalSearchBar() {
        function.driverWaitSeconds(1);
        WebElement KE = driver.findElement(By.xpath("//*[@id=\"cx-header\"]/cx-page-layout[1]/cx-page-slot[5]/cx-searchbox/div[1]/label/input"));
        Actions actions = new Actions(driver);
        actions.sendKeys(KE, Keys.ENTER).build().perform();
        function.driverWaitSeconds(1);
    }

    @Then("the page with the results of {string} professional search is displayed")
    public void thePageWithTheResultsOfProfessionalSearchIsDisplayed(String keysSent) {
        function.driverWaitSeconds(1);
        String searchResultsText = driver.findElement(By.xpath("//*[@id=\"product-results-list\"]/cx-product-list-item[1]/div/div[2]/a/h2")).getText();
        Assert.assertTrue(searchResultsText.contains(keysSent));
        function.driverWaitSeconds(1);
    }
}
