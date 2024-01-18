package steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import run.DriverTest;

public class PapereriaSteps {

  private static final WebDriver driver = DriverTest.getInstance();
  private static final Functions function = Functions.getInstance();

  @And("the user clicks stationery option")
  public void theUserClicksStationeryOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/a");
    System.out.println("Papereria selected");
  }

  @And("the user hovers the mouse over crafts category")
  public void theUserHoversTheMouseOverCraftsCategory() {
    function.hoverElementGivenXpath("/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[2]/a");
    System.out.println("Manualitats hovered");
    function.driverWaitSeconds(1);
  }

  @And("the user clicks white glue option")
  public void theUserClicksWhiteGlueOption() {
    function.driverWaitSeconds(1);
    function.clickOnElementGivenXpath(
        "/html/body/div[4]/header/div[4]/div[1]/div[2]/div[1]/ul/li[2]/div/ul/li[2]/div/div/div/div/div[2]/ul/li[2]/a");
    System.out.println("Cola blanca option selected");
  }

}
