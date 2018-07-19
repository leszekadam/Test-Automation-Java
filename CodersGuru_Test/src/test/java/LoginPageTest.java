import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginPageTest {

    private WebDriver driver;
    private LoginPage loginPage;
    // region Setup
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        loginPage.open();
    }
    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }
    // endregion

    @Test
    public void canNotLoginGivenNoData() {

        loginPage.doubleClickLoginButton();
        Assert.assertTrue(
                "Warning is not displayed!",
                driver.findElement(By.cssSelector("form > span")).isDisplayed()
        );
        Assert.assertEquals(
                "Warning message did not match!",
                "To pole jest wymagane",
                driver.findElement(By.cssSelector("form > span")).getText()
        );
    }

    @Test
    public void canNotLoginGivenInvalidData() {

        loginPage.loginAs("dfdfdgdg","dgsgsdg");
        Assert.assertTrue(
                "Warning is not displayed!",
                driver.findElement(By.className("db-info")).isDisplayed()
        );
        Assert.assertEquals(
                "Warning messafe did not match!",
                "Nieprawidłowe dane.",
                driver.findElement(By.className("db-info")).getText()
        );
    }

    @Test
    public void canLoginGivenValidData() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("coders.guru@example.com", "password");
        Assert.assertEquals(
                "URL didn't match",
                "https://wro-tem-s-01.codersguru.pl/",
                driver.getCurrentUrl()
        );
        Assert.assertEquals(
                "You are not logged in!",
                "Adam", driver.findElement(By.id("user-name")).getText()
        );
    }

}

