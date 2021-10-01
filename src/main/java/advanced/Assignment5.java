package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
         driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
