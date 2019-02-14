package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://sf-stg-www.nasm.org/")
public class HomePage extends PageObject {
    @FindBy(className = "input[id*='registerBtn']")
    private WebElementFacade registerButton;

    public void clickRegisterButton() {
    	getJavascriptExecutorFacade().executeScript("$('input[id*=\"registerBtn\"]').click()");
    }
    private boolean todosExist() {
        return isElementVisible(By.className("todo-list"));
    }
}