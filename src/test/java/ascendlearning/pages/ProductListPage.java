package ascendlearning.pages;
import net.serenitybdd.core.pages.PageObject;

public class ProductListPage extends PageObject { 
	
    public void selectProduct(String productName) { 
    	getJavascriptExecutorFacade()
    	.executeScript("$('img[title=\""+productName+"\"]').click()");
    }
}
