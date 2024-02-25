package SimpleFactory;

public class Pizza {
    private int cantidadDeRebanadas;

    public Pizza (int cantidadDeRebanadas) {
        this.cantidadDeRebanadas = cantidadDeRebanadas;
    }

    @Override
    public String toString() {
        return "Cantidad de rebanadas: " + this.cantidadDeRebanadas;
    }
}
