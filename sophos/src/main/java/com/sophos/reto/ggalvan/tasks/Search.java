package com.sophos.reto.ggalvan.tasks;

import com.sophos.reto.ggalvan.interactions.AddForProduct;
import com.sophos.reto.ggalvan.models.Product;
import com.sophos.reto.ggalvan.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.sophos.reto.ggalvan.userinterfaces.HomePage.SEARCH_INPUT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Search implements Task {
    private final Product product;

    public Search(List<Product> products) {
        this.product = products.get(0);
    }

    public static Search andAddThe(List<Product> product) {
        return Tasks.instrumented(Search.class, product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SEARCH_INPUT, isVisible()).forNoMoreThan(10).seconds()
                , Check.whether(WebElementQuestion.the(HomePage.NOTIFICATION_NO_BUTTON),
                        WebElementStateMatchers.isVisible()).andIfSo(
                        Click.on(HomePage.NOTIFICATION_NO_BUTTON)
                )
                , Enter.theValue(product.getNameProduct()).into(SEARCH_INPUT)
                ,
                WaitUntil.the(HomePage.PRODUCT_ITEM.of(product.getNameProduct()), isVisible()).forNoMoreThan(12).seconds()
                , AddForProduct.theQuantity(product.getQuantity()).of(product.getNameProduct())
                , Click.on(HomePage.ADD_PRODUCT_BUTTON.of(product.getNameProduct()))

        );
        actor.remember("product", product);
    }
}
