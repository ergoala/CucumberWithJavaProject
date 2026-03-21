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
  //  @When("User succesfully  enters the log in details")
    //public void user_succesfully_enters_the_log_in_details() {
      //  LoginPage login = new LoginPage();
        //  login.Write_email().
          //      Write_password().
            //    Click_login_button();

    }




