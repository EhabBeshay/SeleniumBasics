package Class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableSimple extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/table-data-download-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//        get the whole table
//        **table level access**
        WebElement allTable = driver.findElement(By.xpath("//table[@id='example']"));
        String tableContent = allTable.getText();
        //System.out.println(tableContent);

//        **row level access**
//    only print rows with software engineer in them as position

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for (WebElement row : rows) {
            String text = row.getText();
            if (text.contains("Software Engineer")) {
                //System.out.println(text);
            }
        }
        //  **column level access **

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td"));
        for (WebElement column : columns) {
            String text = column.getText();
            System.out.println(text);
        }
        //***********Print the row with position software engineer without using contains method********************

        //locate the column that contains position
        List<WebElement> positions = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[2]"));
        int i = 1;
        for (WebElement position : positions) {
            String Text = position.getText();
            if (Text.equals("Software Engineer")) {
                System.out.println("The row that contains software engineer is " + i);
                WebElement row = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]"));
                System.out.println(row.getText());


            }
            i = i + 1;
        }
    }
}