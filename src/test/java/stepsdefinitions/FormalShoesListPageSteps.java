package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.FormalShoesListPage;
import utility.BrowserDriver;

public class FormalShoesListPageSteps {

    /** Verifies the Formal Shoes list page loaded by checking at least one product row is present. */
    @Then("User should be on the Formal Shoes list page")
    public void user_should_be_on_the_formal_shoes_list_page() {
        boolean pageLoaded = !BrowserDriver.driver.findElements(
            By.xpath("//button[contains(@class,'AddToCart')]")).isEmpty();
        Assert.assertTrue("Formal Shoes list page did not load correctly", pageLoaded);
    }

    /** Clicks the radio button to select the given shoe from the product list. */
    @When("User selects the shoe {string}")
    public void user_selects_the_shoe(String productName) {
        new FormalShoesListPage().Select_shoe(productName);
    }

    /** Selects the specified color from the color dropdown of the given shoe. */
    @And("User selects color {string} for shoe {string}")
    public void user_selects_color_for_shoe(String color, String productName) {
        new FormalShoesListPage().Select_color(productName, color);
    }

    /** Selects the specified size from the size dropdown of the given shoe. */
    @And("User selects size {string} for shoe {string}")
    public void user_selects_size_for_shoe(String size, String productName) {
        new FormalShoesListPage().Select_size(productName, size);
    }

    /** Clicks the Add to Cart button for the given shoe, navigating to the cart confirmation page. */
    @And("User clicks Add to Cart for shoe {string}")
    public void user_clicks_add_to_cart_for_shoe(String productName) {
        new FormalShoesListPage().Click_add_to_cart(productName);
    }
}
