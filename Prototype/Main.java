package Prototype;

public class Main {
    public static void main(String[] args) {
     Enemigo enemigoBase = new Enemigo("enemigo1.png", 100, 0, 0);
        // creo clones del objeto original
        Enemigo enemigoClon1 = new Enemigo(enemigoBase);
        Enemigo enemigoClon2 = new Enemigo(enemigoBase);
        Enemigo enemigoClon3 = new Enemigo(enemigoBase);
        // puedo hacer modificaciones en los clones sin afectar al objeto original
        enemigoClon1.setPosX(10);
        enemigoClon2.setPosX(20);
        enemigoClon3.setPosX(30);

        // otra forma es con el metodo clone
        Enemigo enemigoClon4 = enemigoBase.clone();
        enemigoClon4.setPosX(40);
        // print all
        System.out.println("enemigoBase: " + enemigoBase.getPosX());
        System.out.println("enemigoClon1: " + enemigoClon1.getPosX());
        System.out.println("enemigoClon2: " + enemigoClon2.getPosX());
        System.out.println("enemigoClon3: " + enemigoClon3.getPosX());
        System.out.println("enemigoClon4: " + enemigoClon4.getPosX());
    }
}
