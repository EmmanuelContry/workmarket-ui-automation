package ascendlearning.pages;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsPage extends PageObject { 
	
	@FindBy (css ="a[id*='addToCartLink']")
	private WebElementFacade btnAddToCar;
	
	@FindBy (css ="span[class*='sfRegPrice']")
	private WebElementFacade txtproductPrice;
	
	@FindBy (css ="h3[class*='heading-font']")
	private WebElementFacade txtproductName;
	
	public void clickAddToCarButton() {
		waitFor(btnAddToCar);
		btnAddToCar.click();
	}
}
