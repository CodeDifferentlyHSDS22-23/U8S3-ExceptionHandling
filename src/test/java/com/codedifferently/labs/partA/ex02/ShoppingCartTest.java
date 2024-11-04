package com.codedifferently.labs.partA.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.Exception;
import partA.ex02.ShoppingCart;

public class ShoppingCartTest {
    @Test
    public void ShoppingCartTest01(){
        String expected = "Add Result: 122\n" +
                "java.lang.ArithmeticException: / by zero";
        String actual = ShoppingCart.calc();
        Assertions.assertEquals(expected, actual);
    }
}
