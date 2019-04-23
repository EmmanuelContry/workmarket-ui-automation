package workmarket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.workmarket.com/home")
public class HomePage extends PageObject {

	public void clickOnSearchTalentLink() {
		waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#wm-main-nav > div > div:nth-child(1) > div > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div")));
		getJavascriptExecutorFacade().executeScript(
				"document.querySelector('#wm-main-nav > div > div:nth-child(1) > div > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div').click()");
	}
}