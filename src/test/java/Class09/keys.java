package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class keys extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://35.175.58.98/keypress.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement input = driver.findElement(By.xpath("//input[@class='form-control']"));
        input.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        input.sendKeys(Keys.TAB);
    }
}