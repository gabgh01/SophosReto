package com.sophos.reto.ggalvan.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCart {
    public static final Target ITEM = Target.the("product {0}").locatedBy("//div[@class='product-item__info']//a" +
            "[contains(@title,'{0}')]");

    private ShoppingCart() {
    }
}
