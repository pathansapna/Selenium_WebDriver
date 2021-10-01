package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();



        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String>it= windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());

//        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
//
//        driver.switchTo().window(parentId);



        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
//        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
//
//
//        driver.findElement(By.cssSelector("//a[contains(text(),'Click Here')]")).getText();


        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());


    }
}
