import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

/**
 * Klasa testowa RegisterPageTest.
 * Z nazwy klasy możemy wyczytać dwie rzeczy:
 *  1. RegisterPage - to klasa związana z klasą RegisterPage
 *  2. Test - będzie to test.
 */
public class RegisterPageTest {

    /**
     * Tworzymy miejsce (zmienną), w którym przetrzymamy wskaźnik do obiektu typu WebDriver.
     */
    private WebDriver driver;
    private Screenshot screenshot = new Screenshot();
    /**
     * Before - instrukcje, które wykonają się przed (before) każdym testem (@Test) w obecnej klasie.
     */
    @Before
    public void setUp() {
        /**
         * Tworzymy nowy obiekt ChromeDriver i przypisujemy go do zmiennej driver.
         * Klasa ChromeDriver DZIEDZICZY z klasy WebDriver (FirefoxDriver i WebDriver to WebDrivery),
         * dlatego może być przypisana do zmiennej typu WebDriver.
         */
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    /**
     * After - instrukcje, które wykonają się po (after) każdym teście (@Test) w obecnej klasie.
     */
    @After
    public void tearDown() {
        /**
         * Zamykamy okno przeglądarki i `czyścimy` zmienną driver.
         */
        driver.quit();
        driver = null;
    }

    /**
     * Test.
     */
    @Test
    public void canOpenRegisterPage() throws IOException {
        /**
         * 1. Tworzymy nowy obiekt RegisterPage i podajemy mu okno przeglądarki (driver) na którym powinien operować.
         * 2. Wywołujemy metode `open()`  obiektu RegisterPage, które po prostu ładuje jej URL w przeglądarce.
         * 3. Upewniamy się, że jesteśmy na stronie RegisterPage. `isAt()` zwraca prawdę, jeśli obecny URL przeglądarki
         *    się zgadza.
         */
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.open();
        screenshot.take(driver, "canOpenRegisterPage.png");
        Assert.assertTrue( registerPage.isAt() );
    }

    /**
     * Test.
     */
    @Test
    public void canRegisterNewIndividualUser() throws IOException {
        /**
         * 1. Tworzymy nowy obiekt RegisterPage i podajemy mu przeglądarkę.
         * 2. Tworzymy nowy obiekt ConfirmedPage (użyjemy go później, ale możemy już go mieć pod ręką)
         * 3. Tworzymy nowego Usera. Pamiętaj: konstryuktor klasy User automatycznie wypełnia jego dane.
         * 4. Otwieramy RegisterPage
         * 5. Upewniamy się, że RegisterPage jest otwarte (strona jest załadowana - URL się zgadza).
         * 6. Upewniamy się że:
         *      - Pierwsze imię utworzonego w tej metodzie użytkownika.
         *      - Imię zalogowanego użytkownika, która zwraca metoda `getFirstName()` klasy ConfirmPage.
         */
        RegisterPage registerPage = new RegisterPage(driver);
        ConfirmedPage confirmedPage = new ConfirmedPage(driver);
        User user = new User();
        registerPage.open();
        registerPage.registerNewIndividualUser(user);

        screenshot.take(driver,"canRegisterNewIndividualUser.png");
        Assert.assertTrue( confirmedPage.isAt() );
        Assert.assertEquals(
                user.getFirstName(),
                confirmedPage.getLoggedUserName()
        );

    }
}
