package Builder;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = Usuario.Make("Juan", "Perez")
                                   .setTelefono("123456789")
                                   .setDireccion("Calle 123")
                                   .Build();
        System.out.println(usuario);
    }
}
