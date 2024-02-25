package FactoryMethod;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
      PizzeriaPepe pizzeriaPepe = new PizzeriaPepe();
      Pizza peperoni = pizzeriaPepe.crearPizza("Peperoni");
      Pizza vegetariana = pizzeriaPepe.crearPizza(("Vegetariana"));
        System.out.println(peperoni);
        System.out.println(vegetariana);
    }
}
