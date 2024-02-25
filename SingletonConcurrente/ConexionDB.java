package SingletonConcurrente;

public class ConexionDB {
    private static ConexionDB conexion;

    private ConexionDB() {
    }

    public synchronized static ConexionDB obtenerConexion() {
        if (conexion == null) {// No se ha instanciado
            conexion = new ConexionDB();
        }
        return conexion;
    }

}
