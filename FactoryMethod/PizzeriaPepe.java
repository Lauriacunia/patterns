package FactoryMethod;

public class PizzeriaPepe implements IPizzeria{

    public Pizza crearPizza(String tipo) {
        if(tipo.equals("Peperoni")){
            return new Pizza(8, "Peperoni");
        }
        if(tipo.equals("Vegetariana")){
            return new Pizza(8, "Vegetariana");
        }
        if(tipo.equals("Peperoni borde relleno")){
            return new PizzaBordeRelleno(12, "Peperoni");
        }
        return null;

    }
}
