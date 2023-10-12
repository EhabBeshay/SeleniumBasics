package Review02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

        driver.switchTo().frame("textfieldIframe");
        WebElement checkBoxFrame = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(checkBoxFrame);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");


        //locate the dropDown"Select"
        WebElement dropDown = driver.findElement(By.cssSelector("select[id='animals']"));
        //object of select class
        Select sel = new Select(dropDown);
        //select baby cat by visible text
        sel.selectByVisibleText("Baby Cat");
        //Swict to main page
        driver.switchTo().defaultContent();
        //switch to textfieldIframe frame
        driver.switchTo().frame("textfieldIframe");
        //locate thetext Box
        WebElement textBox = driver.findElement(By.cssSelector("input[name='Topic']"));
        textBox.sendKeys("Frames in Selenium");
        Thread.sleep(2000);
        driver.quit();




    }
}
