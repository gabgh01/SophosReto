package com.sophos.reto.ggalvan.interactions;

import com.sophos.reto.ggalvan.userinterfaces.HomePage;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddForProduct implements Interaction {
    private String nameProduct;
    private String quantity;

    public AddForProduct(String quantity) {
        this.quantity = quantity;
    }

    public static AddForProduct theQuantity(String quantity) {
        return Tasks.instrumented(AddForProduct.class, quantity);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int cant = Integer.parseInt(this.quantity);
        new InternalSystemClock().pauseFor(1000);
        for (int i = 1; i < cant; i++) {
            actor.attemptsTo(
                    Click.on(HomePage.PLUS_BUTTON.of(nameProduct))
            );
        }
    }

    public AddForProduct of(String nameProduct) {
        this.nameProduct = nameProduct;
        return this;
    }
}
