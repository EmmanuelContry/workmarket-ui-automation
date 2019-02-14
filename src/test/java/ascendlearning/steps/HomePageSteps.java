package ascendlearning.steps;

import ascendlearning.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageSteps extends ScenarioSteps {

	HomePage homePage;

    @Given("^I click register button$")
    public void iAmOnTheTodoList() {
    	homePage.open();
    	homePage.clickRegisterButton();
    }

}
