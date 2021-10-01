package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        driver.manage().window().maximize();

        driver.findElement(By.id("autocomplete")).sendKeys("ind");

        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
    }
}
