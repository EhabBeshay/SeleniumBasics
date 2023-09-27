package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();
       WebElement textBox1 = driver.findElement(By.xpath("//input[@id='title']"));
       textBox1.sendKeys("Batch17");
       WebElement textBox2 = driver.findElement(By.xpath("//input[@name='title']"));
       textBox2.sendKeys("Batch17");
       WebElement question1 = driver.findElement(By.xpath("//input[contains(@name,'security')]"));
       question1.sendKeys("Whats the color of sun?");
       WebElement theMagicalText = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(theMagicalText.getText());
       WebElement textBoxAPI = driver.findElement(By.xpath("//input[starts-with(@id,'api')]"));
       textBoxAPI.sendKeys("abracadbra");
        //        get the email
        WebElement Email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        Email1.sendKeys("hello1@gmail.com");
        WebElement Email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        Email2.sendKeys("hello1@gmail.com");
        WebElement Email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        Email3.sendKeys("hello1@gmail.com");
        WebElement Field1 = driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        Field1.sendKeys("Cat");
        WebElement Field2 =driver.findElement(By.xpath("//input[@name='customField' and @data-detail= 'two']"));
        Field2.sendKeys("Catterpiller");


    }
}
