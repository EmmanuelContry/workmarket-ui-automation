package ascendlearning.steps;

import ascendlearning.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageSteps extends ScenarioSteps {
	LoginPage loginPage;
	
    @Given("^I login typing username \"([^\"]*)\" and password \"([^\"]*)\" and clicking login button$")
    public void iLogin(String userName, String password) {
    	loginPage.fillTbxUserName(userName);
    	loginPage.fillPassword(password);
    	loginPage.clickLoginButton();
    }
    
    @Given("^I click forgot password link$")
    public void clickForgotPasswordLink() {
    	loginPage.clickForgotPasswordLink();
    }
    
    @When("^I type \"([^\"]*)\" in user name field$")
    public void typeUserNameField(String userName) {
    	loginPage.fillTbxUserName(userName);
    }
    
    @When("^I click reset button$")
    public void clickResetButton() {
    	loginPage.clickResetPasswordButton();
    }
    
    @Then("^button security question is not displayed$")
    public void buttonSecurityQuestionNotDisplayed() {
    	Boolean isDisplayed=loginPage.btnSecurityQuestionDisplayed();
    	assertThat(isDisplayed==false);
    }
    
    @Then("^forgot password error message \"([^\"]*)\" will be displayed$")
    public void errorMessageDisplayed(String errorMessage) {
    	String errorMessageDisplayed=loginPage.getForgotPasswordErrorMessage();
    	assertThat(errorMessage.contentEquals(errorMessageDisplayed));
    }

	
	@Then("^the elements of log in page are displayed$")
    public void elementsLogInPageDisplayed() {
		assertThat(loginPage.affaaLogoDisplayed());
		assertThat(loginPage.nasmLogoDisplayed());
		assertThat(loginPage.userNameTextBoxDisplayed());
		assertThat(loginPage.passwordTextBoxDisplayed());
		assertThat(loginPage.createAccountButtonDisplayed());
		assertThat(loginPage.forgotPasswordLinkDisplayed());
		assertThat(loginPage.copyrightInformationDisplayed());
    }
    
}
