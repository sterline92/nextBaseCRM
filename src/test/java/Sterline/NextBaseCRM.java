package Sterline;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NextBaseCRM {

    WebDriver driver;
    WebElement userName, passWord, loginButton, logoutLink;
    String password = "UserUser";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //GOES TO TEST ENVIRONMENT
        driver.get("https://login2.nextbasecrm.com");
    }

    @Test
    public void test_login_function() {
        userName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.clear();
        userName.sendKeys("hr51@cybertekschool.com");


        passWord = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passWord.sendKeys(password);


        loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

    }

    @Test
    public void test_logout_function() {
        logoutLink = driver.findElement(By.xpath("//span[.='Log out']"));
        logoutLink.click();
    }
}

  /*
    public static void main(String[] args) {


        WebDriver driver;
        WebElement usernameField, passwordField, loginButton, userSettingsLink, logoutLink;
        String password = "UserUser";

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            //GOES TO TEST ENVIRONMENT
            driver.get("https://login2.nextbasecrm.com");

            usernameField = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
            usernameField.clear();
            usernameField.sendKeys("hr51@cybertekschool.com");

            passwordField = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
            passwordField.sendKeys(password);

            loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
            loginButton.click();

            logoutLink = driver.findElement(By.xpath("//span[.='Log out']"));
            logoutLink.click();

        }

    }
*/
