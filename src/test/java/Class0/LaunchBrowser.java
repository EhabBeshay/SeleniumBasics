package Class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //Declare the instance of Webdriver

        WebDriver driver = new ChromeDriver();

        // use  the driver.get() method

        driver.get("Https://www.google.com");

        // maximize your window

        driver.manage().window().maximize();

        // get the URL of the website
        String currentUrl = driver.getCurrentUrl();
        System.out.println("The current url is: " + currentUrl);

        //     get the title
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        Thread.sleep(2000);
        // close the browser
        driver.quit();
    }
}
