package ascendlearning.steps;

import ascendlearning.pages.HomePage;
import ascendlearning.pages.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

import com.github.javafaker.Faker;

public class RegisterSteps extends ScenarioSteps {
	private static final String PHONE_NUMBER_FORMAT = "\\(\\d\\d\\d\\)\\d\\d\\d-\\d\\d\\d\\d";
	RegisterPage registerPage;

 
    @When("^I register a random user$")
    public void iRegisterRandomUser() {
    	
    	Faker faker = new Faker();
    	String firstName = faker.name().firstName();
    	String recoveryName = faker.name().firstName();
    	String id=faker.number().digits(4);
    	String lastName = faker.name().lastName(); 
    	String email = faker.internet().emailAddress();
    	String password=faker.internet().password(8, 12, true, true) + "Aa!";
    	String phoneNumber=faker.regexify(PHONE_NUMBER_FORMAT);
    	String streetAddress=faker.address().streetAddress();
    	String city=faker.address().cityName();
    	String postalCode=faker.address().zipCode();
    	registerPage.fillFirstName(firstName);
    	registerPage.fillLastName(lastName);
    	registerPage.fillUserName(id+firstName);
    	registerPage.fillemail(email);
    	registerPage.fillPassword(password);
    	registerPage.fillPasswordConfirmation(password);
    	registerPage.fillQuestionDropdown("What is your mother’s maiden name?");
    	registerPage.fillPasswordResetField(recoveryName);
    	registerPage.fillPhoneNumber(phoneNumber);
    	registerPage.fillStreetAddress1(streetAddress);
    	registerPage.fillCity(city);
    	registerPage.fillPostalCode(postalCode);
    	registerPage.clickRegisterButton(); 
    	registerPage.waitForAcceptTermButton();
    }
    
    @When("^accept term button is visible$")
    public void acceptTermIsVisible() {
    	assertThat(registerPage.acceptTermButtonIsVisible());
    }
}
