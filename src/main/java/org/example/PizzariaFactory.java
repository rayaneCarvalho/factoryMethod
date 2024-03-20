package org.example;

public class PizzariaFactory {
    public static IPizzaria encontrarPizzaria(String pizzaria) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Pizzaria" + pizzaria);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Pizzaria inexistente");
        }
        if (!(objeto instanceof IPizzaria)) {
            throw new IllegalArgumentException("Pizzaria fechada");
        }
        return (IPizzaria) objeto;
    }
}
