package workmarket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.workmarket.com/register/campaign/10081C503B209A0C8E7F05FDCC1AA98D4C904DEEF5F73265CAE38C744E7EAD3E")
public class FindTalentPage extends PageObject {
	@FindBy(id = "input-text")
	private WebElementFacade searchField;

	public void setSearchField(String search) {
		searchField.type(search);
	}
	
	public void clickEnter() {
		searchField.sendKeys(Keys.ENTER);
	}

	public long getAlertMessageLastName() {
		return (long) getJavascriptExecutorFacade().executeScript(
				"return document.querySelectorAll('#search_results > div > div.profile-card--details').length");
	}

	public boolean validateDisplayedResultsContainString(String text) {
		waitABit(1000);
		waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#search_results > div:nth-child(1) > div.profile-card--details")));
		long numberOfItems=getAlertMessageLastName();
		//int itemsNumber=Integer.parseInt(numberOfItems); 
		for (int i = 1; i <= numberOfItems; i++) {
			String stringFromField = (String) getJavascriptExecutorFacade()
					.executeScript("return document.querySelector('#search_results > div:nth-child(" + i
							+ ") > div.profile-card--details').innerText");
			if (stringFromField.toLowerCase().indexOf(text.toLowerCase()) == -1) {
				return false;
			}
		}
		return true;
	}
}