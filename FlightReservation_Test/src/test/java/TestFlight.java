import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFlight {
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
    public void canBookFlightGivenValidData() {
        LoadedPage loadedPage = new LoadedPage(driver);
        Flight flight = new Flight();
        loadedPage.open();
        loadedPage.flightInputData(flight);
    }
}
