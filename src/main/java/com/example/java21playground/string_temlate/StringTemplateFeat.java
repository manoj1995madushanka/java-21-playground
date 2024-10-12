package com.example.java21playground.string_temlate;

import static java.lang.StringTemplate.STR;
import static java.util.FormatProcessor.FMT;

/**
 * This feature provided as PREVIEW feature with java 21
 * */
public class StringTemplateFeat {

    public void stringTempFeature(){
        var product = new Product("11","Test",10.00);

        // concatenation using string.format
        // make sure to maintain right order
        var string1 = String.format("Product with id %s name %s and price $%.2f", product.id(),product.name(),product.price());

        var string2 = STR."Product with id \{ product.id() } name \{ product.name() } and price \{ product.price()}";

        var string3 = FMT."Product with id \{ product.id() } name \{ product.name() } and price \%.2f{ product.price()}";
    }
}
