package advanced;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownLoppingUI {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/sapna/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//        Thread.sleep(2000L);
        /* int i = 1;
        while(i < 5){
            driver.findElement(By.id("")).click(); //4 times

            i++;
        }
         */

//        System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
        driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();

//        for (int i = 1; i < 5; i++){
//            driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
//
//        }
        driver.findElement(By.id("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']")).click();
        driver.findElement(By.id("adultDropdown")).click();


        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        //System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).getText());

    }

}
