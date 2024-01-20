package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import run.DriverTest;

import java.time.Duration;

public class SideBarSteps {

  private static final WebDriver driver = DriverTest.getInstance();

  //Scenario Toys
  @When("the user clicks the dropdown menu")
  public void theUserClicksTheDropdownMenu() {
    driver.findElement(By.cssSelector(".abicon.abicon-burger")).click();
  }

  @And("the user clicks toys option in the dropdown menu")
  public void theUserClicksToysOptionInTheDropdownMenu() {
    //Wait a minimum period of time to because if not throw error of element not interactable
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement joguines = wait.until(ExpectedConditions.elementToBeClickable(By.id("PC04")));
    joguines.click();
  }
}
