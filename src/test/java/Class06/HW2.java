package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.MBeanAttributeInfo;
import java.util.Set;

/*
HW2:
goto gmail.com
click on help
click on privacy
click on terms
switch the focus on terms page and get the title and print on screeen
then switch the focus back to the gmail page
and print the title of the main page on screen
 */
public class HW2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/challenge/pwd?TL=AJeL0C6Wlq_-hBU" +
                "_kxi7giwNLsb8ngNCxBZoDCTfB39FPD4lxFktkbmTxkGFk3Wv&checkConnection&checkedDomai" +
                "ns=youtube&cid=1&continue=https%3A%2F%2Fmail.google.com&dsh=S621381444%3A169646813" +
                "9552591&flowEntry=ServiceLogin&flowName=GlifWebSignIn&hl=en-GB&ifkv=AYZoVhchwqN3klvNy" +
                "3n54bsx10Z2SwGqQwDSfc3xhKWVh-XKFqu5RH3XbvJwLj0oLW2Q878x8kUx2g&pstMsg=1&theme=glif");

        driver.manage().window().maximize();

        //click on help, privacy and terms
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();
        //get current page gmail handle
        String gmailHandel=driver.getWindowHandle();

        //switch the focus on terms page and get the title and print on screeen
        Set<String> handles = driver.getWindowHandles();
        for (String x : handles) {
            driver.switchTo().window(x);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")) ;
            {
                System.out.println("Terms page title is: " + title);
                break;
            }
        }
        //print gmail handle
        driver.switchTo().window( gmailHandel);
        System.out.println(driver.getTitle());
    }
}