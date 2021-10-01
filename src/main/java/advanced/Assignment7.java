package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.id("product"));
        int rowsCount = table.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr")).size();
        System.out.println(rowsCount);

        int columnCount = table.findElements(By.xpath("/html[1]/body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/th")).size();
        System.out.println(columnCount);

        System.out.println(table.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[3]")).getText());

    }
}
