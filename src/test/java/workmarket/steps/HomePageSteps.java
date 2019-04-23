package workmarket.steps;

import cucumber.api.java.en.Given;
import net.thucydides.core.steps.ScenarioSteps;
import workmarket.pages.HomePage;


public class HomePageSteps extends ScenarioSteps {
	HomePage homePage;
	
    @Given("^I click search talent link$")
    public void iClickSearchTalentLink() {
    	homePage.clickOnSearchTalentLink();
    }
}
