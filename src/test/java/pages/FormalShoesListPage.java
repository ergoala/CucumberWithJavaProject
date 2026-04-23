package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import utility.Helper;

import java.time.Duration;

public class FormalShoesListPage extends BrowserDriver {
    private final Helper he;
    private final WebDriverWait wait;

    /** Initializes the Helper and explicit wait for the Formal Shoes list page. */
    public FormalShoesListPage() {
        this.he = new Helper(driver, "locatorsDefinition/FormalShoesListPage.json");
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /** Clicks the radio button that selects the given product by name. */
    public void Select_shoe(String productName) {
        String xpath = String.format(
            "//tr[.//td[contains(text(),'%s')]]//input[@name='optradio']", productName);
        WebElement radio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        radio.click();
    }

    /** Selects the given color from the color dropdown of the specified product. */
    public void Select_color(String productName, String color) {
        String xpath = String.format(
            "//tr[.//td[contains(text(),'%s')]]//select[1]", productName);
        WebElement select = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        new Select(select).selectByVisibleText(color);
    }

    /** Selects the given size from the size dropdown of the specified product. */
    public void Select_size(String productName, String size) {
        String xpath = String.format(
            "//tr[.//td[contains(text(),'%s')]]//select[2]", productName);
        WebElement select = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        new Select(select).selectByVisibleText(size);
    }

    /** Clicks the Add to Cart button for the specified product, triggering the cart confirmation page. */
    public void Click_add_to_cart(String productName) {
        String xpath = String.format(
            "//tr[.//td[contains(text(),'%s')]]//button[contains(@class,'AddToCart')]", productName);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        button.click();
    }

    /** Clicks the Home navigation link. */
    public void Click_home_link() {
        he.clickOnWebElement("FormalShoesListPage", "HomeNavLink");
    }
}
