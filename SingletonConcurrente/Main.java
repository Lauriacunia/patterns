package SingletonConcurrente;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion = ConexionDB.obtenerConexion();
                System.out.println("Conexion 1 - memoria: " + conexion.hashCode());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ConexionDB conexion2 = ConexionDB.obtenerConexion();
                System.out.println("Conexion 2 - memoria: " + conexion2.hashCode());
            }
        });
        System.out.println("Singleton concurrente");
        System.out.println("============================");
        System.out.println("Para que se respete el Patrón singleton al usar Threads se /n" +
                "utiliza la palabra reservada synchronized en el metodo se acceso a la instancia /n");
        t1.start();
        t2.start();
    }
}
