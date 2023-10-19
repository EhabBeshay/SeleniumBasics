package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/input-form-locator.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement inputBox = driver.findElement(By.xpath("//input[@id='first_name']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;

//highlight specific element
        js.executeScript("arguments[0].style.border='5px solid pink'",inputBox);
// click
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit_button']"));

        js.executeScript("arguments[0].click();",submitBtn);


    }
}