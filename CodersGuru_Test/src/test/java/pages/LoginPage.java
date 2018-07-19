package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    public void loginAs(String login, String password) {
          driver.findElement(By.id("username")).sendKeys(login);
          driver.findElement(By.id("password")).sendKeys(password);
          driver.findElement(By.id("_submit")).click();
    }

    public void open() {
        driver.get("https://wro-tem-s-01.codersguru.pl/login");
        driver.manage().window().maximize();
    }

    public void doubleClickLoginButton() {
        driver.findElement(By.id("_submit")).click();
        driver.findElement(By.id("_submit")).click();
    }
}
