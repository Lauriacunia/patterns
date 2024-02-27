package Builder2;

public class Usuario {
    private String nombre;
    private String apellido;

    private boolean isFullUser; // att opcional

    private String telefono;
    private String direccion;

    private Usuario(String nombre, String apellido) { // declararlo private
        this.nombre = nombre;
        this.apellido = apellido;
        this.isFullUser = false; // att opcional
        this.telefono = ""; // att opcional
        this.direccion = ""; // att opcional
    }
    // crear el metodo Make como static
    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }


    // Getters y Setters
    public boolean isIsFullUser() {
        return isFullUser;
    }
    public BuilderUsuario setIsFullUser(boolean isFullUser) {
        if(!isFullUser) throw new IllegalArgumentException("No puede ser falso");
        this.isFullUser = isFullUser;
        return new BuilderUsuario(this);
    }
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

    public String getDireccion() {
        return direccion;
    }



    // toString
    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    public static class BuilderUsuario{
        private Usuario usuario;
        public BuilderUsuario(Usuario usuario){
            this.usuario = usuario;
        }

        public BuilderUsuario setTelefono(String telefono) { // cambiar void por Usuario
            usuario.telefono = telefono;
            return this; // retornar this
        }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this; // retornar this
        }
        // crear el metodo de instancia Buid-> que retorna el Ususario final.
        public Usuario Build() {
            return usuario;
        }
    }
}
