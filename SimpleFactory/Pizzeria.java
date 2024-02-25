package SimpleFactory;

public class Pizzeria {
    public Pizza crearPizzaChica(){
        // logica compleja que necesites implementar : consultar DB, validar etc.
        return new Pizza(6);
    }
    public Pizza crearPizzaMediana(){
        return new Pizza(8);
    }
    public Pizza crearPizzaGrande(){
        return new Pizza(12);
    }
}
