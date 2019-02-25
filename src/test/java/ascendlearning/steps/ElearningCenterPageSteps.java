package ascendlearning.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;

import ascendlearning.pages.ELearningCenterPage;

public class ElearningCenterPageSteps extends ScenarioSteps {

	ELearningCenterPage eLearningCenterPage;

    @Then("^all tabs elements in elearning center page are displayed$")
    public void allTabsDisplayed() {
		assertThat(eLearningCenterPage.afaaLogoDisplayed());
		assertThat(eLearningCenterPage.nasmLogoDisplayed());
		assertThat(eLearningCenterPage.courseTabDisplayed());
		assertThat(eLearningCenterPage.accountTabDisplayed());
		assertThat(eLearningCenterPage.historyTabDisplayed());
		assertThat(eLearningCenterPage.enrollmentKeyTabDisplayed());
		assertThat(eLearningCenterPage.certificatesTabDisplayed());
		assertThat(eLearningCenterPage.reCertificationTabDisplayed());
		assertThat(eLearningCenterPage.logOffTabDisplayed());
    }
    
    @Then("^I click log off link$")
    public void iClickLogOffLink() {
    	eLearningCenterPage.clickLogOffLink();
    }
    
    @When("^I click courses tab$")
    public void iClickCoursesTab() {
    	eLearningCenterPage.clickCourseTab();
    }
    
    @When("^I click account tab$")
    public void iClickAccountTab() {
    	eLearningCenterPage.clickAccountTab();
    }
    
    @When("^I click enrollmentkey tab$")
    public void iClickEnrollmentKeyTab() {
    	eLearningCenterPage.clickEnrollmentKeyTab();
    }
    
    @When("^I click certificates tab$")
    public void iClickCertificatesTab() {
    	eLearningCenterPage.clickCertificatesTab();
    }
    
    @When("^I click certificates tab left side$")
    public void iClickCertificatesTabLeftSide() {
    	eLearningCenterPage.clickCertificatesTabLeftSide();
    }
    
    @When("^I click history tab$")
    public void iClickHistoryTab() {
    	eLearningCenterPage.clickHistoryTab();
    }
    
    @When("^I click history tab left side$")
    public void iClickHistoryTabLeftSide() {
    	eLearningCenterPage.clickHistoryTabLeftSide();
    }
    
    @Then("^suspended message is displayed$")
    public void suspendedMsgDisplayed() {
    	Boolean suspendedMsgDisplayed=eLearningCenterPage.userSuspendedMsgDisplayed();
    	assertThat(suspendedMsgDisplayed);
    }
}
