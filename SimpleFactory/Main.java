package SimpleFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Factory");
        System.out.println("================================");
        System.out.println("La factory Pizzeria se encarga de controlar la creación de objetos complejos");
        Pizzeria pizzeriaElTano = new Pizzeria();
        Pizza pizzaNapolitana = pizzeriaElTano.crearPizzaChica();
        System.out.println(pizzaNapolitana);
    }

}
