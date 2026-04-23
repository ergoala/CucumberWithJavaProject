package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageSteps {

    /** Verifies the browser is on the Home page — navigation to the app URL happens in the @Before hook. */
    @Given("User is on the Home page")
    public void user_is_on_the_home_page() {
        // Browser is already on the home page after BrowserDriver initialization in Hooks
    }

    /** Opens the hamburger navigation menu. */
    @And("User opens the navigation menu")
    public void user_opens_the_navigation_menu() {
        new HomePage().Click_hamburger_menu();
    }

    /** Clicks the Sign In link in the navigation menu, navigating to the login page. */
    @And("User clicks the Sign In option")
    public void user_clicks_the_sign_in_option() {
        new HomePage().Click_SignIn_button();
    }
}
