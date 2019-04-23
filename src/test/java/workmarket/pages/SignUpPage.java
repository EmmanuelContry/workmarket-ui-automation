package workmarket.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.workmarket.com/register/campaign/10081C503B209A0C8E7F05FDCC1AA98D4C904DEEF5F73265CAE38C744E7EAD3E")
public class SignUpPage extends PageObject {
	@FindBy(css = "#landing-page-bucket > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button > div > div > span")
	private WebElementFacade btnJoinAsCompany;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div > button > div > div > span")
	private WebElementFacade btnJoinAsIndividual;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(1) > h3")
	private WebElementFacade lblLoginTitle;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > label > span > span:nth-child(1)")
	private WebElementFacade firstNameInputValue;

	@FindBy(id = "firstname")
	private WebElementFacade firstNameInput;

	@FindBy(id = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(4)")
	private WebElementFacade alertMessageFirstName;

	@FindBy(id = "lastname")
	private WebElementFacade lastNameInput;

	@FindBy(id = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(4)")
	private WebElementFacade alertMessageLastName;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > label > span > span:nth-child(1)")
	private WebElementFacade lastNameInputValue;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(3) > label > span > span:nth-child(1)")
	private WebElementFacade emailInputValue;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(4) > label > span > span:nth-child(1)")
	private WebElementFacade passwordInputValue;

	@FindBy(id = "email")
	private WebElementFacade emailInput;

	@FindBy(id = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(3) > div:nth-child(4)")
	private WebElementFacade alertMessageEmail;

	@FindBy(id = "password")
	private WebElementFacade passwordInput;

	@FindBy(id = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(4) > div:nth-child(5)")
	private WebElementFacade alertMessagePassword;

	@FindBy(id = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(5) > div > input[type=\"checkbox\"]")
	private WebElementFacade consentCheckbox;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > footer > div > button")
	private WebElementFacade btnRegister;

	@FindBy(css = "#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > footer > div > button > div > span")
	private WebElementFacade btnRegisterValue;

	@FindBy(css = "#campaign_landing > div.row_sidebar_right > div.content > h3")
	private WebElementFacade headerSuccessPage;

	public void clickOnJoinAsIndividualButton() {
		btnJoinAsIndividual.click();
	}

	public boolean registerButtonIsEnabled() {
		return btnRegister.isEnabled();
	}

	public void clickOnRegisterButton() {
		getJavascriptExecutorFacade().executeScript(
				"document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > footer > div > button > div > div > span').click()");
	}

	public String getAlertMessageFirstName() {
		return (String) getJavascriptExecutorFacade().executeScript(
				"return document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(4)').innerText");
	}

	public String getAlertMessageLastName() {
		return (String) getJavascriptExecutorFacade().executeScript(
				"return document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(4)').innerText");
	}

	public String getAlertMessageEmail() {
		return (String) getJavascriptExecutorFacade().executeScript(
				"return document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(3) > div:nth-child(4)').innerText");
	}

	public String getAlertMessagePassword() {
		return (String) getJavascriptExecutorFacade().executeScript(
				"return document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(4) > div:nth-child(5)').innerText");
	}

	public String getPasswordConditionMessage() {
		return (String) getJavascriptExecutorFacade().executeScript(
				"return document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(4) > div:nth-child(2)').innerText");

	}

	public String getRegisterButtonValue() {
		return btnRegisterValue.getText();
	}

	public String getHeaderTitle() {
		return lblLoginTitle.getText();
	}

	public String getFirstNameValue() {
		return firstNameInputValue.getText();
	}

	public String getLastNameValue() {
		return lastNameInputValue.getText();
	}

	public String getEmailValue() {
		return emailInputValue.getText();
	}

	public boolean headerSuccessRegisterDisplayed() {
		waitFor(headerSuccessPage);
		if (findAll(By.cssSelector("#campaign_landing > div.row_sidebar_right > div.content > h3")).size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public String getPasswordValue() {
		return passwordInputValue.getText();
	}

	public void setFirstNameField(String firstName) {
		firstNameInput.type(firstName);
	}

	public void setLastNameField(String lastName) {
		lastNameInput.type(lastName);
	}

	public boolean consentIsChecked() {
		return consentCheckbox.isSelected();
	}

	public String consentCheckboxIsChecked() {
		return consentCheckbox.getAttribute("checked");
	}

	public void checkConsent() {
		if (findAll(By.cssSelector(
				"#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(5) > div > input[type=\"checkbox\"]"))
						.size() > 0) {
			getJavascriptExecutorFacade().executeScript(
					"document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(5) > div > input[type=\"checkbox\"]').click()");
		}
	}

	public void uncheckConsent() {
		if (findAll(By.cssSelector(
				"#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(5) > div > input[type=\"checkbox\"]:checked"))
						.size() > 0) {
			getJavascriptExecutorFacade().executeScript(
					"document.querySelector('#landing-page-bucket > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(5) > div > input[type=\"checkbox\"]').click()");
		}
	}

	public void setEmailField(String email) {
		emailInput.type(email);
	}

	public void setPasswordField(String password) {
		passwordInput.type(password);
	}
}