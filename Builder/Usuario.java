package Builder;

public class Usuario {

    private String nombre;
    private String apellido;

    private String telefono;
    private String direccion;

    private Usuario(String nombre, String apellido) { // declararlo private
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = ""; // att opcional
        this.direccion = ""; // att opcional
    }
    // crear el metodo Make como static
    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }
    // crear el metodo de instancia Buid-> que retorna el Ususario final.
    public Usuario Build() {
        return this;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) { // cambiar void por Usuario
        this.telefono = telefono;
        return this; // retornar this
    }

    public String getDireccion() {
        return direccion;
    }

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this; // retornar this
    }

    // toString
    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
}
