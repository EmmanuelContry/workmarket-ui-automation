package workmarket.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import workmarket.pages.FindTalentPage;

import static org.assertj.core.api.Assertions.assertThat;

public class FindTalentPageSteps extends ScenarioSteps {
	FindTalentPage findTalentPage;
	
    @Given("^I fill search field with \"([^\"]*)\"$")
    public void fillSearchField(String search) {
    	findTalentPage.setSearchField(search);
    	findTalentPage.clickEnter();
    }
    
    @Then("^All items displayed contain string \"([^\"]*)\"$")
    public void itemsContain(String stringExpected) {
    	Boolean itemsContain=findTalentPage.validateDisplayedResultsContainString(stringExpected);
    	assertThat(itemsContain==true);
    }
    
}
