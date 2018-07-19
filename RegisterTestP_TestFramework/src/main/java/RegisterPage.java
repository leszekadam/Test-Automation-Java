import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Klasa (Model) według której będą tworzone nowe obiekty tej klasy (new RegisterPage - to ten moment).
 */
public class RegisterPage {

    /**
     * 1. Pole typu String (tekst) przetrzymujący adres URL strony Confirem Page.
     * 2. Pole typu WebDriver do którego później przypiszemy nowe okno przeglądarki.
     */
    private String url = "https://wro-tem-s-01.codersguru.pl/register/";
    private WebDriver driver;

    /**
     *    == KONSTRUKTOR ==
     *
     *  1. Konstruktor ma nazwę identyczną jak klasa:
     *      - Klasa:        public class RegisterPage
     *      - Konstruktor:        public RegisterPage()
     *
     *  2. Konstruktor wykona swoje instrukcje za każdym razem, kiedy tworzony jest nowy obiekt RegisterPage,
     *     na przykład:
     *                  RegisterPage registerPage = new RegisterPage(); <--- Kod w innej klasie.
     *
     *  W tym przypadku, kiedy nowy obiekt strony jest tworzony MUSIMY podać mu obiek klasy WebDriver:
     *      - RegisterPage(WebDriver driver).
     *  Ten WebDriver jest przypisany do wcześniej utworzonego w klasie pola typu WebDriver o nazwie driver.
     */
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Metoda załaduje w przeglądarce zadany url.
     */
    public void open() {
        driver.get(url);
    }

    /**
     * Metoda zwróci boolean (czyli true lub false) w zależności od tego, czy obecny adres URL w przeglądarce zgdza się
     * z tym trzymanym w tej klase w polu typu String o nazwie url.
     */
    public boolean isAt() {
        return driver.getCurrentUrl().equals(url);
    }

    /**
     * Metoda wykonuje kolejne kroki celem wypełnienia formularza danymi pobranymi metdami typu setter z obiektu typu
     * User podanego do tej metody.
     */
    public void registerNewIndividualUser(User user) {
        /**
         * Tworzymy nowy obiekt typu Generate. Użyjemy go do pobrania ze strony www wygenerowanego adresu email.
         * (Sami napisaliście tę klasę :) )
         */
        Generate generate = new Generate();
        // Wprowadzamy dane użytkownika
        driver.findElement(By.id("fos_user_registration_form_email")).sendKeys(user.getEmail());
        driver.findElement(By.id("fos_user_registration_form_name")).sendKeys(user.getFirstName());
        driver.findElement(By.id("fos_user_registration_form_lastname")).sendKeys(user.getLastName());
        driver.findElement(By.id("fos_user_registration_form_plainPassword_first")).sendKeys(user.getPassword());
        driver.findElement(By.id("fos_user_registration_form_plainPassword_second")).sendKeys(user.getPassword());
        driver.findElement(By.id("form_city")).sendKeys(user.getCity());
        driver.findElement(By.id("form_postal_code")).sendKeys(user.getPostalCode());
        driver.findElement(By.id("form_street")).sendKeys(user.getStreet());
        driver.findElement(By.id("form_number")).sendKeys(user.getHouseNumber());

        // Zaznaczamy Zgodę na regulamin
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        // Klikamy przycisk Zarejestruj
        driver.findElement(By.id("register-submit-btn")).click();
    }
}