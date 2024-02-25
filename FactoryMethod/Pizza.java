package FactoryMethod;

public class Pizza {
    private int cantidadDeRebanadas;
    private String especialidad;

    public Pizza (int cantidadDeRebanadas, String especialidad) {
        this.cantidadDeRebanadas = cantidadDeRebanadas;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Cantidad de rebanadas: " + this.cantidadDeRebanadas +
                " Especialidad: " + this.especialidad ;
    }
}
