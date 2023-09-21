package Class02;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("https://www.facebook.com");
//        maximize the window
        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Ehab.asdasd@asdasf.com");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("asdasdasdas");
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();


    }
}
