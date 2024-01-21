package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@CucumberOptions(features = "src/test/java/features/register.feature", glue = "steps")
public class DriverTest extends AbstractTestNGCucumberTests {
  private static WebDriver uniqueDriver = null;

  public static WebDriver getInstance() {
    if (uniqueDriver == null) {
      System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
      uniqueDriver = new ChromeDriver();
      uniqueDriver.manage().window().maximize();
    }

    return uniqueDriver;
  }


}
