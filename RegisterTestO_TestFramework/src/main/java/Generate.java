import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Klasa, którą używacie do generowania losowych danych.
 *
 * Sami ją napisaliście ;)
 */
public class Generate {

    /**
     * Metoda zwraca wygenerowany automatycznie adre s email, który pobiera ze strony, która takie emaile generuje.
     *
     * 1. Tworzymy nową przeglądarkę.
     * 2. W niej ładujemy adres strony
     * 3. Klikamy przycisk "Generate new e-mail"
     * 4. Do zmiennej pobiermy tekst z elementu o ID "email_ch_text"
     * 5. Zamykamy okno przeglądarki
     * 6. Zwracamy tekst.
     */
    public String email() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://generator.email/");
        driver.findElement(By.linkText("Generate new e-mail")).click();
        String emailText = driver.findElement(By.id("email_ch_text")).getText();
        driver.quit();
        return emailText;
    }
}
