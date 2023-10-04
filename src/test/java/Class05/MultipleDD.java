package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");

        driver.manage().window().maximize();

        WebElement multipleDD = driver.findElement(By.xpath("//Select[@id='multi-select']"));

        Select sel = new Select(multipleDD);

        sel.selectByVisibleText("Texas");
        sel.selectByValue("Florida");
        //Deselect
        Thread.sleep(1000);
        sel.deselectByVisibleText("Texas");
        // check wether the dropdown is multi selected or not
        System.out.println(sel.isMultiple());


    }
}
