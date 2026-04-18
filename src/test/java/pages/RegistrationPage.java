package pages;

import utility.BrowserDriver;
import utility.Helper;

public class RegistrationPage extends BrowserDriver {
    private final Helper he;

    public RegistrationPage() {
        this.he = new Helper(driver, "locatorsDefinition/RegistrationPage.json");
    }

    public void Write_first_name(String firstName) {
        he.sendKeysToElement("RegistrationPage", "FirstNameTextField", firstName);
    }

    public void Write_last_name(String lastName) {
        he.sendKeysToElement("RegistrationPage", "LastNameTextField", lastName);
    }

    public void Write_email_id(String email) {
        he.sendKeysToElement("RegistrationPage", "EmailTextField", email);
    }

    public void Write_Contact_number(String contactNumber) {
        he.sendKeysToElement("RegistrationPage", "ContactNumberTextField", contactNumber);
    }

    public void Write_User_name(String userName) {
        he.sendKeysToElement("RegistrationPage", "UserNameTextField", userName);
    }

    public void Write_password(String password) {
        he.sendKeysToElement("RegistrationPage", "PasswordTextField", password);
    }

    public void Click_Register_button() {
        he.clickOnWebElement("RegistrationPage", "RegisterButton");
    }
}