import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoadedPage {

    private WebDriver driver;
    private String url = "https://www.phptravels.net/flights";


    public LoadedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public void flightInputData(Flight flight) {
        driver.findElement(By.id("s2id_location_from")).click();
        driver.findElement(By.cssSelector("input[class='select2-input select2-focused']")).sendKeys(flight.getFromLocation());



//        driver.findElement(By.id("select2-search")).click();
//        driver.findElement(By.cssSelector("input[class='select2-input select2-focused']/following-sibling")).sendKeys(flight.getToLocation());
//        driver.findElement(By.xpath("//input[@placeholder='Depart']")).sendKeys(flight.getDepartureDate());
//        driver.findElement(By.xpath("//input[@placeholder='0']")).sendKeys(flight.getGuests());
//        driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
        //driver.findElement(By....
        //driver.findElement(By....
        //driver.findElement(By....
        //driver.findElement(By....
    }
}
