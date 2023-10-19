package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragDrop extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/simple_context_menu.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        Actions action=new Actions(driver);

        //        draggable
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

//        droplocation
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

        //action.dragAndDrop(draggable,dropLocation).perform();

        //So basically, the build() method in Selenium is used to create a composite action that contains
        // all the actions gathered which are ready to be performed. The perform()
        // method is used to execute the chain of actions which are built using the Action build method

        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();

    }
}
