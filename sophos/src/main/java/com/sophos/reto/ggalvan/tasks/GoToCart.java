package com.sophos.reto.ggalvan.tasks;

import com.sophos.reto.ggalvan.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCart implements Task {
    public static GoToCart shopping() {
        return Tasks.instrumented(GoToCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
        actor.attemptsTo(
                Click.on(HomePage.SHOW_CART_BUTTON)
        );

    }
}
