package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class Assignment3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
        WebDriverWait w = new WebDriverWait(driver, 5);

        w.until(ExpectedConditions.elementToBeClickable(By.id("results")));

        System.out.println(driver.findElement(By.id("results")).getText());


    }
}
