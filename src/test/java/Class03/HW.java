package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        WebElement fulName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fulName.sendKeys("Ehab Beshay");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("Ehab@example.com");
        WebElement currentAdd =driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAdd.sendKeys("MD, USA");
        WebElement permanentAdd =driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAdd.sendKeys("MD, USA");
        Thread.sleep(3000);
        WebElement submit =driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
        submit.click();
        driver.quit();




    }
}
