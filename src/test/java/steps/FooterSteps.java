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

  @When("the user clicks frequent questions option")
  public void theUserClicksFrequentQuestionsOption() {
    function.driverWaitSeconds(1);
    driver.findElement(By.xpath(
        "//*[@id=\"footercontent\"]/div[1]/div[2]/div[3]/div/div/ul/li[1]/a")).click();
    System.out.println("Clicked in frequent questions");
  }

  @And("the user selects a question")
  public void theUserSelectsAQuestion() {
    driver.findElement(By.xpath(
        "//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/ul/li[3]")).click();
    System.out.println("Question selected");
  }

  @Then("the question information appears")
  public void theQuestionInformationAppears() {
    String answer = driver.findElement(By.xpath("//*[@id=\"03\"]/div/p")).getText();
    Assert.assertTrue(answer.equals(
        "Es poden efectuar compres en tot el territori espanyol peninsular i a les Illes Balears."));
  }
}
