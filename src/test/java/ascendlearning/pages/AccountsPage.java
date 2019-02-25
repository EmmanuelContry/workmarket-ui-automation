package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://sf-stg-www.nasm.org/")
public class AccountsPage extends PageObject {
	@FindBy (css =".dl-horizontal dt")
	private WebElementFacade lblAccountLabel;

	@FindBy (css =".btn.btn-large.btn-warning")
	private WebElementFacade btnChange;

	@FindBy (xpath ="//h3/a[contains(.,'Enrollment')]")
	private WebElementFacade lnkEnrollmentKey;

	@FindBy (css ="#enrollmentkey a")
	private WebElementFacade lnknavEnrollmentKey;

	@FindBy (css =".dl-horizontal>dd:nth-child(2)")
	private WebElementFacade lblUsername;

	@FindBy (css =".dl-horizontal>dd:nth-child(4)")
	private WebElementFacade lblFirstName;

	@FindBy (css =".dl-horizontal>dd:nth-child(6)")
	private WebElementFacade lblLastName;

	@FindBy (css =".dl-horizontal>dd:nth-child(8)")
	private WebElementFacade lblEmail;
	
	@FindBy (css =".check-box")
	private WebElementFacade chkSuspendedUser;

	@FindBy (xpath ="//*[@id='contentArea']/div/dl/dd[6]")
	private WebElementFacade lblusersuspendedmsgaccount;
	
	public Boolean isSuspendedCheckBoxIsChecked() {
		return chkSuspendedUser.getAttribute("checked").equals("true");
	}
	
	public void clickOnChangeButton() {
		btnChange.click();
	}
}