package Class08;

import Class09.JsExecutor;
import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Select the date from calander "5th Dec 1998"

https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker
 */
public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker";
        String browser = "chrome";

        openBrowserAndLaunchApplication(url, browser);

        WebElement frameWithCalendar = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(frameWithCalendar);
        WebElement calendar = driver.findElement(By.xpath("//input[@id='datepicker']"));
        calendar.click();
        WebElement table = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(table));
        // retrive the month and year web element and change it to String

        String monthYearValue = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
        System.out.println(monthYearValue);
        String month = monthYearValue.split(" ")[0].trim();
        String year = monthYearValue.split(" ")[1].trim();
        while (!(month.equals("December")&& year.equals("1998"))){
            WebElement prev = driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-w']"));
            prev.click();
            monthYearValue = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
             month = monthYearValue.split(" ")[0].trim();
             year = monthYearValue.split(" ")[1].trim();

        }
        WebElement day = driver.findElement(By.xpath("//a[text()='5']"));
        day.click();







    }
}
