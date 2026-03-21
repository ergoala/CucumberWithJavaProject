package pages;

import io.cucumber.messages.ndjson.internal.com.fasterxml.jackson.databind.util.JSONPObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.io.FileReader;
import java.io.Reader;
import java.time.Duration;

public class RegistrationPage extends BrowserDriver {


public static void Write_first_name()  {
        // Explicit wait (targeted)
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        driver.findElement(By.xpath("")).sendKeys("sa");
    }

    public static void Write_last_name()  {
        // Explicit wait (targeted)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("PasswordTextField")));
        driver.findElement(By.xpath("PasswordTextField")).sendKeys("sa");
    }

    public static void Write_email_id()  {
// Explicit wait (targeted)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("LoginButton")));
        driver.findElement(By.xpath("LoginButton")).click();
    }

    public static void Write_Contact_number() {
// Explicit wait (targeted)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("LoginButton")));
        driver.findElement(By.xpath("LoginButton")).click();
    }

        public static void Write_User_name() {
// Explicit wait (targeted)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("LoginButton")));
            driver.findElement(By.xpath("LoginButton")).click();

        }

    public static void Write_password   () {
// Explicit wait (targeted)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("LoginButton")));
        driver.findElement(By.xpath("LoginButton")).click();

    }
        public static void Click_Register_button()  {
// Explicit wait (targeted)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("RegistrationButton")));
        driver.findElement(By.xpath("RegistrationButton")).click();
    }
}
