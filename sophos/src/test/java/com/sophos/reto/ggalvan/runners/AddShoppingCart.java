package com.sophos.reto.ggalvan.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_shopping_cart.feature",
        glue = "com.sophos.reto.ggalvan.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class AddShoppingCart {
}
