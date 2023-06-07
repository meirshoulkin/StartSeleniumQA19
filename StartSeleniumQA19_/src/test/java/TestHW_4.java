import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TestHW_4 {

    WebDriver wd;

    @BeforeTest
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");

    }
    @Test
    public void testMethod(){


        wd.findElement(By.cssSelector("a:last-child"));
        wd.findElement(By.cssSelector("a:nth-child(3)"));

        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href^='/lo']"));
        wd.findElement(By.cssSelector("[href$='in']"));
        wd.findElement(By.cssSelector("[href*='ogi']"));
    }
    @AfterTest
    public void postcondition(){
         wd.quit();
    }
}
