package stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ShoeTypesPage;

public class ShoeTypesPageSteps {

    /** Verifies the page title confirms the user has reached the Shoe Types page after login. */
    @Then("User should be on the Shoe Types page")
    public void user_should_be_on_the_shoe_types_page() {
        String title = new ShoeTypesPage().Get_page_title();
        Assert.assertEquals("Ace Online Shoe Portal", title);
    }

    /** Clicks the Formal Shoes exclusive collection button to navigate to the Formal Shoes list. */
    @When("User clicks on the Formal Shoes exclusive collection")
    public void user_clicks_on_the_formal_shoes_exclusive_collection() {
        new ShoeTypesPage().Click_formal_shoes_button();
    }
}
