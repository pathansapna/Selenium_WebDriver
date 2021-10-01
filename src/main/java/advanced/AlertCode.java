package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCode {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        String text = "Sapna";

        driver.findElement(By.id("name")).sendKeys(text);

        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().dismiss();

    }

}