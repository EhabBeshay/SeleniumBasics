package Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandles {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/challenge/pwd?TL=AJeL0C6Wlq_-hBU" +
                "_kxi7giwNLsb8ngNCxBZoDCTfB39FPD4lxFktkbmTxkGFk3Wv&checkConnection&checkedDomai" +
                "ns=youtube&cid=1&continue=https%3A%2F%2Fmail.google.com&dsh=S621381444%3A169646813" +
                "9552591&flowEntry=ServiceLogin&flowName=GlifWebSignIn&hl=en-GB&ifkv=AYZoVhchwqN3klvNy" +
                "3n54bsx10Z2SwGqQwDSfc3xhKWVh-XKFqu5RH3XbvJwLj0oLW2Q878x8kUx2g&pstMsg=1&theme=glif");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        //click on help, privacy and terms
        driver.findElement(By.linkText("Help")).click();
        driver.findElement(By.linkText("Privacy")).click();
        driver.findElement(By.linkText("Terms")).click();
        //get current page gmail handle
        String gmailHandel=driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        for(String handle : allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google"));
            break;
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.switchTo().window(gmailHandel);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
