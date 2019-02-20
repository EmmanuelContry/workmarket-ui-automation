package ascendlearning.steps;

import ascendlearning.pages.ProductListPage;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class ProductListPageSteps extends ScenarioSteps {
	ProductListPage productListPage;
    @When("^I click the product \"([^\"]*)\"$")
    public void clickProduct(String product) {
    	productListPage.selectProduct(product);
    }
}
