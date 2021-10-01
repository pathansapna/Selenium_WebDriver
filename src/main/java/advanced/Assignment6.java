package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Assignment6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();



        driver.findElement(By.id("checkBoxOption2")).click();
        String opt = driver.findElement(By.xpath("//label[@for='benz']")).getText();
        System.out.println(opt);

        WebElement selectDropDown = driver.findElement(By.id("dropdown-class-example"));

        Select s = new Select(selectDropDown);
        s.selectByVisibleText(opt);
        driver.findElement(By.cssSelector("#name")).sendKeys(opt);
        driver.findElement(By.id("alertbtn")).click();
        String text = driver.switchTo().alert().getText();
        if (text.contains(opt)){
            System.out.println("Alert message success");
        } else
            System.out.println("Something wrong with execution");
/*

OR
        driver.findElement(By.id("dropdown-class-example")).sendKeys(opt.getText());
        driver.findElement(By.cssSelector("#name")).sendKeys(opt.getText());
        driver.findElement(By.id("alertbtn")).click();

        driver.switchTo().alert().accept();*/


//        if (driver.findElement(By.cssSelector("#name")).sendKeys(opt.getText())){
//            Assert.assertTrue(true);
//        }
//        else
//
//            Assert.assertTrue(false);

//        driver.close();

    }
}
