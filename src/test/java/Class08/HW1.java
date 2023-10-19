package Class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/*
HW1:
goto http://35.175.58.98/table-pagination-demo.php
print all the rows with remarks pass
remember to print rows from all pages of tables
 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://35.175.58.98/table-pagination-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
boolean isEnabled = true;
        for (int i = 0; i < 3; i++) {
            List<WebElement> webelemntlist = driver.findElements(By.xpath("//table/tbody/tr"));
            webelemntlist.stream().filter(s->s.getText().contains("Pass")).forEach(s-> System.out.println(s.getText()));

            WebElement nextButton = driver.findElement(By.xpath("//a[@class='next_link']"));
            nextButton.click();

        }

    }


}
