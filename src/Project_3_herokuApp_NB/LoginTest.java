package Project_3_herokuApp_NB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/**
 * 1. Setup Chrome browser
 * 2. Open URL "https://www.saucedemo.com/"
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class LoginTest {

    public static void main(String[] args) {
       String baseUrl = "http://the-internet.herokuapp.com/login";

       //1. Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //2. open the URL into browser
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 3. get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);

        // 4. get the current url
        System.out.println("current Url " + driver.getCurrentUrl());
        // 5. get page source
        System.out.println("Page source : " + driver.getPageSource());

        // 6. Find the username field & Type the username to the username field element
        driver.findElement(By.id("username")).sendKeys("jamesbond1212@gmail.com");
        // 7. find the password field & type the password to the password field element
        driver.findElement(By.id("password")).sendKeys("Bond007%");
        // 8. Close the Browser
        driver.close();
    }
}
