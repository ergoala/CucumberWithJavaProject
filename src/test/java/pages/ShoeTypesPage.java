package pages;

import utility.BrowserDriver;
import utility.Helper;

public class ShoeTypesPage extends BrowserDriver {
    private final Helper he;

    /** Initializes the Helper with the ShoeTypesPage locator file. */
    public ShoeTypesPage() {
        this.he = new Helper(driver, "locatorsDefinition/ShoeTypesPage.json");
    }

    /** Returns the main page title text to verify the current page. */
    public String Get_page_title() {
        return he.getTextFromElement("ShoeTypesPage", "PageTitle");
    }

    /** Clicks the Formal Shoes exclusive collection button, navigating to the Formal Shoes list. */
    public void Click_formal_shoes_button() {
        he.clickOnWebElement("ShoeTypesPage", "FormalShoesButton");
    }

    /** Clicks the Home navigation link. */
    public void Click_home_link() {
        he.clickOnWebElement("ShoeTypesPage", "HomeNavLink");
    }
}
