import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Klasa (Model) według której będą tworzone nowe obiekty tej klasy (new ConfirmPage - to ten moment).
 */
public class ConfirmedPage {

    /**
     * 1. Pole typu String (tekst) przetrzymujący adres URL strony Confirem Page.
     * 2. Pole typu WebDriver do którego później przypiszemy nowe okno przeglądarki.
     */
    private String url = "https://wro-tem-s-01.codersguru.pl/register/confirmed";
    private WebDriver driver;

    /**
     *    == KONSTRUKTOR ==
     *
     *  1. Konstruktor ma nazwę identyczną jak klasa:
     *      - Klasa:        public class ConfirmedPage
     *      - Konstruktor:        public ConfirmedPage()
     *
     *  2. Konstruktor wykona swoje instrukcje za każdym razem, kiedy tworzony jest nowy obiekt ConfirmedPage,
     *     na przykład:
     *                  ConfirmedPage confirmedPage = new ConfirmedPage(); <--- Kod w innej klasie.
     *
     *  W tym przypadku, kiedy nowy obiekt strony jest tworzony MUSIMY podać mu obiek klasy WebDriver:
     *      - ConfirmedPage(WebDriver driver).
     *  Ten WebDriver jest przypisany do wcześniej utworzonego w klasie pola typu WebDriver o nazwie driver.
     */
    public ConfirmedPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Metoda zwróci boolean (czyli true lub false) w zależności od tego, czy obecny adres URL w przeglądarce zgdza się
     * z tym trzymanym w tej klase w polu typu String o nazwie url.
     */
    public boolean isAt() {
        return driver.getCurrentUrl().equals(url);
    }

    /**
     * Metoda zwróci tekst ( getText() ) z zadanego elementu o ID "user-name".
     * @return
     */
    public String getLoggedUserName() {
        return driver.findElement(By.id("user-name")).getText();
    }
}
