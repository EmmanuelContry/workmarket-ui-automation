package ascendlearning.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("")
public class HistoryPage extends PageObject {
	@FindBy (xpath ="//h3/a[contains(.,'Certificates')]")
	private WebElementFacade lnkCertificates;

	@FindBy (css ="#certificate a")
	private WebElementFacade lnknavCertificates;

	@FindBy (xpath ="//*[@id='contentArea']/div[2]/div/p")
	private WebElementFacade lblusersuspendedmsghistory;

	@FindBy (id ="tblOrderHistory")
	private WebElementFacade tblHistoryDataTable;

	@FindBy (css =".col-sm-6>h2")
	private WebElementFacade txtOrderHistory;

	@FindBy (xpath =".//*[@id='tblOrderHistory']//a/parent::div/parent::div/parent::td/parent::tr")
	private WebElementFacade txtorderhistorydata;

	@FindBy (xpath =".//*[@id='tblOrderHistory']//a/parent::div/parent::div/parent::td/parent::tr/td")
	private WebElementFacade txthistorydata;

	@FindBy (xpath =".//*[@id='tblOrderHistory']/tbody/tr/td[1]")
	private WebElementFacade txthistorydatalist;

	@FindBy (css =".col-sm-6>h5>a")
	private WebElementFacade lnkprintorderlink;

	@FindBy (css ="tr[class='active'][data-ordernumber='{1}'] td")
	private WebElementFacade txtorderdetail;

	@FindBy (css ="tr[class='active'][data-ordernumber='{1}'] td div div")
	private WebElementFacade txtorderTotalAmn;

	@FindBy (css ="tr:not([class])[data-ordernumber='{1}']")
	private WebElementFacade txtcoursedetailsforOrdernumbe;

	public boolean historyPageDisplayed(){
		return txtOrderHistory.isVisible();
	}
	
	public boolean historyDataDisplayed() {
		return tblHistoryDataTable.isVisible();
	}
}