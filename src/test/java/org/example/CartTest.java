package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CartTest {

    @Test
    void addIphoneProToCart() {
        Product iphonePro = new Product("iphonePro");
        Cart cart = new Cart();
        cart.add(iphonePro);
        String actual = cart.getProductList().get(0).getName();
        assertEquals("iphonePro", actual);
        assertEquals(1,cart.getProductList().size());
    }

    @Test
    void addHeroInkPenToCart() {
        Product iphonePro = new Product("HeroInkPen");
        Cart cart = new Cart();
        cart.add(iphonePro);
        String actual = cart.getProductList().get(0).getName();
        assertEquals("HeroInkPen", actual);
        assertEquals(1,cart.getProductList().size());
    }
}