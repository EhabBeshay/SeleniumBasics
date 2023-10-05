package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
HW1:
goto  http://35.175.58.98/handle-iframe.php
click the checkbox
then select the  babycat
then enter topic name
all of this must be done in the same order
 */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();
         // switch to parent frame
        driver.switchTo().frame("textfield-iframe");
        //switch to child frame
        driver.switchTo().frame("checkboxIframe");
        //click checkBox
        WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkBox.click();
        // witch to main page
        driver.switchTo().defaultContent();
        //Switch to dropDown Iframe
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
