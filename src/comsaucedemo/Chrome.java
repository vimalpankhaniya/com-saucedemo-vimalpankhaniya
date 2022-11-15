package comsaucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch the URL
        driver.get(baseurl);

        // Maximise the window
        driver.manage().window().maximize();

        // we give the implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is :" + title);

        // Get tje current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // Get page source
        System.out.println("Page source :" + driver.getPageSource());

        // Find the Accepted username field element
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");
        driver.quit();
    }
}


