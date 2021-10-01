package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]//p[contains(text(),'New York, US - All airports (NYC)')]")).click();
//        driver.findElement(By.xpath("//p[contains(text(),'Mumbai, IN - Chatrapati Shivaji Airport (BOM)')]")).sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'New York, US - All airports (NYC)')]")));

    }
}
