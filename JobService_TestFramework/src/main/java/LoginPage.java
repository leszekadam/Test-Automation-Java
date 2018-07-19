import org.openqa.selenium.*;

public class LoginPage {
    private String jobPortalOne = "https://www.pracuj.pl";
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openFirstPortal() {
        driver.get(jobPortalOne);
    }

    public void firstPortalInputJobTitleOne(User user) {
        driver.findElement(By.id("keywords")).sendKeys(user.getJobTitleOne());
        driver.findElement(By.id("location")).sendKeys(user.getJobLocationOne());
        driver.findElement(By.id("searchBtn")).click();
    }

    public void firstPortalInputJobTitleTwo(User user) {
        driver.findElement(By.id("keywords")).sendKeys(user.getJobTitleTwo());
        driver.findElement(By.id("location")).sendKeys(user.getJobLocationOne());
        driver.findElement(By.id("searchBtn")).click();
    }

    public void firstPortalInputJobTitleOneLocationTwo(User user) {
        driver.findElement(By.id("keywords")).sendKeys(user.getJobTitleOne());
        driver.findElement(By.id("location")).sendKeys(user.getJobLocationTwo());
        driver.findElement(By.id("searchBtn")).click();
    }

    public void firstPortalInputJobTitleTwoLocationTwo(User user) {
        driver.findElement(By.id("keywords")).sendKeys(user.getJobTitleTwo());
        driver.findElement(By.id("location")).sendKeys(user.getJobLocationTwo());
        driver.findElement(By.id("searchBtn")).click();
    }
}
