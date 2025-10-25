import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class App {
    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\java1\\src\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver drivers = new ChromeDriver();

        // Open URL
        drivers.get("https://vle.fas.vau.ac.lk/login/index.php");

        // Maximize window
        drivers.manage().window().maximize();

        // 1. Locate by name
        WebElement username = drivers.findElement(By.name("username"));
        username.sendKeys("abc");

        // Wait for 5 seconds
        Thread.sleep(5000);

        // Quit the browser
        drivers.quit();
    }
}
