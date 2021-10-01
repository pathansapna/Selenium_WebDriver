package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();

        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

        driver.close();
    }
}
