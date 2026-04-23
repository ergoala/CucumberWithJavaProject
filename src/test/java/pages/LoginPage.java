package pages;

import utility.BrowserDriver;
import utility.Helper;

public class LoginPage extends BrowserDriver {
    private final Helper he;

    /** Initializes the Helper with the LoginPage locator file. */
    public LoginPage() {
        this.he = new Helper(driver, "locatorsDefinition/LoginPage.json");
    }

    /** Types the given username into the Username field. */
    public void Write_username(String username) {
        he.sendKeysToElement("LoginPage", "UserNameTextField", username);
    }

    /** Types the given password into the Password field. */
    public void Write_password(String password) {
        he.sendKeysToElement("LoginPage", "PasswordTextField", password);
    }

    /** Clicks the Login button to submit credentials. */
    public void Click_login_button() {
        he.clickOnWebElement("LoginPage", "LoginButton");
    }

    /** Clicks the New Registration button to navigate to the registration form. */
    public void Click_new_registration_button() {
        he.clickOnWebElement("LoginPage", "NewRegistrationButton");
    }

    /** Clicks the Home navigation link. */
    public void Click_home_link() {
        he.clickOnWebElement("LoginPage", "HomeNavLink");
    }
}
