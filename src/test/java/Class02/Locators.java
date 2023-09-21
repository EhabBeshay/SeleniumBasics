package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Ehab");

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Beshay");

        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("Ehab.asadasd@asdasd.com");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement linkBtn = driver.findElement(By.linkText("Link"));
        linkBtn.click();

        WebElement clickHere = driver.findElement(By.partialLinkText("Here"));
        clickHere.click();


    }
}
