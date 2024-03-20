package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzariaFactoryTest {

    @Test
    void deveRetornarExcecaoParaPizzariaInexistente() {
        try {
            IPizzaria pizzaria = PizzariaFactory.encontrarPizzaria("Bandeirantes");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pizzaria inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPizzariaFechada() {
        try {
            IPizzaria pizzaria = PizzariaFactory.encontrarPizzaria("Linhares");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pizzaria fechada", e.getMessage());
        }
    }

}