package stepsdefinitions;

import io.cucumber.java.en.Given;
import pages.HomePage;

public class Login {

    @Given("User navigates to Login page")
    public void user_navigates_to_login_page() throws InterruptedException {
        HomePage home = new HomePage();
        home.Click_hamburger_menu()
                .Click_SignIn_button();
    }
}