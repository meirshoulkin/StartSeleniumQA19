import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }


    @Test
    public void testCss(){
        WebElement germany = wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));
        WebElement element2 = wd.findElement(By.xpath("//*[@id='customers']//tr[7]/td[last()]"));
        WebElement element3 = wd.findElement(By.xpath("(//td[contains(text(),'Germany')])[2]"));
        String text = germany.getText();
        String text1 = element2.getText();
        String text2 = element3.getText();
        System.out.println(text);
        System.out.println(text1);
        System.out.println(text2);
        Assert.assertEquals(text,"Germany");

        List<WebElement> rows = wd.findElements(By.cssSelector("#customers tr"));
        List<WebElement> elem = wd.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
        System.out.println(rows.size());
        System.out.println(elem.size());

        List<WebElement> columns = wd.findElements(By.cssSelector("#customers th"));
        List<WebElement> elements = wd.findElements(By.xpath("//*[@id='customers']//tbody//th"));
        System.out.println(columns.size());
        System.out.println(elements.size());

        wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));
        wd.findElement(By.xpath("//tr[6]"));

        wd.findElement(By.cssSelector("#customers td:last-child"));
        wd.findElement(By.xpath("//*[text()='Italy']"));

    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
