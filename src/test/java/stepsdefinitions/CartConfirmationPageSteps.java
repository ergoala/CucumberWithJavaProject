package stepsdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CartConfirmationPage;

public class CartConfirmationPageSteps {

    /** Verifies the cart confirmation page shows the expected success message. */
    @Then("User should see the confirmation message {string}")
    public void user_should_see_the_confirmation_message(String expectedMessage) {
        String actualMessage = new CartConfirmationPage().Get_confirmation_message();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
