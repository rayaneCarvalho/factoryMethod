package org.example;

public class PizzariaCentro implements IPizzaria{
    @Override
    public String pedido() {
        return "Pedido realizado";
    }

    @Override
    public String cancelar() {
        return "Pedido cancelado";
    }
}
