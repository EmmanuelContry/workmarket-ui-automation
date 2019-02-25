package ascendlearning.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/")
public class CertificatesPage extends PageObject {
	@FindBy (css =".textLayer div:nth-child(5)")
	private WebElementFacade lblCourseName;

	@FindBy (css ="tbody tr:nth-child({1}) td a")
	private WebElementFacade btnViewCertificate;

	@FindBy (css ="tr td:nth-child(1)")
	private WebElementFacade lblCertificateName;

	@FindBy (xpath ="//h3/a[contains(.,'Account')]")
	private WebElementFacade lnkAccount;

	@FindBy (css ="#account a")
	private WebElementFacade lnknavAccount;
	
	public String getPageTitle() {
		return getTitle();
	}
	
	public boolean isCertificateDisplayed(String strCertificateName){
		Boolean flag=false;
			List<WebElementFacade> lstCourse=findAll("tr td:nth-child(1)");
			for(WebElement course:lstCourse){
				if(strCertificateName.equalsIgnoreCase(course.getText())){
					flag=true;
					break;
				}
			}
		return flag;
	}
} 