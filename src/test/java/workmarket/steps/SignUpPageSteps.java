package workmarket.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import workmarket.pages.SignUpPage;

import com.github.javafaker.Faker;

import static org.assertj.core.api.Assertions.assertThat;

public class SignUpPageSteps extends ScenarioSteps {
	SignUpPage signUpPage;
	
    @Given("^I navigate to signup page$")
    public void iNavigateToLoginPage() {
    	signUpPage.openAt("https://dev.workmarket.com/register/campaign/10081C503B209A0C8E7F05FDCC1AA98D4C904DEEF5F73265CAE38C744E7EAD3E");
    }
    
    @Given("^I click register button$")
    public void clickRegisterButton() {
    	signUpPage.clickOnRegisterButton();
    }
    
    @Given("^I click join as individual button$")
    public void clickJoinAsIndividualButton() {
    	signUpPage.clickOnJoinAsIndividualButton();
    }    
    
    @When("^I type \"([^\"]*)\" in first name field$")
    public void typeUserNameField(String firstName) {
    	signUpPage.setFirstNameField(firstName);
    }
    
    @When("^I type random first name in field$")
    public void typeRandomFirstNameField() {
    	Faker faker = new Faker();
    	signUpPage.setFirstNameField(faker.name().firstName());
    }
    
    @When("^I type \"([^\"]*)\" in last name field$")
    public void typeLastNameField(String lastName) {
    	signUpPage.setLastNameField(lastName);
    }
    
    @When("^I type random last name in field$")
    public void typeRandomLastNameField() {
    	Faker faker = new Faker();
    	signUpPage.setLastNameField(faker.name().lastName());
    }
    
    @When("^I check the consent checkbox$")
    public void checkConsentCheckBox() {
    	signUpPage.checkConsent();
    }
    
    @When("^I type \"([^\"]*)\" in email field$")
    public void typeEmailField(String email) {
    	signUpPage.setEmailField(email);
    }
    
    @When("^I type random email in field$")
    public void typeRandomEmailField() {
    	Faker faker = new Faker();
    	signUpPage.setEmailField(faker.internet().emailAddress());
    }
    
    @When("^I type \"([^\"]*)\" in password field$")
    public void typePasswordField(String password) {
    	signUpPage.setPasswordField(password);
    }
    
    @Then("^Register button is disabled$")
    public void registerButtonIsDisabled() {
    	Boolean isEnabled=signUpPage.registerButtonIsEnabled();
    	assertThat(isEnabled==false);
    }
    
    @Then("^Register button is enabled$")
    public void registerButtonIsEnabled() {
    	Boolean isEnabled=signUpPage.registerButtonIsEnabled();
    	assertThat(isEnabled==true);
    }
    
    @Then("^The alert message for first name field is \"([^\"]*)\"$")
    public void alertMessageForFirstNameIs(String alertMessageFirstNameExpected) {
    	String alertMessageFirstName=signUpPage.getAlertMessageFirstName();
    	assertThat(alertMessageFirstName.contentEquals(alertMessageFirstNameExpected));
    }
    
    @Then("^The alert message for last name field is \"([^\"]*)\"$")
    public void alertMessageForLastNameIs(String alertMessageLastNameExpected) {
    	String alertMessageLastName=signUpPage.getAlertMessageLastName();
    	assertThat(alertMessageLastName.contentEquals(alertMessageLastNameExpected));
    }
    
    @Then("^The alert message for email field is \"([^\"]*)\"$")
    public void alertMessageForEmailIs(String alertMessageEmailExpected) {
    	String alertMessageEmail=signUpPage.getAlertMessageEmail();
    	assertThat(alertMessageEmail.contentEquals(alertMessageEmailExpected));
    }
    
    @Then("^The alert message for password field is \"([^\"]*)\"$")
    public void alertMessageForPasswordIs(String alertMessagePasswordExpected) {
    	waitABit(1000);
    	String alertMessagePassword=signUpPage.getAlertMessagePassword();
    	assertThat(alertMessagePassword.contentEquals(alertMessagePasswordExpected));
    }
    
    @Then("^The password condition message is \"([^\"]*)\"$")
    public void passwordConditionMessageIs(String passwordConditionExpected) {
    	waitABit(1000);
    	String passwordConditionMessage=signUpPage.getPasswordConditionMessage();
    	assertThat(passwordConditionMessage.contentEquals(passwordConditionExpected));
    }
    
    @Then("^The Register Button value is \"([^\"]*)\"$")
    public void registerButtonValueIs(String registerButtonValueExpected) {
    	String registerButtonValue=signUpPage.getRegisterButtonValue();
    	assertThat(registerButtonValue.contentEquals(registerButtonValueExpected));
    }
    
    @Then("^The First Name value is \"([^\"]*)\"$")
    public void firstNameValueIs(String firstNameValueExpected) {
    	String firstNameValue=signUpPage.getFirstNameValue();
    	assertThat(firstNameValue.contentEquals(firstNameValueExpected));
    }
    
    @Then("^The Last Name value is \"([^\"]*)\"$")
    public void lastNameValueIs(String lastNameValueExpected) {
    	String lastNameValue=signUpPage.getLastNameValue();
    	assertThat(lastNameValue.contentEquals(lastNameValueExpected));
    }
    
    @Then("^The email value is \"([^\"]*)\"$")
    public void emailValueIs(String emailValueExpected) {
    	String emailValue=signUpPage.getEmailValue();
    	assertThat(emailValue.contentEquals(emailValueExpected));
    }
    
    @Then("^The password value is \"([^\"]*)\"$")
    public void passwordValueIs(String passwordValueExpected) {
    	String passwordValue=signUpPage.getPasswordValue();
    	assertThat(passwordValue.contentEquals(passwordValueExpected));
    }
    
    @Then("^The page header is \"([^\"]*)\"$")
    public void pageHeaderIs(String pageHeaderExpected) {
    	String header=signUpPage.getHeaderTitle();
    	assertThat(header.contentEquals(pageHeaderExpected));
    }
    
    @Then("^Header of success register is displayed$")
    public void headerIsDisplayed() {
    	Boolean isDisplayed=signUpPage.headerSuccessRegisterDisplayed();
    	assertThat(isDisplayed==true);
    }
  
}
