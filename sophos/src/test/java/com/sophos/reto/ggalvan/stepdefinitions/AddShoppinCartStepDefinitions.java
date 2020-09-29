package com.sophos.reto.ggalvan.stepdefinitions;

import com.sophos.reto.ggalvan.models.Product;
import com.sophos.reto.ggalvan.questions.TheProduct;
import com.sophos.reto.ggalvan.tasks.FillInformation;
import com.sophos.reto.ggalvan.tasks.GoToCart;
import com.sophos.reto.ggalvan.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AddShoppinCartStepDefinitions {
    @Managed
    WebDriver hisdriver;

    @Before
    public void config() {
        setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(hisdriver)));
    }

    @Given("^(.*) as user is in home page$")
    public void asUserIsInHomePage(String username) {
        theActorCalled(username).wasAbleTo(Open.url("https://www.wong.pe/especiales/cyberwong"));
    }

    @When("^search product and add the product to shopping cart$")
    public void searchProductAndAddTheProductToShoppingCart(List<Product> product) {
        theActorInTheSpotlight().attemptsTo(Search.andAddThe(product),
                FillInformation.ofClient(),
                GoToCart.shopping());
    }

    @Then("^should see the product$")
    public void shouldSeeTheProduct() {
        theActorInTheSpotlight().should(seeThat(TheProduct.isAddInCart()));
    }

}
