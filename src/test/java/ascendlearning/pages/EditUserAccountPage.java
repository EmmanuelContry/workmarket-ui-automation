package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("")
public class EditUserAccountPage extends PageObject {
	@FindBy (id ="change_username")
	private WebElementFacade lnkChangeUserName;

	@FindBy (id ="new_username")
	private WebElementFacade txtNewUserName;

	@FindBy (css ="#username_form #current-password")
	private WebElementFacade txtCurrentPasswordOfNewUserName;

	@FindBy (id ="update_username")
	private WebElementFacade btnSubmitUserName;

	@FindBy (id ="change_email")
	private WebElementFacade lnkChangeEmail;

	@FindBy (id ="new_email")
	private WebElementFacade txtNewEmail;

	@FindBy (css ="#email_form #current-password")
	private WebElementFacade txtCurrentPasswordOfNewEmail;

	@FindBy (id ="update_email")
	private WebElementFacade btnSubmitEmail;
	
	@FindBy (css =".btn.btn-lg.btn-primary.submit-user")
	private WebElementFacade btnUpdate;
	
	@FindBy (css ="h2")
	private WebElementFacade lblHeader;

	@FindBy (id ="first_name")
	private WebElementFacade txtFirstName;

	@FindBy (id ="last_name")
	private WebElementFacade txtLastName;

	@FindBy (id ="user_form_username")
	private WebElementFacade txtUserName;

	@FindBy (id ="email")
	private WebElementFacade txtEmail;

	@FindBy (id ="user_form_password")
	private WebElementFacade txtPassword;

	@FindBy (id ="user_form_password_confirmation")
	private WebElementFacade txtConfPassword;

	@FindBy (id ="password_reset_question")
	private WebElementFacade txtPwdRecoveryQue;

	@FindBy (id ="password_reset")
	private WebElementFacade txtPwdRecoveryAns;

	@FindBy (id ="phone_number")
	private WebElementFacade txtPhoneNumber;

	@FindBy (id ="street_address_billing_street_address1")
	private WebElementFacade txtBilAddStAdd1;

	@FindBy (id ="street_address_billing_street_address2")
	private WebElementFacade txtBilllingStreetAddress2;

	@FindBy (id ="street_address_billing_city")
	private WebElementFacade txtBilAddCity;

	@FindBy (id ="street_address_billing_locality")
	private WebElementFacade txtBillingAddressCounty;

	@FindBy (id ="street_address_billing_province")
	private WebElementFacade txtBilAddState;

	@FindBy (id ="street_address_billing_postal_code")
	private WebElementFacade txtBilAddZip;

	@FindBy (id ="street_address_billing_country_code")
	private WebElementFacade drpBilAddCountry;

	@FindBy (css ="label[for*='shipping_same_as_billing']")
	private WebElementFacade chkBillingSameAsShipping;

	@FindBy (xpath ="//*[@id='street_address_billing_form']/div[9]/label")
	private WebElementFacade chkBillingSameAsShippinga;

	@FindBy (id ="street_address_shipping_street_address1")
	private WebElementFacade txtShipAddStAdd1;

	@FindBy (id ="street_address_shipping_street_address2")
	private WebElementFacade txtShipAddStAdd2;

	@FindBy (id ="street_address_shipping_city")
	private WebElementFacade txtShipAddCity;

	@FindBy (id ="street_address_shipping_locality")
	private WebElementFacade txtShipAddCounty;

	@FindBy (id ="street_address_shipping_province")
	private WebElementFacade txtShipAddState;

	@FindBy (id ="street_address_shipping_postal_code")
	private WebElementFacade txtShipAddZip;

	@FindBy (id ="street_address_shipping_country_code")
	private WebElementFacade drpShipAddCountry;

	@FindBy (css ="a[class*='btn-success']")
	private WebElementFacade btnAcceptTerms;

	@FindBy (xpath ="//button[text()='REGISTER']")
	private WebElementFacade btnRegister;

	@FindBy (xpath ="//a[text()='CANCEL']")
	private WebElementFacade btnCancel;

	@FindBy (className ="tos-container")
	private WebElementFacade termsandconditionscontainer;

	@FindBy (css ="[class*='login-panel']")
	private WebElementFacade lblLoginPane;

	@FindBy (css =("#street_address_billing_province > option"))
	private WebElementFacade drpState;

	@FindBy (css =".alert.alert-danger>ul>li")
	private WebElementFacade lblrequiredfiel;

	@FindBy (css ="#validate_street_address_billing")
	private WebElementFacade btnlookupaddres;

	@FindBy (css ="#street_address_billing_checkbox_label")
	private WebElementFacade chkusesuggestedaddres;
	
	public void fillStreet2Address(String billingStreet2Address) {
		txtBilllingStreetAddress2.type(billingStreet2Address);
	}
	
	public String getStreetAddress2Value() {
		return txtBilllingStreetAddress2.getValue();
	}
	
	public void fillAddressCountry(String billingAddressCountry) {
		txtBillingAddressCounty.type(billingAddressCountry);
	}
	
	public void clickOnCancel() {
		btnCancel.click();
	}
	
	public String getAddressCountryValue() {
		return txtBillingAddressCounty.getValue();
	}
	
	public void clickOnRegister() {
		btnUpdate.click();
	}
}