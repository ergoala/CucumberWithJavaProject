package pages;

import utility.BrowserDriver;
import utility.Helper;

public class CartConfirmationPage extends BrowserDriver {
    private final Helper he;

    /** Initializes the Helper with the CartConfirmationPage locator file. */
    public CartConfirmationPage() {
        this.he = new Helper(driver, "locatorsDefinition/CartConfirmationPage.json");
    }

    /** Returns the confirmation message text shown after a successful cart addition. */
    public String Get_confirmation_message() {
        return he.getTextFromElement("CartConfirmationPage", "ConfirmationMessage");
    }

    /** Clicks the Home navigation link to return to the main page. */
    public void Click_home_link() {
        he.clickOnWebElement("CartConfirmationPage", "HomeNavLink");
    }
}
