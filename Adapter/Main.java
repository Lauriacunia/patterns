package Adapter;

public class Main {

	public static void main(String[] args) {
       // IConexionSQL conexion = new AdaptadorDB( new ConexionMySQL() );
        // si queremos cambiar la conexion a mongoDB solo cambiamos la clase a la que apunta el adaptador
        // el cliente no se entera de nada, piensa que sigue trabajando con SQL
		IConexionSQL conexion = new AdaptadorDB( new ConexionMongoDB() );

		conexion.conexion();

		String resultado = conexion.runQuery();
		System.out.println(resultado);

	}

}
