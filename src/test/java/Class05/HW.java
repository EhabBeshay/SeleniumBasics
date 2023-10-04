package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//select your dream destination from this dropDown.
public class HW {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();

        WebElement dreamDD = driver.findElement(By.xpath("//div[contains(text(), 'Select Your Dream Destination')]"));
        dreamDD.click();

        Thread.sleep(2000);

        WebElement japan = driver.findElement(By.xpath("//a[contains(text(),'japan')]"));
        System.out.println(japan.getText());
        japan.click();
        Thread.sleep(3000);


        driver.quit();

    }
}
