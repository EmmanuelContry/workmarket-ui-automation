package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("/")
public class RegisterPage extends PageObject {

    @FindBy(id = "first_name")
    private WebElementFacade firstNameField;

    @FindBy(id = "last_name")
    private WebElementFacade lastNameField;

    @FindBy(id = "user_form_username")
    private WebElementFacade userNameField;
    
    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "user_form_password")
    private WebElementFacade passwordField;

    @FindBy(id = "user_form_password_confirmation")
    private WebElementFacade passwordconfirmationField;
    
    @FindBy(id = "password_reset_question")
    private WebElementFacade passwordresetquestionDropdown;

    @FindBy(id = "password_reset")
    private WebElementFacade passwordresetField;

    @FindBy(id = "phone_number")
    private WebElementFacade phonenumberField;
    
    @FindBy(id = "street_address_billing_country_code")
    private WebElementFacade countryDropdown;
    
    @FindBy(id = "street_address_billing_province")
    private WebElementFacade provinceField;

    @FindBy(id = "street_address_billing_street_address1")
    private WebElementFacade streetaddress1Field;
    
    @FindBy(id = "street_address_billing_street_address2")
    private WebElementFacade streetaddress2Field;
    
    @FindBy(id = "street_address_billing_city")
    private WebElementFacade cityField;
    
    @FindBy(id = "street_address_billing_locality")
    private WebElementFacade locationregioncountryField;
    
    @FindBy(id = "street_address_billing_postal_code")
    private WebElementFacade postalcodeField;
    
    @FindBy(css = ".btn.btn-lg.btn-primary.popup-tos")
    private WebElementFacade registerButton;
    
    @FindBy(css = ".btn.btn-lg.btn-success.position-fixed.accept-submit")
    private WebElementFacade acceptTermButton;
    
    public void waitForAcceptTermButton() {
    	acceptTermButton.waitUntilVisible();
    }
    
    public Boolean acceptTermButtonIsVisible() {
    	return acceptTermButton.isVisible();
    }
    
    public String getTitleText() {
        return firstNameField.getText().trim();
    }
    
    public void clickRegisterButton() {
    	registerButton.click();
    }

    public void fillTodoField(String todoName) {
    	userNameField.type(todoName);
    }

    public void submitTodo() {
    	userNameField.sendKeys(Keys.ENTER);
    }
    
    public void fillQuestionDropdown(String question) {
    	passwordresetquestionDropdown.selectByVisibleText(question);
    }
    
    public void fillFirstName(String firstName) {
    	firstNameField.type(firstName);
    }
    
    public void fillLastName(String lastName) {
    	lastNameField.type(lastName);
    }
    
    public void fillUserName(String username) {
    	userNameField.type(username);
    }
   
    public void fillemail(String email) {
    	emailField.type(email);
    }
    
    public void fillPassword(String password) {
    	passwordField.type(password);
    }
    
    public void fillPasswordConfirmation(String passwordconfirmation) {
    	passwordconfirmationField.type(passwordconfirmation);
    }
    
    public void fillPasswordResetField(String passwordrecovery) {
    	passwordresetField.type(passwordrecovery);
    }
    
    public void fillPhoneNumber(String phonenumber) {
    	phonenumberField.type(phonenumber);
    }
    
    public void fillStreetAddress1(String streetaddress1) {
    	streetaddress1Field.type(streetaddress1);
    }
    
    public void fillCity(String city) {
    	cityField.type(city);
    }
    
    public void fillLocationRegionCountry(String locationregioncountry) {
    	locationregioncountryField.type(locationregioncountry);
    }
    public void fillPostalCode(String postalcode) {
    	postalcodeField.type(postalcode);
    }
	

    	
    	
    
    
}