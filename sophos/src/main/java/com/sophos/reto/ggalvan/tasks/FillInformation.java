package com.sophos.reto.ggalvan.tasks;

import com.sophos.reto.ggalvan.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FillInformation implements Task {
    public static FillInformation ofClient() {
        return Tasks.instrumented(FillInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("gabgh@gmail.com.co").into(HomePage.EMAIL_INPUT)
                , Click.on(HomePage.ACCEPT_BUTTON)
                , Click.on(HomePage.RECEIPT_STORE_OPTION)
                , WaitUntil.the(HomePage.SELECT_STORE, WebElementStateMatchers.isVisible())
                , Click.on(HomePage.SELECT_STORE)
                , Click.on(HomePage.STORE)
                , Click.on(HomePage.RECEIVE)
        );
    }
}
