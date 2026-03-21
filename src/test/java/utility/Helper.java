package utility;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Helper {

    public static WebDriver driver;
    public static WebDriverWait wait;
    private final JsonLocatorStore locatorStore;

    /**
     * @param driver Selenium WebDriver
     * @param locatorResourcePath classpath resource, e.g. "locatorsDefinition/Example.json"
     */
    public Helper(WebDriver driver, String locatorResourcePath) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.locatorStore = new JsonLocatorStore(locatorResourcePath);
    }


    /**
     * Generic click using a locator defined in the JSON (page + key).
     * For XPath values, we build By.xpath(...) automatically.
     */
    public void clickOnWebElement(String page, String key) {
        String xpath = locatorStore.get(page, key);
        By by = By.xpath(xpath);

        try {
            // Wait until clickable to reduce flakiness
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
            element.click();
        } catch (TimeoutException te) {
            throw new NoSuchElementException(
                    "Timed out waiting for element to be clickable: " + page + "." + key + " [" + xpath + "]", te
            );
        } catch (ElementClickInterceptedException ecie) {
            // As a fallback, try JS click (optional)
            try {
                WebElement element = driver.findElement(by);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            } catch (Exception jsEx) {
                throw new RuntimeException(
                        "Element found but could not be clicked: " + page + "." + key + " [" + xpath + "]", jsEx
                );
            }
        }
    }



     public  void WaitClickElement(String  element , long waitTimeInSeconds){



     }




public void SendKeysOnnWebElement(WebElement element, String text){
      element.click();
      element.clear();
      element.sendKeys(text);

}




}
