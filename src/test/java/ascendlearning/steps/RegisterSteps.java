package ascendlearning.steps;

import ascendlearning.pages.RegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.github.javafaker.Faker;

public class RegisterSteps extends ScenarioSteps {
	private static final String PHONE_NUMBER_FORMAT = "\\(\\d\\d\\d\\)\\d\\d\\d-\\d\\d\\d\\d";
	private static final String expectedStates="Alaska, Alabama, Arkansas, American Samoa, Arizona, California,"
			+ " Colorado, Connecticut, District of Columbia, Delaware, Florida, Georgia, Guam, Hawaii, Iowa,"
			+ " Idaho, Illinois, Indiana, Kansas, Kentucky, Louisiana, Massachusetts, Maryland, Maine,"
			+ " Michigan, Minnesota, Missouri, Northern Mariana Islands, Mississippi, Montana,"
			+ " North Carolina, North Dakota, Nebraska, New Hampshire, New Jersey, New Mexico, Nevada,"
			+ " New York, Ohio, Oklahoma, Oregon, Pennsylvania, Puerto Rico, Rhode Island, South Carolina,"
			+ " South Dakota, Tennessee, Texas, United States Minor Outlying Islands, Utah, Virginia,"
			+ " Virgin Islands, Vermont, Washington, Wisconsin, West Virginia, Wyoming,"
			+ " Armed Forces Americas (except Canada), Armed Forces Africa, Canada, Europe, Middle East,"
			+ " Armed Forces Pacific";  
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
    	
    	Serenity.setSessionVariable("username").to(firstName);
    	Serenity.setSessionVariable("password").to(password);
    }
    
    @When("^accept term button is visible$")
    public void acceptTermIsVisible() {
    	assertThat(registerPage.acceptTermButtonIsVisible());
    }
    
    @When("^I click the accept term button$")
    public void clickAcceptTermButton() {
    	registerPage.clickAcceptTermButton();
    }
    
    @Then("^the dropdown has have all expected states$")
    public void dropdownHasAllStates() {
    	List<String> list=registerPage.getStatesFromDropDown();
    	for(String state : list) {
    		assertThat(state.indexOf(expectedStates)>-1);
    	}
    }
}
