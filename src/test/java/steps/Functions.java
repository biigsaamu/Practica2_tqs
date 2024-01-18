package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import run.DriverTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Functions {

  private static Functions uniqueFunctions = null;

  private static final WebDriver driver = DriverTest.getInstance();

  public static Functions getInstance() {
    if (uniqueFunctions == null) {
      uniqueFunctions = new Functions();
    }
    return uniqueFunctions;
  }

  public void clickOnElementGivenId(String id) {
    boolean found = false;
    while (!found) {
      try {
        driver.findElement(By.id(id)).click();
        found = true;
      } catch (NoSuchElementException e) {
        System.out.println("Element not found. Refreshing the page...");
        driver.navigate().refresh();
      }
    }
  }
  public void clickOnElementGivenClassName(String className) {
    boolean found = false;
    while (!found) {
      try {
        driver.findElement(By.className(className)).click();
        found = true;
      } catch (NoSuchElementException e) {
        System.out.println("Element not found. Refreshing the page...");
        driver.navigate().refresh();
      }
    }
  }
  public void clickOnElementGivenXpath(String xpath) {
    boolean found = false;
    while (!found) {
      try {
        driver.findElement(By.xpath(xpath)).click();
        found = true;
      } catch (NoSuchElementException e) {
        System.out.println("Element not found. Refreshing the page...");
        driver.navigate().refresh();
      }
    }
  }

  public String getTextFromElementGivenId(String id){
    String text = null;
    boolean found = false;
    while (!found) {
      try {
        text = driver.findElement(By.id(id)).getText();
        found = true;
      } catch (NoSuchElementException e) {
        System.out.println("Element not found. Refreshing the page...");
        driver.navigate().refresh();
      }
    }
    return text;
  }
  public String getTextFromElementGivenClassName(String className){
    String text = null;
    boolean found = false;
    while (!found) {
      try {
        text = driver.findElement(By.className(className)).getText();
        found = true;
      } catch (NoSuchElementException e) {
        System.out.println("Element not found. Refreshing the page...");
        driver.navigate().refresh();
      }
    }
    return text;
  }

  public String getTextFromElementGivenXpath(String xpath){
    String text = null;
    boolean found = false;
    while (!found) {
      try {
        text = driver.findElement(By.xpath(xpath)).getText();
        found = true;
      } catch (NoSuchElementException e) {
        System.out.println("Element not found. Refreshing the page...");
        driver.navigate().refresh();
      }
    }
    return text;
  }


  public void hoverElementGivenXpath(String xpath) {
    boolean found = false;
    while (!found) {
      try {
        WebElement elementToHover = driver.findElement(By.xpath(xpath));
        System.out.println("Hover element: " + elementToHover);
        //Actions instance
        Actions actions = new Actions(DriverTest.getInstance());
        //Hover action
        actions.moveToElement(elementToHover).perform();
        found = true;
      } catch (NoSuchElementException e) {
        System.out.println("Element not found. Refreshing the page...");
        driver.navigate().refresh();
      }
    }
  }

  public void writeTextOnElementGivenId(String id, String text) {
    driver.findElement(By.id(id)).sendKeys(text);
  }
  public void writeTextOnElementGivenClasName(String className, String text) {
    driver.findElement(By.className(className)).sendKeys(text);
  }
  public void writeTextOnElementGivenXpath(String xpath, String text) {
    driver.findElement(By.xpath(xpath)).sendKeys(text);
  }
  public void driverWaitSeconds(int sec) {
    try {
      Thread.sleep(sec * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void submitEnterToElementGivenId(String id) {
    WebElement registerKE = driver.findElement(By.id(id));
    Actions actions = new Actions(driver);
    actions.sendKeys(registerKE, Keys.ENTER).build().perform();
  }

  public void submitEnterToElementGivenClassName(String className) {
    WebElement registerKE = driver.findElement(By.className(className));
    Actions actions = new Actions(driver);
    actions.sendKeys(registerKE, Keys.ENTER).build().perform();
  }

  public void submitEnterToElementGivenXpath(String xpath) {
    WebElement registerKE = driver.findElement(By.xpath(xpath));
    Actions actions = new Actions(driver);
    actions.sendKeys(registerKE, Keys.ENTER).build().perform();
  }


}
