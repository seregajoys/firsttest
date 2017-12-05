import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Skripta {
    public static void main(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com.ua");
    }
}
