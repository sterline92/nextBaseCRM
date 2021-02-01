package Sterline;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

import java.util.concurrent.TimeUnit;

public class CT0002 {
/*
    public Object WebDriver;
    WebElement userName, passWord, submit;
    String username = "User15";
    String password = "Userpass123";
*/
    /*
    @BeforeMethod
    public void setUp() {

    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void login_functionality() {
        driver.findElement(By.id("User")).sendKeys("User15");

        driver.findElement(By.className("groupbottom")).sendKeys("Userpass123");

        driver.findElement(By.id("submit-wrapper")).click();

        driver.quit();
    }
*/


    public static void main(String[] args) {
        Object WebDriver;
        WebElement userName, passWord, submit;
        String username = "User15";
        String password = "Userpass123";

        // set up my driver
        WebDriverManager.chromedriver().setup();

        // open browser
        WebDriver driver = new ChromeDriver();

         driver.get("http://qa.trycloud.net/index.php/login?clear=1");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//input[@id='User']")).sendKeys("User15");

        driver.findElement(By.xpath("//*[contains(@class,'groupbottom')]")).sendKeys("Userpass123");

        driver.findElement(By.xpath("//div[@id='submit-wrapper']")).click();

        driver.quit();


        }

    }


