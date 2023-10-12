package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithSelectClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");

        driver.manage().window().maximize();
        //find the drop down or locate the web element
        WebElement dropDown = driver.findElement(By.xpath("//Select[@id='select-demo']"));
        //create obj of select class and pass the web element
        Select sel = new Select(dropDown);
        //use any of select class methods to select the desired option
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);

        sel.selectByValue("Tuesday");
        Thread.sleep(2000);

        sel.selectByIndex(1);

        List<WebElement> options =  sel.getOptions();
        for(WebElement option: options){
            System.out.println(option.getText());
        }

    }
}
