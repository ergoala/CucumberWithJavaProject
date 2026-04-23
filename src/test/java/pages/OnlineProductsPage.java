package pages;

import utility.BrowserDriver;
import utility.Helper;

public class OnlineProductsPage extends BrowserDriver {
    private final Helper he;

    /** Initializes the Helper with the OnlineProductsPage locator file. */
    public OnlineProductsPage() {
        this.he = new Helper(driver, "locatorsDefinition/OnlineProductsPage.json");
    }

    /** Clicks the Home navigation link. */
    public void Click_home_link() {
        he.clickOnWebElement("OnlineProductsPage", "HomeNavLink");
    }

    /** Expands the Formal Shoes category section. */
    public void Click_formal_shoes_dropdown() {
        he.clickOnWebElement("OnlineProductsPage", "FormalShoesDropdown");
    }

    /** Collapses the Formal Shoes category section. */
    public void Click_formal_shoes_dropup() {
        he.clickOnWebElement("OnlineProductsPage", "FormalShoesDropup");
    }

    /** Expands the Sports Shoes category section. */
    public void Click_sports_shoes_dropdown() {
        he.clickOnWebElement("OnlineProductsPage", "SportsShoesDropdown");
    }

    /** Collapses the Sports Shoes category section. */
    public void Click_sports_shoes_dropup() {
        he.clickOnWebElement("OnlineProductsPage", "SportsShoesDropup");
    }

    /** Expands the Sneakers category section. */
    public void Click_sneaker_shoes_dropdown() {
        he.clickOnWebElement("OnlineProductsPage", "SneakerShoesDropdown");
    }

    /** Collapses the Sneakers category section. */
    public void Click_sneaker_shoes_dropup() {
        he.clickOnWebElement("OnlineProductsPage", "SneakerShoesDropup");
    }

    /** Returns true if the Formal Shoes section title is visible on the page. */
    public boolean Is_formal_shoes_title_displayed() {
        try {
            he.clickOnWebElement("OnlineProductsPage", "FormalShoesTitle");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /** Returns true if the Sports Shoes section title is visible on the page. */
    public boolean Is_sports_shoes_title_displayed() {
        try {
            he.clickOnWebElement("OnlineProductsPage", "SportsShoesTitle");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /** Returns true if the Sneakers section title is visible on the page. */
    public boolean Is_sneaker_shoes_title_displayed() {
        try {
            he.clickOnWebElement("OnlineProductsPage", "SneakerShoesTitle");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
