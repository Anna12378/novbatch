package junitpkg;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test2() {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(570, 816));
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
    driver.findElement(By.linkText("6")).click();
    driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-backpack\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-bike-light\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-fleece-jacket\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-onesie\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"remove-test.allthethings()-t-shirt-(red)\"]")).click();
    driver.findElement(By.id("page_wrapper")).click();
    driver.findElement(By.id("page_wrapper")).click();
    driver.findElement(By.id("page_wrapper")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-backpack\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-sauce-labs-onesie\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
    driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
    driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"firstName\"]")).sendKeys("anu");
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"lastName\"]")).sendKeys("anna");
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"postalCode\"]")).sendKeys("560043");
    driver.findElement(By.cssSelector("*[data-test=\"continue\"]")).click();
    driver.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("inventory_sidebar_link")).click();
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.cssSelector(".header_secondary_container")).click();
    driver.findElement(By.id("react-burger-cross-btn")).click();
    driver.findElement(By.cssSelector(".shopping_cart_link")).click();
    driver.findElement(By.cssSelector("*[data-test=\"checkout\"]")).click();
    driver.findElement(By.id("react-burger-menu-btn")).click();
    driver.findElement(By.id("logout_sidebar_link")).click();
  }
}
