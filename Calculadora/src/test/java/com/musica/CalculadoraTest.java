package com.musica;
import org.junit.*;

class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void testMain() {
        Calculadora.main(new String[]{"args"});
    }

    @Test
    void testOperar() {
        int result = calculadora.operar("operador", 0, 0);
        Assertions.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please raise issues & feature requests at: https://weirddev.com/forum#!/testme