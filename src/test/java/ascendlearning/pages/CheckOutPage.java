package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/")
public class CheckOutPage extends PageObject {
	
	@FindBy(id = "checkout")
	private WebElementFacade frmCheckoutPage;

	@FindBy(id = "firstName")
	private WebElementFacade tbxFirstName;

	@FindBy(id = "lastName")
	private WebElementFacade tbxLastName;

	@FindBy(id = "email")
	private WebElementFacade tbxEmail;

	@FindBy(id = "phoneNumber")
	private WebElementFacade tbxPhoneNumber;

	@FindBy(css = "form[name='personalForm']>fieldset:nth-child(2)>h4")
	private WebElementFacade headingBillingInfoSection;

	@FindBy(id = "billingAddressLine1")
	private WebElementFacade tbxBillAddAddress;

	@FindBy(id = "billingAddressLine2")
	private WebElementFacade tbxBillAddAddress2;

	@FindBy(id = "billingCity")
	private WebElementFacade tbxBillAddCity;

	@FindBy(id = "billingZip")
	private WebElementFacade tbxBillAddZip;

	@FindBy(id = "billingCountry")
	private WebElementFacade drpdnBillAddCountr;

	@FindBy(id = "billingState")
	private WebElementFacade drpdnBillAddStat;

	@FindBy(css = "[name='personalForm'] div>fieldset>h4")
	private WebElementFacade headingShippingInfoSection;

	@FindBy(id = "shippingAddressLine1")
	private WebElementFacade tbxShipAddAddress;

	@FindBy(id = "shippingAddressLine2")
	private WebElementFacade tbxShipAddAddress2;

	@FindBy(id = "shippingCity")
	private WebElementFacade tbxShipAddCit;

	@FindBy(id = "shippingZip")
	private WebElementFacade tbxShipAddZi;

	@FindBy(id = "shippingCountry")
	private WebElementFacade drpdnShipAddCountr;

	@FindBy(id = "shippingState")
	private WebElementFacade drpdnShipAddStat;

	@FindBy(css = "label[for*='useBillingAddressAsShippingAddress']")
	private WebElementFacade chkShippingAd;

	@FindBy(xpath = "//div[@id='checkout']/div[3]/div[2]/form/input")
	private WebElementFacade btnAddressContinue;

	@FindBy(css = "ul[class*='list-group']")
	private WebElementFacade frmShippingOptionsForm;

	@FindBy(css = "ul[class*='list-group'] li label span")
	private WebElementFacade lstShippingOptionsLabel;

	@FindBy(css = "[id*='shippingMethodsList'] li:nth-child({1}) input")
	private WebElementFacade radShippingOptionsRadioButto;

	@FindBy(className = "sfError")
	private WebElementFacade radShippingOptionstxtErro;

	@FindBy(xpath = "//div[@id='checkout']/div[3]/div[3]/div[1]/input")
	private WebElementFacade btnShippingOptionsNex;

	@FindBy(id = "cardHolderName")
	private WebElementFacade tbxPaymentOptionsCardHolderNam;

	@FindBy(id = "credit-card-number")
	private WebElementFacade tbxPaymentOptionsCardNumbe;

	@FindBy(id = "card-number")
	private WebElementFacade tbxPaymentOptionscrdNumber;

	@FindBy(id = "cvv")
	private WebElementFacade tbxPaymentOptionsCv;

	@FindBy(id = "expiration-month")
	private WebElementFacade tbxPaymentOptionsExpirationMont;

	@FindBy(id = "expiration-year")
	private WebElementFacade tbxPaymentOptionsExpirationYea;

	@FindBy(css = "input[id*='placeOrderButton']")
	private WebElementFacade btnPaymentOptionsPlaceThisOrde;

	@FindBy(css = "terms_and_conditions")
	private WebElementFacade chkTermsAndCondition;

	@FindBy(css = "#braintree-hosted-field-expirationMonth")
	private WebElementFacade tbxPaymentOptionsframeExpirationMont;

	@FindBy(css = "#braintree-hosted-field-expirationYear")
	private WebElementFacade tbxPaymentOptionsframeExpirationYea;

	@FindBy(css = "#card-number iframe")
	private WebElementFacade tbxPaymentOptionsframeCv;

	@FindBy(css = "#card-number iframe")
	private WebElementFacade tbxPaymentOptionsframeCardNumbe;

	@FindBy(css = "#paymentOptions label[for='checkboxPaypalOption']")
	private WebElementFacade radPayPalOptionsRadioButton;

	@FindBy(css = "div[role='button']")
	private WebElementFacade btnPayPalOption;

	@FindBy(id = "return_url")
	private WebElementFacade btnSandboxPurchas;

	@FindBy(css = "button[ng-click*='editUserInfo()'")
	private WebElementFacade lnkEditAddress;

	@FindBy(css = "div[class*='form-checkbox'] label[for*='useBillingAddressAsShippingAddress']")
	private WebElementFacade chkBoxBillingAddSameAsShippingAdd;

	@FindBy(css = "div[class*='form-checkbox'] input[id*='useBillingAddressAsShippingAddress']")
	private WebElementFacade chkBoxBillingAdrSameAsShippingAdr;

	@FindBy(css = "a[class*='afaa']")
	private WebElementFacade spnAfaaLogo;

	@FindBy(css = "a[class*='nasm']")
	private WebElementFacade spnNasmLogo;

	@FindBy(css = "div[id*='Content'] label")
	private WebElementFacade lblcanNotCheckOutMs;

	@FindBy(xpath = "//div[contains(@id,'MainContent_C001_Col00')]/h3")
	private WebElementFacade lblcanNotProcessYourOrderMs;

	@FindBy(xpath = "//div[contains(@id,'MainContent_C001_Col00')]/p")
	private WebElementFacade lblcanNotProcessYourOrderDescMs;

	@FindBy(id = "creditcard_paymentOptionsForm")
	private WebElementFacade frmPaymentOptionsForm;

	@FindBy(xpath = "//div[@id='checkoutNav']//td[contains(text(),'Tax')]/parent::tr/td[2]")
	private WebElementFacade lblTaxAmount;

	@FindBy(css = "select[id*='billingState']")
	private WebElementFacade drpdnBillingStat;

	@FindBy(css = "select[id*='shippingState']")
	private WebElementFacade drpdnShippingStat;

	@FindBy(xpath = "//div[@id='checkoutNav']//td[contains(text(),'Discount')]/parent::tr/td[2]")
	private WebElementFacade lblChkoutdiscount;

	@FindBy(xpath = ".//*[@id='checkout']/div[3]/div[2]/form/fieldset[2]/div[1]/h4")
	private WebElementFacade lblAddressErrorMessage;

	@FindBy(xpath = "//div[@id='checkoutNav']//td[contains(text(),'Subtotal')]/parent::tr/td[2]")
	private WebElementFacade lblChkoutSubTotal;

	@FindBy(xpath = "//div[@id='checkoutNav']//td[contains(text(),'Total')]/parent::tr/td[2]")
	private WebElementFacade lblChkoutOrderTotal;

	@FindBy(xpath = "//div[@id='checkoutNav']//td[contains(text(),'Tax')]/parent::tr/td[2]")
	private WebElementFacade lblChkouttax;

	@FindBy(xpath = "//div[@id='checkoutNav']//td[contains(text(),'Shipping')]/parent::tr/td[2]")
	private WebElementFacade lblshippingdiscount;

	@FindBy(css = "#paymentForm div fieldset:nth-child(2) label")
	private WebElementFacade radPaymentPlanOptions;

	@FindBy(css = ".text-size-1-8.text-weight-500.p-y-10")
	private WebElementFacade lblPaymentPlanInfo;

	@FindBy(css = ".form-checkbox span p:nth-child(2)")
	private WebElementFacade lblMonthlyPaymentPlanInfo;

	@FindBy(css = "#preloaderSpinner>div>.loader")
	private WebElementFacade imgPreLoader;

	@FindBy(css = "#email")
	private WebElementFacade tbxPaypalEmailID;

	@FindBy(css = "#btnNext")
	private WebElementFacade btnnextPaypal;

	@FindBy(id = "password")
	private WebElementFacade tbxPaypalPassword;

	@FindBy(id = "btnLogin")
	private WebElementFacade btnPaypalLoginButton;

	@FindBy(id = "confirmButtonTop")
	private WebElementFacade btnPaypalContinue;

	@FindBy(css = ".xcomponent-component-frame.xcomponent-visible")
	private WebElementFacade iframepaypalbt;

	@FindBy(xpath = "//div[@id='checkout']//form[@name='personalForm']")
	private WebElementFacade frmPersonalInformation;

	@FindBy(xpath = "//label[@for='singlePaymentChk']")
	private WebElementFacade lblOneTimePayment;

	@FindBy(xpath = "//div[@class='help-block'][contains(text(),'First name is required.')]")
	private WebElementFacade lblFirstNameRequire;

	@FindBy(xpath = "//div[@class='help-block'][contains(text(),'Last name is required.')]")
	private WebElementFacade lblLastNameRequired;

	@FindBy(xpath = "//div[@class='help-block'][contains(text(),'Email is required.')]")
	private WebElementFacade lblEmailRequire;

	@FindBy(xpath = "//div[@class='help-block'][contains(text(),'Billing Address is required')]")
	private WebElementFacade lblBillingAddress1Require;

	@FindBy(xpath = "//div[@class='help-block'][contains(text(),'City is required')]")
	private WebElementFacade lblBillingCityRequire;

	@FindBy(xpath = "//div[@class='help-block'][contains(text(),'Zip is required')]")
	private WebElementFacade lblBillingZipRequire;

	@FindBy(xpath = "//div[@class='help-block'][contains(text(),'Shipping Address is required')]")
	private WebElementFacade lblshippingaddress1require;

	@FindBy(css = "div[id='creditcard_paymentOptionsForm'] p")
	private WebElementFacade lblCardHolderNameReqErrMsg;

	@FindBy(xpath = "//*[@ng-bind='i.xRefId']")
	private WebElementFacade txtdiscountinfo;

	@FindBy(xpath = "//*[@id='checkout']/div[3]/div[2]/form/fieldset[2]/div[10]")
	private WebElementFacade txtzipcodeerrmsg;

	@FindBy(css = "tr[ng-show*='installmentPay'] td")
	private WebElementFacade lblpayTodayorderDetail;

	@FindBy(css = "tr[ng-show*='installmentPay']")
	private WebElementFacade bgpayTodayorderDetail;

	@FindBy(css = "tr[ng-show*='installmentPay'] td+td")
	private WebElementFacade lblPayTodayamntorderDetail;

	@FindBy(css = "div[id='loginSection'] div:nth-child(2) a")
	private WebElementFacade btnPaypalloginButton;
    
	public void uncheckShippingAddSameAsShippindAddress() {
		waitFor(chkBoxBillingAddSameAsShippingAdd);
		if(chkBoxBillingAddSameAsShippingAdd.isSelected()) {
			chkBoxBillingAddSameAsShippingAdd.click();
		}
	}
	
	public Boolean checkOutPageDisplayed() {
		return frmCheckoutPage.isVisible();	
	}
	
	public Boolean shippingOptionsDisplayed() {
		return frmShippingOptionsForm.isVisible();	
	}
	
	public void fillFirstNameField(String firstName) {
		tbxFirstName.type(firstName);
	}
	
	public String getFirstNameRequiredMsg() {
		return lblFirstNameRequire.getText();
	}
	
	public void fillLastNameField(String lastName) {
		tbxLastName.type(lastName);
	}
	
	public String getLastNameRequiredMsg() {
		return lblLastNameRequired.getText();
	}
	
	public void fillEmailField(String email) {
		tbxEmail.type(email);
	}
	
	public String getEmailRequiredMsg() {
		return lblEmailRequire.getText();
	}
	
	public void fillBillingAddressField(String billingAddress) {
		tbxBillAddAddress.type(billingAddress);
	}
	
	public String getAddressRequiredMsg() {
		return lblBillingAddress1Require.getText();
	}
	
	public void fillBillingCityField(String billingCity) {
		tbxBillAddCity.type(billingCity);
	}
	
	public String getCityRequiredMsg() {
		return lblBillingCityRequire.getText();
	}
	
	public void fillBillingZipCodeField(String zipCode) {
		tbxBillAddZip.type(zipCode);
	}
	
	public String getZipRequiredMsg() {
		return lblBillingZipRequire.getText();
	}
	
	public void clickEditAddress() {
		lnkEditAddress.click();
	}
	
	public void clickAddressContinueButton() {
		btnAddressContinue.click();
	}
	
	public String getAddressErrorMessage() {
		String addressErrorMessage=lblAddressErrorMessage.getText();
		return addressErrorMessage;
	}
} 