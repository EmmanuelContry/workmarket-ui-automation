package ascendlearning.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;

public class LoginPage extends PageObject {
	@FindBy (id ="username")
	private WebElementFacade tbxUserName;
	
	@FindBy (id ="password")
	private WebElementFacade tbxPassword;
	
	@FindBy (id ="login-submit")
	private WebElementFacade btnLogIn;
	
	@FindBy (css =".text-right a")
	private WebElementFacade lnkForgotPassword;
	
	@FindBy (css ="div a[href*='register']")
	private WebElementFacade lnkCreateNewAccount;
	
	@FindBy (className ="logo-img-nasm")
	private WebElementFacade imgNASMLogo;
	
	@FindBy (className ="logo-img-afaa")
	private WebElementFacade imgAFAALogo;
	
	@FindBy (css ="div[class='alert alert-danger']")
	private WebElementFacade tbxLoginerrormessage;
	
	@FindBy (id ="reset_password_question")
	private WebElementFacade btnSecurityQuestion;
	
	@FindBy (id ="reset_password_submit")
	private WebElementFacade btnResetPassword;
	
	@FindBy (id ="reset_password_email")
	private WebElementFacade btnResetByEmailButton;
	
	@FindBy (css =".alert.alert-danger>i")
	private WebElementFacade lblForgotPasswordWrongUN;
	
	@FindBy (css =".footer-copyright.list-inline.list-unstyled>li")
	private WebElementFacade lblCopyrightInfo;
	
	@FindBy (css =".panel-body>p")
	private WebElementFacade lblEmailSentConfirmationMessage;
	
	@FindBy (className ="button.transparent")
	private WebElementFacade lnkLogin;
	
	@FindBy (id ="user_email")
	private WebElementFacade lnkEmailID;
	
	@FindBy (id ="user_password")
	private WebElementFacade lnkPassword;
	
	@FindBy (css ="input[value='Log in']")
	private WebElementFacade btnLoginIn;
	
	@FindBy (css =".navigation>li:nth-child(1)>a")
	private WebElementFacade lnkshareInboxes;
	
	@FindBy (className ="inbox_name.inbox-name")
	private WebElementFacade lnkNASMFolder;
	
	public Boolean affaaLogoDisplayed() {
		return imgAFAALogo.isDisplayed();
	}
	
	public Boolean nasmLogoDisplayed() {
		return imgNASMLogo.isDisplayed();
	}
	
	public Boolean userNameTextBoxDisplayed() {
		return tbxUserName.isDisplayed();
	}
	
	public Boolean passwordTextBoxDisplayed() {
		return tbxPassword.isDisplayed();
	}
	
	public Boolean createAccountButtonDisplayed() {
		return lnkCreateNewAccount.isDisplayed();
	}
	
	public Boolean forgotPasswordLinkDisplayed() {
		return lnkForgotPassword.isDisplayed();
	}
	
	public Boolean copyrightInformationDisplayed() {
		return lblCopyrightInfo.isDisplayed();
	}
	
	public void fillTbxUserName(String username) {
		tbxUserName.type(username);		
	}
	public void fillPassword(String password) {
		tbxPassword.type(password);
	}
	public void clickLoginButton() {
		btnLogIn.click();
	}
	
	public void clickForgotPasswordLink() {
		lnkForgotPassword.click();
	}
	
	public void clickResetPasswordButton() {
		btnResetPassword.click();
	}
	
	public Boolean btnSecurityQuestionDisplayed() {
		int numberOfElements=findAll(By.id("reset_password_question")).size();
		if(numberOfElements>0) {
			return true;
		}
		else {
			return false;	 
		}
	}
	
	public String getForgotPasswordErrorMessage() {
		return tbxLoginerrormessage.getText();
	}
}
