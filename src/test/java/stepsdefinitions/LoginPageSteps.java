package stepsdefinitions;

import io.cucumber.java.en.And;
import pages.LoginPage;

public class LoginPageSteps {

    /** Types the given username and password into their respective fields on the login page. */
    @And("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.Write_username(username);
        loginPage.Write_password(password);
    }

    /** Clicks the Login button to submit the credentials. */
    @And("User clicks the Login button")
    public void user_clicks_the_login_button() {
        new LoginPage().Click_login_button();
    }
}
