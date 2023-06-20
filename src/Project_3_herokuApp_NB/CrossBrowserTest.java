package Project_3_herokuApp_NB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
public class CrossBrowserTest {
        static String browser = "Edge"; // Type the browser
       static String baseUrl = "http://the-internet.herokuapp.com/login"; // Type the Base url
      static WebDriver driver; // global driver declaration
    //1. Launch the cross browser testing
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
          driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //2. open the URL into browser
        driver.get(baseUrl);
        // maximise the window
        driver.manage().window().maximize();
        // we give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // 3. get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);
        // 4. get the current url
        System.out.println("Current Url " + driver.getCurrentUrl());
        // 5. Get page source
        System.out.println("Page source : " + driver.getPageSource());
        // 6. Find the username field & Type the username to the username field element
        driver.findElement(By.id("username")).sendKeys("jamesbond1212@gmail.com");
        // 7. Find the password field element & Type the password to the password field element
        driver.findElement(By.id("password")).sendKeys("Bond007");
        //8. Close the browser
        driver.close();

    }
}
