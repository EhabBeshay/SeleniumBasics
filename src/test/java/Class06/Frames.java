package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();

     //   write down the topic
//        switch to the iframe
        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.xpath("//input[@name='Topic']"));
        topic.sendKeys("Hello");

        //click on the checkbox
        // using id method
        driver.switchTo().frame("checkboxIframe");

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        //select the animal babyCat from the dropDown
        // switch to def
        driver.switchTo().defaultContent();

        // switch by web element
        WebElement frameWithAnimal = driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        driver.switchTo().frame(frameWithAnimal);

        //locate the webelement select
        WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(animals);
        select.selectByVisibleText("Baby Cat");
    }
}
