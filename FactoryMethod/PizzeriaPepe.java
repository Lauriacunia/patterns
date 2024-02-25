package FactoryMethod;

public class PizzeriaPepe implements IPizzeria{

    public Pizza crearPizza(String tipo) {
        if(tipo.equals("Peperoni")){
            return new Pizza(8, "Peperoni");
        }
        if(tipo.equals("Vegetariana")){
            return new Pizza(8, "Vegetariana");
        }
        return null;

    }
}
