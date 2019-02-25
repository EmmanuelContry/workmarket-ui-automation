package ascendlearning.steps;

import ascendlearning.pages.HistoryPage;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class HistoryPageSteps extends ScenarioSteps {

	HistoryPage historyPage;

    @Then("^the history page is displayed$")
    public void theHistoryPageDisplayed() {
    	Boolean historyPageDisplayed=historyPage.historyPageDisplayed();
    	assertThat(historyPageDisplayed);
    }
    
    @Then("^the history data is displayed$")
    public void theHistoryDataDisplayed() {
    	Boolean historyDataDisplayed=historyPage.historyDataDisplayed();
    	assertThat(historyDataDisplayed);
    }
}
