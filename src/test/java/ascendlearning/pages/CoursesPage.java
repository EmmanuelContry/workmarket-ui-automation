package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("")
public class CoursesPage extends PageObject {
	@FindBy (css ="tbody tr td")
	private WebElementFacade lstCourseNames;

	@FindBy (xpath ="//tr[td[contains(text(),'{1}')]]/td/a")
	private WebElementFacade btnCoursePlay;

	@FindBy (xpath ="//h3/a[contains(.,'History')]")
	private WebElementFacade lnkHistory;

	@FindBy (css ="#orderhistory a")
	private WebElementFacade lnknavHistory;

	@FindBy (xpath ="//*[@id='contentArea']/div")
	private WebElementFacade lblUserSuspendedMsg;

	@FindBy (css =".btn.btn-large.btn-warning")
	private WebElementFacade btnSelectSessionButton;

	@FindBy (css ="#contentArea>h2")
	private WebElementFacade lblselectsession;

	@FindBy (css ="#contentArea>span")
	private WebElementFacade lbldisclaimerms;

	@FindBy (css ="tr>td:nth-child(2)")
	private WebElementFacade tblavilableseatscolum;

	@FindBy (css ="tr>td:nth-child(3)")
	private WebElementFacade tblselectsessioncolum;

	@FindBy (css =".glyphicon.glyphicon-ok")
	private WebElementFacade lblsessioselectedokmar;

	@FindBy (css ="tr:nth-child(2)>td:nth-child(3)")
	private WebElementFacade btnselectsessionrow;

	@FindBy (css ="tr:nth-child(3)>td:nth-child(2)")
	private WebElementFacade lblseatsrow;

	@FindBy (css =".alert.alert-danger")
	private WebElementFacade lblsessionerrormsg;

	@FindBy (css =".text-info td span")
	private WebElementFacade lblselectedsessionname;

	public String getUserSuspendedMessage(){
		String strResult=lblUserSuspendedMsg.getText();
		if(strResult.contains("("))
		{
			strResult=strResult.substring(0, strResult.indexOf("(")).trim();
		}
		return strResult;
	} 
}