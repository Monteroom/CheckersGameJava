package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CheckersPage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class Checkers_steps {
    CheckersPage checkersPage = new CheckersPage();
    String checkersURL = "https://www.gamesforthebrain.com/game/checkers/";
    String title = "Checkers - Games for the Brain";

    @Given("I am on Checkers game page")
    public void i_am_on_checkers_game_page() {
        Driver.getDriver().get(Config.getValue("CheckersURL"));
        Assert.assertEquals(checkersURL, Driver.getDriver().getCurrentUrl());
        Assert.assertEquals(title, Driver.getDriver().getTitle());

    }
    @When("I make five legal moves as orange")
    public void i_make_five_legal_moves_as_orange() {
    checkersPage.square62.click();
        ApplicationFlow.pause(2000);
    checkersPage.square73.click();
        ApplicationFlow.pause(2000);
    checkersPage.square51.click();
        ApplicationFlow.pause(2000);
    checkersPage.square62.click();
        ApplicationFlow.pause(2000);
    checkersPage.square22.click();
        ApplicationFlow.pause(2000);
    checkersPage.square13.click();
        ApplicationFlow.pause(2000);

    }
    @When("I include taking a blue piece")
    public void i_include_taking_a_blue_piece() {
    checkersPage.square42.click();
        ApplicationFlow.pause(2000);
    checkersPage.square24.click();
        ApplicationFlow.pause(2000);
    checkersPage.square62.click();
        ApplicationFlow.pause(2000);
    checkersPage.square53.click();
        ApplicationFlow.pause(2000);
    }
    @Then("I should see the {string} confirmation")
    public void i_should_see_the_confirmation(String string) {
        Assert.assertEquals("Make a move.", checkersPage.message.getText());

    }
    @When("I restart the game")
    public void i_restart_the_game() {
        checkersPage.restartBtn.click();

    }
    @Then("the game should restart successfully")
    public void the_game_should_restart_successfully() {
        Assert.assertEquals("Select an orange piece to move.", checkersPage.message.getText());

    }
}
