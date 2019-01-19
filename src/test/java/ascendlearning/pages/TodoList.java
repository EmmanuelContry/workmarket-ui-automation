package ascendlearning.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("/")
public class TodoList extends PageObject {

    @FindBy(className = "header")
    private WebElementFacade titleText;

    @FindBy(className = "new-todo")
    private WebElementFacade todoField;

    @FindBy(className = "todo-list")
    private WebElementFacade todoList;

    public String getTitleText() {
        return titleText.getText().trim();
    }

    public List<String> getTodoList() {
        List<String> todoListItems = new ArrayList<>();
        if (todosExist()) {
            List<WebElement> todoListElements = todoList.findElements(By.tagName("li"));
            for (WebElement todoListElement : todoListElements) {
                todoListItems.add(todoListElement.getText().trim());
            }
        }
        return todoListItems;
    }

    public void fillTodoField(String todoName) {
        todoField.type(todoName);
    }

    public void submitTodo() {
        todoField.sendKeys(Keys.ENTER);
    }

    private boolean todosExist() {
        return isElementVisible(By.className("todo-list"));
    }
}