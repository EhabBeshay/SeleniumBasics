package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        //instance
        WebDriver driver = new ChromeDriver();
// goto facebook.com
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
//        maximize the window
        driver.manage().window().maximize();

        WebElement radioBtnMAle = driver.findElement(By.xpath("//input[@name='optradio'and @value='Male']"));
        radioBtnMAle.click();
        radioBtnMAle.isSelected();
        boolean status = radioBtnMAle.isSelected();
        if(status){
            System.out.println("The radio button male was selected");
        }else{
            System.out.println("The radio button male was not selected");
        }
        boolean btnEnabledStatus = radioBtnMAle.isEnabled();
        System.out.println("The male radio button is enabled "+ btnEnabledStatus);

        boolean btnisDisplayedStatus = radioBtnMAle.isDisplayed();
        System.out.println("The male radio button is displayed "+btnisDisplayedStatus);

        //from the age range select 5-15
//        find all the elements that have the age range
        List<WebElement> ageRanges = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for(WebElement ageRange:ageRanges){
//            get the value of the attribute "value"
            String option = ageRange.getAttribute("value");
            if(option.equalsIgnoreCase("5 - 15")){
                ageRange.click();
            }
        }


    }

}
