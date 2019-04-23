package workmarket.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import workmarket.pages.LoginPage;

public class LoginPageSteps extends ScenarioSteps {
	LoginPage loginPage;

	@Given("^I navigate to Login page$")
	public void iNavigateToLoginPage() {
		loginPage.openAt("https://dev.workmarket.com/login");
	}

	@When("^I fill \"([^\"]*)\" in email field$")
	public void fillEmailField(String email) {
		loginPage.setEmailField(email);
	}

	@When("^I fill \"([^\"]*)\" in password field$")
	public void fillPasswordField(String password) {
		loginPage.setPasswordField(password);
	}

	@Given("^I click login button$")
	public void clickLoginButton() {
		loginPage.clickOnLoginButton();
		;
	}
}
