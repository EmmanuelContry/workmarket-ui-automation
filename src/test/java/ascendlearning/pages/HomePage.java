package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://sf-stg-www.nasm.org/")
public class HomePage extends PageObject {
    @FindBy(className = "input[id*='registerBtn']")
    private WebElementFacade registerButton;
    
	@FindBy(css = "input[id*='registerBtn']")
	private WebElementFacade btnRegister;
	
	@FindBy(css = "a[href*='portal.nasm.org']")
	private WebElementFacade linkMyAccount;
	
	@FindBy(css = "input[id*='loginBtn']")
	private WebElementFacade btnLogIn;
	
	@FindBy(css = "span[class*='icon-login'] a")
	private WebElementFacade btnLogin;
	
	@FindBy(css = "li span a span")
	private WebElementFacade lnkCart;
	
	@FindBy(id = "countlabel")
	private WebElementFacade lblCartCount;
	
	@FindBy(css = "[class*='login-panel']")
	private WebElementFacade lblLoginPanel;
	
	@FindBy(css = "[id*='messageLabel']")
	private WebElementFacade spnUserName;
	
	@FindBy(css = "input[id*='logoutBtn']")
	private WebElementFacade btnLogOut;
	
	@FindBy(css = "span[class*='logout'] a")
	private WebElementFacade btnLogout;
	
	@FindBy(xpath = "//a[contains(text(),'Continuing Education')]")
	private WebElementFacade lnkContinueEducation;
	
	@FindBy(xpath = "//a[contains(text(),'All Courses')]")
	private WebElementFacade lnkAllCourses;
	
	@FindBy(xpath = "//a[text()[contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'a career in fitness')]]")
	private WebElementFacade lnkCarrerInFitness;
	
	@FindBy(id = "username")
	private WebElementFacade tbxUserName;
	
	@FindBy(id = "newsFirstName")
	private WebElementFacade tbxNewsFirstName;
	
	@FindBy(id = "newsLastName")
	private WebElementFacade tbxNewsLastName;
	
	@FindBy(id = "newsEmail")
	private WebElementFacade tbxNewsEmail;
	
	@FindBy(id = "newsPhone")
	private WebElementFacade tbxNewsPhone;
	
	@FindBy(id = "new_primaryinterestline")
	private WebElementFacade tbxInterestInfo;
	
	@FindBy(xpath = "//select[@id='new_primaryinterestline']/option[@value='{1}']")
	private WebElementFacade lblInterestInfoValue;
	
	@FindBy(css = "div[class*='trick-box'] div")
	private WebElementFacade divtrixbox;
	
	@FindBy(css = "input[value='{1}']")
	private WebElementFacade chkinterestOptions;
	
	@FindBy(id = "globalSubmit")
	private WebElementFacade btnNewsSubmit;
	
	@FindBy(css = "td div")
	private WebElementFacade txtActOnMessage;
	
	@FindBy(xpath = "(//div[@id='colorbox']//div[@id='cboxClose'])[2]")
	private WebElementFacade btnActOnClose;
	
	@FindBy(css = ".thanks")
	private WebElementFacade lblActonThanks;
	
	@FindBy(css = "div iframe[class='cboxIframe']")
	private WebElementFacade frmActOnMsg;
	
	@FindBy(css = ".chatNow")
	private WebElementFacade lblChatNowPopup;
	
	@FindBy(xpath = "//li/a[text()='{1}']")
	private WebElementFacade NASMHomePageLinks;
	
	@FindBy(xpath = "//li/a[text()='{1}']/parent::li//li/a[text()='{2}']")
	private WebElementFacade NASMHomePageLink;
	
	@FindBy(xpath = "//ul[@id='Main_Navigation_T7B7212FE001_ctl00_ctl00_ctl01_ctl02_childNodesContainer']/li[4]/a")
	private WebElementFacade NASMPerformanceTrainingLiveWorkshop;
	
	@FindBy(css = "a[href='/continuing-education/master-trainer']")
	private WebElementFacade lnkMasterTrainer;
	
	@FindBy(css = "span[id*='messageLabel']")
	private WebElementFacade lblWelcomeUserName;
	
	@FindBy(id = "fnError")
	private WebElementFacade lblActOnFirstnameErrMsg;
	
	@FindBy(id = "lnError")
	private WebElementFacade lblActOnLastnameErrMsg;
	
	@FindBy(id = "eError")
	private WebElementFacade lblActOnEmailErrMsg;
	
	@FindBy(id = "pError")
	private WebElementFacade lblActOnPhoneErrMsg;
	
	@FindBy(id = "tError")
	private WebElementFacade lblActOnInformationErrMsg;
	
	@FindBy(css = "div[class*='chatNow'] span")
	private WebElementFacade btnclosechatnow;
	
	@FindBy(css = "div[class='chatNowOpener']")
	private WebElementFacade btnchatnowbubble;
	
	@FindBy(css = "div.chatNowOpener")
	private WebElementFacade imgChatBubble;
	
	@FindBy(css = "div[class*='cookie-banner']")
	private WebElementFacade lblcookiebanner;
	
	@FindBy(css = "span[class*='display-block']")
	private WebElementFacade txtcookiebanner;
	
	@FindBy(css = "button[class*='btn-warning']")
	private WebElementFacade btnAgreeDismiss;
	
	@FindBy(css = "a[class*='logo-header']")
	private WebElementFacade lnkLogoNASM;
	
	@FindBy(xpath = "//nav[@id='main-nav-toggle']//a[text()='{1}']")
	private WebElementFacade lnkcategory;
	
	@FindBy(css = "li[class='dropdown menu-dropdown']")
	private WebElementFacade mainMenuItems;
	
    public void clickRegisterButton() {
    	getJavascriptExecutorFacade()
    	.executeScript("$('input[id*=\"registerBtn\"]').click()");
    }
    
    public void clickLoginButton() {
    	waitFor(btnLogIn);
    	getJavascriptExecutorFacade()
    	.executeScript("$('input[id*=\"loginBtn\"]').click()");
    }
    
    public void clickMyAccountButton() {
    	waitFor(btnLogIn);
    	linkMyAccount.click();
    }
	
	public void clickContinueEduaction() {
		lnkContinueEducation.click();
	}
	
	public void hoverContinueEducation() {
		withAction().moveToElement(element(lnkContinueEducation));
	}
	
	public void clickAllCourses() {
		lnkAllCourses.click();
	}

	public String getWelcomeMessage() {
		return lblWelcomeUserName.getText();
	}
	
	public Boolean btnLogOutDisplayed() {
		if (btnLogout.isDisplayed() || btnLogOut.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}		
	}
	
}