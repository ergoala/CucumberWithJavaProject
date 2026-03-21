package pages;


import utility.BrowserDriver;
import utility.Helper;



public class HomePage extends BrowserDriver {
    private final Helper he;


    public HomePage() {
        // Point to your JSON in classpath
        this.he = new Helper(driver, "locatorsDefinition/HomePage.json");
    }


    public HomePage Click_hamburger_menu(){
        he.clickOnWebElement("HomePage","HamburgerMenuXpath");
        return null;
    }

    public HomePage Click_SignIn_button(){

        he.clickOnWebElement("HomePage","SignInLinkXpath");
        return null;
    }


}
