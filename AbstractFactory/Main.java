package AbstractFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("\uD83D\uDEE0\uFE0F Abstract Factory Pattern");
        System.out.println("===============================================");
        System.out.println("El patrón Abstract Factory es un patrón de diseño creacional que proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.\n" +
                "Se utiliza cuando un sistema debe ser independiente de cómo se crean, compuestos o representados los productos que maneja.\n" +
                "La implementación del patrón Abstract Factory generalmente implica la creación de una interfaz o clase abstracta que declara métodos para crear cada tipo de producto en una familia.\n" +
                "Luego, se crean una o más implementaciones concretas de esta interfaz o clase abstracta, cada una de las cuales crea una familia específica de productos.\n" +
                "Finalmente, se utiliza un objeto de la implementación concreta para crear instancias de los productos de esa familia.");


        AppleStoreFactory appleStoreFactory = new AppleStoreFactory();
        IComputadora macbook = appleStoreFactory.crearComputadora();
        ITablet ipad = appleStoreFactory.crearTablet();

        SamsungStoreFactory samsungStoreFactory = new SamsungStoreFactory();
        IComputadora galaxyBook = samsungStoreFactory.crearComputadora();
        ITablet galaxyTab = samsungStoreFactory.crearTablet();
    }

}
