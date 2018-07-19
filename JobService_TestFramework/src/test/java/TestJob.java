import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestJob {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }

    @Test
    public void checkTheFirstPortalInputVersionOne() {
        LoginPage loginPage = new LoginPage(driver);
        User user = new User();
        loginPage.openFirstPortal();
        loginPage.firstPortalInputJobTitleOne(user);

        Assert.assertEquals("Praca Tester Oprogramowania, Wrocław - Pracuj.pl", driver.getTitle());
        System.out.println("There is a job with job title: Tester Oprogramowania in Wrocław! So you can apply :)");
    }

    @Test
    public void checkTheFirstPortalInputVersionTwo() {
        LoginPage loginPage = new LoginPage(driver);
        User user = new User();
        loginPage.openFirstPortal();
        loginPage.firstPortalInputJobTitleTwo(user);

        Assert.assertEquals("Praca Test Automation, Wrocław - Pracuj.pl",driver.getTitle());
        System.out.println("There is a job with job title: Test Automation in Wrocław! Lucky You");
    }

    @Test
    public void checkTheFirstPortalInputVersionThree() {
        LoginPage loginPage = new LoginPage(driver);
        User user = new User();
        loginPage.openFirstPortal();
        loginPage.firstPortalInputJobTitleOneLocationTwo(user);

        Assert.assertEquals("Praca Tester Oprogramowania, Opole - Pracuj.pl",driver.getTitle());
        System.out.println("There is a job with job title: Tester Oprogramowania in Opole! don't wait too long, aplly!");
    }

    @Test
    public void checkTheFirstPortalInputVersionFour() {
        LoginPage loginPage = new LoginPage(driver);
        User user = new User();
        loginPage.openFirstPortal();
        loginPage.firstPortalInputJobTitleTwoLocationTwo(user);

        Assert.assertEquals("Praca Test Automation, Opole - Pracuj.pl",driver.getTitle());
        System.out.println("There is a job with job title: Test Automation in Opole! Go for it!");
    }
}
