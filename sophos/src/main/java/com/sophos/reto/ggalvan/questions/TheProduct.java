package com.sophos.reto.ggalvan.questions;

import com.sophos.reto.ggalvan.models.Product;
import com.sophos.reto.ggalvan.userinterfaces.ShoppingCart;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Visibility;

public class TheProduct {
    private static Product product;

    public static Question<Boolean> isAddInCart() {

        return actor -> {
            product = actor.recall("product");
            Scroll.to(ShoppingCart.ITEM.of(product.getNameProduct())).performAs(actor);
            return Visibility.of(ShoppingCart.ITEM.of(product.getNameProduct())).viewedBy(actor).asBoolean();
        };
    }

    private TheProduct() {

    }
}
