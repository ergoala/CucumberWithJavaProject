package pages;

import utility.BrowserDriver;
import utility.Helper;

public class HomePage extends BrowserDriver {
    private final Helper he;

    public HomePage() {
        this.he = new Helper(driver, "locatorsDefinition/HomePage.json");
    }

    public HomePage Click_hamburger_menu() {
        he.clickOnWebElement("HomePage", "HamburgerMenuXpath");
        return this;
    }

    public HomePage Click_SignIn_button() {
        he.clickOnWebElement("HomePage", "SignInLinkXpath");
        return this;
    }
}