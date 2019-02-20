package ascendlearning.steps;

import ascendlearning.pages.ProductDetailsPage;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductDetailsPageSteps extends ScenarioSteps {
	ProductDetailsPage productDetailsPage;
    
	@When("^I click the add to car button$")
    public void clickAddToCarButton() {
		productDetailsPage.clickAddToCarButton();
    }
}
