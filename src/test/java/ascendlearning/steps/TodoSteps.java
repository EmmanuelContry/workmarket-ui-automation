package ascendlearning.steps;

import ascendlearning.pages.TodoList;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoSteps {

    TodoList todoList = new TodoList();

    @Given("^I am on the todo list$")
    public void iAmOnTheTodoList() {
        todoList.open();
        assertThat(todoList.getTitleText()).isEqualTo("todos");
    }

    @When("^I add a todo called \"(.*?)\"$")
    public void iAddATodoCalled(String todoName) {
        todoList.fillTodoField(todoName);
        todoList.submitTodo();
    }

    @Then("^I see a todo called \"(.*?)\"$")
    public void iSeeATodoCalled(String todoName) {
        assertThat(todoList.getTodoList()).contains(todoName);
    }
}
