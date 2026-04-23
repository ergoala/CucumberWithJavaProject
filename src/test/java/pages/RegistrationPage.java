package pages;

import utility.BrowserDriver;
import utility.Helper;

public class RegistrationPage extends BrowserDriver {
    private final Helper he;

    /** Initializes the Helper with the RegistrationPage locator file. */
    public RegistrationPage() {
        this.he = new Helper(driver, "locatorsDefinition/RegistrationPage.json");
    }

    /** Types the given first name into the First Name field. */
    public void Write_first_name(String firstName) {
        he.sendKeysToElement("RegistrationPage", "FirstNameTextField", firstName);
    }

    /** Types the given last name into the Last Name field. */
    public void Write_last_name(String lastName) {
        he.sendKeysToElement("RegistrationPage", "LastNameTextField", lastName);
    }

    /** Types the given email address into the Email field. */
    public void Write_email_id(String email) {
        he.sendKeysToElement("RegistrationPage", "EmailTextField", email);
    }

    /** Types the given contact number into the Contact Number field. */
    public void Write_Contact_number(String contactNumber) {
        he.sendKeysToElement("RegistrationPage", "ContactNumberTextField", contactNumber);
    }

    /** Types the given username into the Username field. */
    public void Write_User_name(String userName) {
        he.sendKeysToElement("RegistrationPage", "UserNameTextField", userName);
    }

    /** Types the given password into the Password field. */
    public void Write_password(String password) {
        he.sendKeysToElement("RegistrationPage", "PasswordTextField", password);
    }

    /** Clicks the Register button to submit the registration form. */
    public void Click_Register_button() {
        he.clickOnWebElement("RegistrationPage", "RegisterButton");
    }
}