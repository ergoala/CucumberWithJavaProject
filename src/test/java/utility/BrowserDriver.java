package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BrowserDriver {

    public static WebDriver driver;

    /** Initializes ChromeDriver with performance-optimized flags and navigates to the application URL. */
    public BrowserDriver(){
        WebDriverManager.chromedriver().cachePath(System.getProperty("user.home") + "/.wdm").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
            "--remote-allow-origins=*",
            "--no-sandbox",
            "--disable-dev-shm-usage",
            "--disable-gpu",
            "--disable-extensions",
            "--disable-default-apps",
            "--disable-background-networking",
            "--disable-sync",
            "--no-first-run",
            "--no-default-browser-check",
            "--disable-notifications",
            "--disable-infobars",
            "--silent"
        );
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
    }

    /** Closes the current browser window. */
    public void close(){
        driver.close();
    }
}