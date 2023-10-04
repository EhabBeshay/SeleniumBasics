package Class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
//        maximize the window
        driver.manage().window().maximize();
//        Task1
//        click on the first alert button and handle the alert
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(2000);
//switch the focus of the driver to alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
Thread.sleep(2000);
        // Task 2

        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();

        alert.sendKeys("I am human");
        alert.accept();
        Thread.sleep(3000);
        //Task 3
        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        alert.dismiss();

    }
}