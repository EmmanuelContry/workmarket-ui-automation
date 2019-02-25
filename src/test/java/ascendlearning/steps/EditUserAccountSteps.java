package ascendlearning.steps;

import ascendlearning.pages.EditUserAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;


import com.github.javafaker.Faker;

public class EditUserAccountSteps extends ScenarioSteps {

	EditUserAccountPage editUserAccountPage;

    @Given("^I fill billing street address 2 with \"([^\"]*)\"$")
    public void iFillStreetAddressWith(String billingStreetAddress2) {
    	editUserAccountPage.fillStreet2Address(billingStreetAddress2);
    }
    
    @Given("^I fill billing street address 2 with random number$")
    public void iFillStreetAddressWithRandomNUmber() {
    	Faker faker = new Faker();
    	String randomNumber=faker.number().digits(4);
    	String addressWithRandomeNumber="STE 425"+randomNumber;
    	editUserAccountPage.fillStreet2Address(addressWithRandomeNumber);
    	Serenity.setSessionVariable("randomNumber").to(addressWithRandomeNumber);
    	
    }
    
    @Given("^I fill billing address country with \"([^\"]*)\"$")
    public void iFillAddressCountryWith(String billingAddressCountry) {
    	editUserAccountPage.fillAddressCountry(billingAddressCountry);
    }
    
    @Given("^I fill billing address country with random letters$")
    public void iFillAddressCountryWithRandomLetters() {
    	Faker faker = new Faker();
    	String randomLetters=faker.letterify("????");
    	Serenity.setSessionVariable("randomLetters").to(randomLetters);
    	editUserAccountPage.fillAddressCountry(randomLetters);
    }
    
    @Then("^the address country has the random letters$")
    public void theAddressCountryHasRandomNumbers() {
    	String randomNumbers=editUserAccountPage.getAddressCountryValue();
    	String expectedRandomNumbers = Serenity.sessionVariableCalled("randomLetters");
    	assertThat(randomNumbers.equals(expectedRandomNumbers));
    }
    
    @Then("^the street address 2 has the random numbers$")
    public void theStreetAddressHasRandomNumbers() {
    	String randomNumbers=editUserAccountPage.getStreetAddress2Value();
    	String expectedRandomNumbers = Serenity.sessionVariableCalled("randomNumber");
    	assertThat(randomNumbers.equals(expectedRandomNumbers));
    }
    
    @When("^I click register button in edit page$")
    public void iClickRegisterButton() {
    	editUserAccountPage.clickOnRegister();
    }
    
    @When("^I click cancel button$")
    public void iClickCancelButton() {
    	editUserAccountPage.clickOnCancel();
    }
}
