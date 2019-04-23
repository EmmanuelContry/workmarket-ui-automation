package workmarket.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.workmarket.com/login")
public class LoginPage extends PageObject {

	@FindBy(id = "login-email")
	private WebElementFacade emailInput;

	@FindBy(id = "login-password")
	private WebElementFacade passwordInput;

	public void setEmailField(String email) {
		emailInput.type(email);
	}

	public void setPasswordField(String password) {
		passwordInput.type(password);
	}

	public void clickOnLoginButton() {
		getJavascriptExecutorFacade().executeScript("document.querySelector('#login_page_button').click()");
	}
}