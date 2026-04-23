package pages;

import utility.BrowserDriver;
import utility.Helper;

public class HomePage extends BrowserDriver {
    private final Helper he;

    /** Initializes the Helper with the HomePage locator file. */
    public HomePage() {
        this.he = new Helper(driver, "locatorsDefinition/HomePage.json");
    }

    /** Clicks the hamburger (navbar) menu to expand the navigation options. */
    public HomePage Click_hamburger_menu() {
        he.clickOnWebElement("HomePage", "HamburgerMenuXpath");
        return this;
    }

    /** Clicks the Sign In link to navigate to the login page. */
    public HomePage Click_SignIn_button() {
        he.clickOnWebElement("HomePage", "SignInLinkXpath");
        return this;
    }
}