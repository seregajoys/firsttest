import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.testng.Assert.*;

public class SkriptBtest {
    @Test
    public void testTestmain() throws Exception {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        Thread.sleep(3000);
        WebElement login = driver.findElement(By.xpath(".//*[@id='email']"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement password = driver.findElement(By.xpath(".//*[@id='passwd']"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement confirm = driver.findElement(By.xpath(".//*[@id='login_form']/div[3]/button"));
        confirm.click();
        Thread.sleep(3000);
        WebElement orders = driver.findElement(By.xpath(".//*[@id='subtab-AdminParentOrders']/a"));
        orders.click();
        Thread.sleep(1000);
        String title = driver.getTitle ();
                System.out.println(title);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Заказы"));
        WebElement catalog = driver.findElement(By.xpath(".//*[@id='subtab-AdminCatalog']/a"));
        catalog.click();
        Thread.sleep(3000);
        String catalogtitle = driver.getTitle();
                System.out.println(catalogtitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("товары"));
        Thread.sleep(1000);
        WebElement customer = driver.findElement(By.xpath("html/body/nav/ul/li[5]/a"));
        customer.click();
        Thread.sleep(3000);
        String customertitle = driver.getTitle();
                System.out.println(customertitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Управление"));
        WebElement service = driver.findElement(By.xpath(".//*[@id='subtab-AdminParentCustomerThreads']/a/span"));
        service.click();
        Thread.sleep(1000);
        String servicetitle = driver.getTitle();
                System.out.println(servicetitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Service"));
        WebElement stat = driver.findElement(By.xpath(".//*[@id='subtab-AdminStats']/a/span"));
        stat.click();
        Thread.sleep(1000);
        String stattitle = driver.getTitle();
                System.out.println(stattitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Статистика"));
        WebElement modules = driver.findElement(By.xpath(".//*[@id='subtab-AdminParentModulesSf']/a/span"));
        modules.click();
        Thread.sleep(1000);
        String modulestitle = driver.getTitle();
                System.out.println(modulestitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("prestashop"));
                Thread.sleep(2000);
        WebElement design = driver.findElement(By.xpath("html/body/nav/ul/li[10]/a"));
        design.click();
        Thread.sleep(1000);
        String designtitle = driver.getTitle();
                System.out.println(designtitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Шаблоны"));
        WebElement shipping = driver.findElement(By.xpath(".//*[@id='subtab-AdminParentShipping']/a"));
        shipping.click();
        Thread.sleep(1000);
        String shippingtitle = driver.getTitle();
                System.out.println(shippingtitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Курьеры"));
        WebElement payment = driver.findElement(By.xpath(".//*[@id='subtab-AdminParentPayment']/a"));
        payment.click();
        Thread.sleep(1000);
        String paymanttitle = driver.getTitle();
                System.out.println(paymanttitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Payment"));
        WebElement localization = driver.findElement(By.xpath(".//*[@id='subtab-AdminInternational']/a"));
        localization.click();
        Thread.sleep(1000);
        String localizationtitle = driver.getTitle();
                System.out.println(localizationtitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Локализация"));
        WebElement shop = driver.findElement(By.xpath(".//*[@id='subtab-ShopParameters']/a"));
        shop.click();
        Thread.sleep(1000);
        String shoptitle = driver.getTitle();
                System.out.println(shoptitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("General"));
        WebElement information = driver.findElement(By.xpath(".//*[@id='subtab-AdminAdvancedParameters']/a"));
        information.click();
        Thread.sleep(1000);
        String informationtitle = driver.getTitle();
                System.out.println(informationtitle);
                driver.navigate().refresh();
                assertTrue(driver.getTitle().contains("Information"));
        Thread.sleep(5000);
        driver.quit();


    }

}