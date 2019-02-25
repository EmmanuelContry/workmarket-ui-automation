package ascendlearning.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("")
public class ELearningCenterPage extends PageObject {
	@FindBy(xpath = "//h3/a[contains(.,'Courses')]")
	private WebElementFacade lnkCourses;

	@FindBy(xpath = "//h3/a[contains(.,'History')]")
	private WebElementFacade lnkHistory;

	@FindBy(xpath = "//h3/a[contains(.,'Certificates')]")
	private WebElementFacade lnkCertificates;

	@FindBy(xpath = "//h3/a[contains(.,'Account')]")
	private WebElementFacade lnkAccount;

	@FindBy(xpath = "//h3/a[contains(.,'Enrollment')]")
	private WebElementFacade lnkEnrollmentKey;

	@FindBy(xpath = "//h3/a[contains(.,'Re-Certification')]")
	private WebElementFacade lnkRecertification;

	@FindBy(css = "#course a")
	private WebElementFacade lnknavCourses;

	@FindBy(css = "a[href='/OrderHistory']")
	private WebElementFacade lnknavHistory;

	@FindBy(css = "#certificate a")
	private WebElementFacade lnknavCertificates;

	@FindBy(css = "a[href='/Account/Details']")
	private WebElementFacade lnknavAccount;

	@FindBy(css = "a[href='/EnrollmentKey/Redeem']")
	private WebElementFacade lnknavEnrollmentKey;

	@FindBy(css = "#recertification a")
	private WebElementFacade lnknavReCertification;

	@FindBy(id = "logoffLink")
	private WebElementFacade lnkLogOff;

	@FindBy(xpath = "//ul[2]/li[3]/input")
	private WebElementFacade lnkLogou;

	@FindBy(css = "h2")
	private WebElementFacade lblPageHeader;

	@FindBy(id = "nasmLogo")
	private WebElementFacade imgNASMLog;

	@FindBy(id = "afaaLogo")
	private WebElementFacade imgAFAALog;

	@FindBy(css = "a[href='/']")
	private WebElementFacade lnkUserNam;

	@FindBy(xpath = ".//*[@id='admin_nav']/ul/li[3]/a")
	private WebElementFacade lnkCartLink;

	@FindBy(xpath = "//*[@id='contentArea']/div[1]")
	private WebElementFacade lblUserSuspendedMsg;

	@FindBy(css = "div[id*='admin_nav'] li:nth-child(1) a")
	private WebElementFacade lblWelcomeUserName;

	public Boolean afaaLogoDisplayed() {
		waitFor(imgAFAALog);
		return imgAFAALog.isDisplayed();
	}

	public Boolean nasmLogoDisplayed() {
		return imgNASMLog.isDisplayed();
	}

	public Boolean courseTabDisplayed() {
		return lnkCourses.isDisplayed();
	}
	
	public void clickCourseTab() {
		lnkCourses.click();
	}
	
	public void clickAccountTab() {
		lnkAccount.click();
	}
	
	public void clickEnrollmentKeyTab() {
		lnkEnrollmentKey.click();
	}
	
	public void clickCertificatesTab() {
		lnkCertificates.click();
	}
	
	public void clickHistoryTab() {
		lnkHistory.click();
	}
	
	public void clickHistoryTabLeftSide() {
		lnknavHistory.click();
	}
	
	public void clickCertificatesTabLeftSide() {
		lnknavCertificates.click();
	}
	
	public Boolean accountTabDisplayed() {
		return lnkAccount.isDisplayed();
	}

	public Boolean historyTabDisplayed() {
		return lnknavHistory.isVisible();
	}

	public Boolean enrollmentKeyTabDisplayed() {
		return lnknavEnrollmentKey.isVisible();
	}

	public Boolean certificatesTabDisplayed() {
		return lnknavCertificates.isVisible();
	}

	public Boolean reCertificationTabDisplayed() {
		return lnknavReCertification.isVisible();
	}

	public Boolean logOffTabDisplayed() {
		return lnkLogOff.isVisible();
	}

	public void clickLogOffLink() {
		lnkLogOff.click();
	}
	public Boolean userSuspendedMsgDisplayed() {
		return lblUserSuspendedMsg.isVisible();
	}
}