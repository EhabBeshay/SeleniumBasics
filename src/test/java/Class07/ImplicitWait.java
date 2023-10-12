package Class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.text.Utilities;
import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-waits.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        // find the button and click
        WebElement button1 = driver.findElement(By.cssSelector("button[id='show_text_synchronize']"));
        button1.click();
        //get the text
        WebElement text1 = driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        String text = text1.getText();
        System.out.println(text);


    }
}
