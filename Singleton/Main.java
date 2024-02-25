package Singleton;

public class Main {
    public static void main(String[] args) {
        ConexionDB conexion = ConexionDB.obtenerConexion();
        ConexionDB conexion2 = ConexionDB.obtenerConexion();

        System.out.println("Patrón Singleton");
        System.out.println("=============================");
        System.out.println("El patrón Singleton es un patrón de diseño creacional \n" +
                        "que garantiza que una clase tenga SOLO UNA INSTANCIA \n" +
                        "y proporciona un punto de acceso global a esa instancia.\n");
        System.out.println("La implementación del patrón Singleton generalmente implica \n" +
                        "la creación de un método estático que devuelve una instancia única de la clase.\n");
        System.out.println("Conexion 1 - memoria: " + conexion.hashCode());
        System.out.println("Conexion 2 - memoria: " + conexion2.hashCode());
    }
}
