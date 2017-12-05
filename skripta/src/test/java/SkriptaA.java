import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SkriptaA {
    @Test
    public void testMain() throws Exception {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath(".//*[@id='email']"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement password = driver.findElement(By.xpath(".//*[@id='passwd']"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement confirm = driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/button"));
        confirm.click();
        Thread.sleep(3000);
        WebElement profile = driver.findElement(By.xpath(".//*[@id='employee_infos']/a/span/img"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout = driver.findElement(By.xpath(".//*[@id='header_logout']"));
        logout.click();
        Thread.sleep(1000);
        driver.quit();

    }

}