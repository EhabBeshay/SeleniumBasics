package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("abracdbra");

        // clear the text box and userName
        userName.clear();
        userName.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement welcomeMsg = driver.findElement(By.linkText("Welcome Admin"));
        String msg = welcomeMsg.getText();
        System.out.println("The message is"+ msg);
    }
}
