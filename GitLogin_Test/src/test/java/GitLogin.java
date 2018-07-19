import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GitLogin {
    WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://github.com/login");
    }

    @Test
    public void canLoginUsingValidData() {
        driver.findElement(By.id("login_field")).sendKeys("kowalski@gmail.com");
        driver.findElement(By.id("password")).sendKeys("password123");
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[3]")).click();

        Assert.assertTrue(
                "Something went wrong!",
                driver.findElement(By.className("UnderlineNav-item")).isDisplayed());
    }


    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}

