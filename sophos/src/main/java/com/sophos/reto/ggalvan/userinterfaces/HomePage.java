package com.sophos.reto.ggalvan.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target SEARCH_INPUT = Target.the("Search input").locatedBy("#search-autocomplete-input");
    public static final Target PRODUCT_ITEM = Target.the("product {0}").locatedBy("//div[contains(@data-name,'{0}')]");
    public static final Target NOTIFICATION_NO_BUTTON = Target.the("Not Thanks button").locatedBy("//button[text()" +
            "='No gracias']");
    public static final Target ADD_PRODUCT_BUTTON = Target.the("Add product {0}").locatedBy("//div[contains" +
            "(@data-name,'{0}')]//button[contains(@class,'product-add-to-cart')]");
    public static final Target QUANTITY_INPUT = Target.the("Quantity input").locatedBy("//div[contains(@data-name," +
            "'{0}')]//input[contains(@class,'product-quantity__input--hidden')]");
    public static final Target PLUS_BUTTON = Target.the("plus button").locatedBy("//div[contains(@data-name,'{0}')" +
            "]//button[contains(@class,'product-quantity__control--increase')]");
    public static final Target EMAIL_INPUT = Target.the("Email input").locatedBy("//div[@class='delivery__login" +
            "']//input[@id='delivery-email']");
    public static final Target ACCEPT_BUTTON = Target.the("Accept button").locatedBy("//button[text()='Aceptar']");
    public static final Target RECEIPT_STORE_OPTION = Target.the("receipt in store").locatedBy("//button//span[text()" +
            "='Recojo en Tienda']");
    public static final Target SELECT_STORE = Target.the("select").locatedBy("//div[@id='react-select-2--value']");
    public static final Target STORE = Target.the("strore Wong").locatedBy("//div[@class='Select-menu-outer']//div" +
            "[text()='Wong Óvalo Gutierrez']");
    public static final Target RECEIVE = Target.the("receive button").locatedBy("//button[@class='shipping" +
            "-preference__submit']");
    public static final Target SHOW_CART_BUTTON = Target.the("Show cart").locatedBy("(//span[text()='Ver carrito'])" +
            "[3]");

    private HomePage() {
    }

}
