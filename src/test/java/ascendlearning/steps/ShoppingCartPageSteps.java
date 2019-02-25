package ascendlearning.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;

import ascendlearning.pages.ShoppingCartPage;;

public class ShoppingCartPageSteps extends ScenarioSteps {

	ShoppingCartPage shoppingCartPage;
	
	@When("^click checkout button$")
	public void clickCheckoutButton() {
		shoppingCartPage.clickCheckOutButton();
	}

	@Then("^product \"([^\"]*)\" is present in cart$")
	public void productIsPresentInCart(String product) {
		Boolean productIsPresent=shoppingCartPage.isProductPresentInCart(product);
		assertThat(productIsPresent);
	}

	@Then("^the shopping cart page is displayed$")
	public void theShoppingCartDisplayed() {
		Boolean theShoppingCartIsDisplayed=shoppingCartPage.shoppingCartPageDisplayed();
		assertThat(theShoppingCartIsDisplayed);
	}
}
