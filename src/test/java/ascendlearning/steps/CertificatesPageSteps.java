package ascendlearning.steps;

import ascendlearning.pages.CertificatesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class CertificatesPageSteps extends ScenarioSteps {
	CertificatesPage certificatesPage;
	@Then("^the page title is \"([^\"]*)\"$")
	public void thePageTitleIs(String pageTitleExpected) {
		String pageTitleDisplayed=certificatesPage.getPageTitle();	
		assertThat(pageTitleDisplayed.equals(pageTitleExpected));
	}
	
	@Then("^the certificate \"([^\"]*)\" is displayed$")
	public void theCertificateIsDisplayed(String certificateExpected) {
		Boolean certificateDisplayed=certificatesPage.isCertificateDisplayed(certificateExpected);	
		assertThat(certificateDisplayed);
	}
}
