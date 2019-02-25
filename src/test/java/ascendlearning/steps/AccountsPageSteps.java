package ascendlearning.steps;

import ascendlearning.pages.AccountsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountsPageSteps extends ScenarioSteps {
	AccountsPage accountsPage;
	@Then("^suspended checkbox is selected$")
	public void suspendedCheckBoxSelected() {
		Boolean isSelected=accountsPage.isSuspendedCheckBoxIsChecked();	
		assertThat(isSelected);
	}
	
	@Given("^I click on change button$")
	public void iClickChangeButton() {
		accountsPage.clickOnChangeButton();
	}
	
	@Then("^the change button displayed$")
	public void theChangeButtonDisplayed() {
		Boolean changeButtonDisplayed=accountsPage.isChangeButtonDisplayed();	
		assertThat(changeButtonDisplayed);
	}
	
}
