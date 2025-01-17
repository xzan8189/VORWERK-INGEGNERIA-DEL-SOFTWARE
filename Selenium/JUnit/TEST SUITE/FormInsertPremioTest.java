// Generated by Selenium IDE
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
public class FormInsertPremioTest {
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
  public void tC30NoFieldsFormInsertPremio() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC31OnlyNamePremio() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewe");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC32OnlyNameandPointsPremio() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC33OnlyNamePointsandDescriptionPremio() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("ewewewewe");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC34Allfields() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewew");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("ewewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-success"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC35NameExistsPremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewew");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("2");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC360NameFormatPremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("ewewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC361NameFormatPremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewewewewewewewewewewewewewew");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("ewewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC370PointsValuePremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("0");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC371PointsValuePremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("weweweeee");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1000");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC372PointsValuePremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("weweweeee");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("eeee");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC380DescriptionFormatPremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC381DescriptionFormatPremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC390QuantityAvailableValuePremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("0");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC391QuantityAvailableValuePremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("1000");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
  @Test
  public void tC392QuantityAvailableValuePremioException() {
    driver.get("http://localhost:8080/VORWERK/login.jsp");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("demo@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Prova123");
    driver.findElement(By.cssSelector("input:nth-child(9)")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("tab-premi")).click();
    driver.findElement(By.id("nameAward")).click();
    driver.findElement(By.id("nameAward")).sendKeys("wewewe");
    driver.findElement(By.id("pointsAward")).click();
    driver.findElement(By.id("pointsAward")).sendKeys("1");
    driver.findElement(By.id("descriptionAward")).click();
    driver.findElement(By.id("descriptionAward")).sendKeys("wewewewewe");
    driver.findElement(By.id("quantityAward")).click();
    driver.findElement(By.id("quantityAward")).sendKeys("eee");
    driver.findElement(By.cssSelector("#insertFormAward #inserisci")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".alert-danger"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.cssSelector(".align-self-start")).click();
  }
}
