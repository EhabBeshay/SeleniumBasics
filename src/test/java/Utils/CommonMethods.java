package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CommonMethods {
    public static  WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        //instance

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
        }


        // goto facebook.com
        driver.get(url);
        //        maximize the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }

    }
    public static  void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public static WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        return wait;
    }

    public static void waitForClickAbility(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }
    public  void click(WebElement element){
        waitForClickAbility(element);
        element.click();
    }

    public static void jsClick(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }
    public static void screenshot(String filename){
        TakesScreenshot ts = (TakesScreenshot) driver;
        File ss = ts.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(ss, new File(System.getProperty("user.dir")+"\\screenshot\\" + filename+ ".png"));
        } catch (IOException e){
            System.out.println("No file to copy");
        }
    }
    public static String[] getMonthYear(String monthYearValue){
        return monthYearValue.split(" ");
    }

    public static void  selectDate(String exDay, String exMonth, String expYear){
        if(exMonth.equals("February") && Integer.parseInt(exDay)>29){
            System.out.println("wrong date:"+exMonth+" : "+exDay);
            return;
        }
        if (Integer.parseInt(exDay)>31){
            System.out.println("wrong date:"+exMonth+" : "+exDay);
            return;
        }


        String monthYearValue = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();
        System.out.println(monthYearValue);

        while (!(getMonthYear(monthYearValue)[0].equals(exMonth)&& getMonthYear(monthYearValue)[1].equals(expYear))){
            WebElement prev = driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-w']"));
            prev.click();
            monthYearValue = driver.findElement(By.cssSelector("div[class='ui-datepicker-title']")).getText();


        }
       try {
           WebElement day = driver.findElement(By.xpath("//a[text()='"+exDay+"']"));
           day.click();
       }catch (Exception e){
           System.out.println("wrong date:"+exMonth+" : "+exDay);
       }


    }
}
