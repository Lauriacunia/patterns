package Builder2;

public class Main {
    public static void main(String[] args) {
        /*Usuario usuario = Usuario.Make("Juan", "Perez")
                                         .setTelefono("123456789")
                                         .setDireccion("Calle 123")
                                         .Build();
      YA NO SE PUEDE ACCEDER A LOS SETTERS SIN ANTES CHEQUEAR QUE EL USUARIO SEA FULL
                                         */
        Usuario usuario = Usuario.Make("Juan", "Perez")
                .setIsFullUser(true)
                .setTelefono("123456789")
                .setDireccion("Calle 123")
                .Build();

        System.out.println(usuario);
    }
}
