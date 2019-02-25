package ascendlearning.steps;

import ascendlearning.pages.CheckOutPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckOutPageSteps extends ScenarioSteps {
	CheckOutPage checkOutPage;
	@When("^I click edit address button$")
	public void clickEditAddressButton() {
		checkOutPage.clickEditAddress();		
	}
	
	@When("^I uncheck shipping add same as shipping address checkbox$")
	public void iUncheckShippingAddSameAsShippingAddresCheckbox() {
		checkOutPage.uncheckShippingAddSameAsShippindAddress();		
	}
	
	@When("^I click address continue button$")
	public void iClickBillingAddressContinueButton() {
		checkOutPage.clickAddressContinueButton();	
	}
	
	@When("^fill with \"([^\"]*)\" billing first name field$")
	public void fillWithBillingFirstNameField(String billingFirstName) {
		checkOutPage.fillFirstNameField(billingFirstName);	
	}
	
	@When("^fill with \"([^\"]*)\" billing last name field$")
	public void fillWithBillingLastNameField(String billingLastName) {
		checkOutPage.fillLastNameField(billingLastName);
	}
	
	@When("^fill with \"([^\"]*)\" billing email field$")
	public void fillWithBillingEmailField(String billingEmail) {
		checkOutPage.fillEmailField(billingEmail);
	}
	
	@When("^fill with \"([^\"]*)\" billing address field$")
	public void fillWithBillingAddressField(String billingAddress) {
		checkOutPage.fillBillingAddressField(billingAddress);
	}
	
	@When("^fill with \"([^\"]*)\" billing city address field$")
	public void fillWithBillingCityAddressField(String billingCity) {
		checkOutPage.fillBillingCityField(billingCity);
	}
	
	@When("^fill with \"([^\"]*)\" zip code field$")
	public void fillWithBillingZipCodeField(String billingZipCode) {
		checkOutPage.fillBillingZipCodeField(billingZipCode);
	}
	
	@Then("^the required of billing first name message is \"([^\"]*)\"$")
	public void theRequiredBillingFirstNameMsgIs(String requiredBillingFirstNameMsgExpected) {
		String requiredBillingFirstNameMsg=checkOutPage.getFirstNameRequiredMsg();
		assertThat(requiredBillingFirstNameMsgExpected.equals(requiredBillingFirstNameMsg));	
	}
	
	@Then("^the required of billing last name message is \"([^\"]*)\"$")
	public void theRequiredBillingLastNameMsgIs(String requiredBillingLastNameMsgExpected) {
		String requiredBillingLastNameMsg=checkOutPage.getLastNameRequiredMsg();
		assertThat(requiredBillingLastNameMsgExpected.equals(requiredBillingLastNameMsg));	
	}
	
	@Then("^the required of billing email message is \"([^\"]*)\"$")
	public void theRequiredBillingEmailMsgIs(String requiredBillingEmailMsgExpected) {
		String requiredBillingEmailMsg=checkOutPage.getEmailRequiredMsg();
		assertThat(requiredBillingEmailMsgExpected.equals(requiredBillingEmailMsg));	
	}
	
	@Then("^the required of billing address message is \"([^\"]*)\"$")
	public void theRequiredBillingAddressMsgIs(String requiredBillingLastNameMsgExpected) {
		String requiredBillingAddressMsg=checkOutPage.getAddressRequiredMsg();
		assertThat(requiredBillingLastNameMsgExpected.equals(requiredBillingAddressMsg));	
	}
	
	@Then("^the required of billing city address message is \"([^\"]*)\"$")
	public void theRequiredBillingCityAddressMsgIs(String requiredBillingCityAddressMsgExpected) {
		String requiredBillingCityAddressMsg=checkOutPage.getCityRequiredMsg();
		assertThat(requiredBillingCityAddressMsgExpected.equals(requiredBillingCityAddressMsg));	
	}
	
	@Then("^the required of billing zip code message is \"([^\"]*)\"$")
	public void theRequiredBillingZipCodeMsgIs(String requiredBillingZipCodeMsgExpected) {
		String requiredBillingZipCodeMsg=checkOutPage.getZipRequiredMsg();
		assertThat(requiredBillingZipCodeMsgExpected.equals(requiredBillingZipCodeMsg));	
	}
	
	@Then("^the address error message is \"([^\"]*)\"$")
	public void theAddressErrorMessageIs(String addressErrorMessageExpected) {
		String addressErrorMessage=checkOutPage.getAddressErrorMessage();
		assertThat(addressErrorMessageExpected.equals(addressErrorMessage));	
	}
	
	@Then("^check out page is displayed$")
	public void checkOutPageDisplayed() {
		Boolean pageDisplayed=checkOutPage.checkOutPageDisplayed();
		assertThat(pageDisplayed);	
	}
	
	@Then("^shipping options is displayed$")
	public void shippingOptionsDisplayed() {
		Boolean shippingOptionsDisplayed=checkOutPage.shippingOptionsDisplayed();
		assertThat(shippingOptionsDisplayed);	
	}
}
