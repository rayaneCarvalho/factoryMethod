package org.example;

public class PizzariaBenfica implements IPizzaria{

    @Override
    public String pedido() {
        return "Pedido realizado";
    }

    @Override
    public String cancelar() {
        return "Pedido cancelado";
    }
}
