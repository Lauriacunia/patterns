package Prototype;

public class Enemigo {
    private String imagen;
    private int vida;
    private int posX;
    private int posY;

    public Enemigo(String imagen, int vida, int posX, int posY) {
        this.imagen = imagen;
        this.vida = vida;
        this.posX = posX;
        this.posY = posY;
    }

    // Prototype a partir de un constructor
    // este metodo crea un nuevo objeto con los mismos valores que el objeto original que recibe como parametro
    public Enemigo(Enemigo enemigo) {
        this.setImagen(enemigo.getImagen());
        this.setVida(enemigo.getVida());
        this.setPosX(enemigo.getPosX());
        this.setPosY(enemigo.getPosY());
    }

    // otra forma es a partir de un metodo (mas sintetico)
    public Enemigo clone() {
        return new Enemigo(this);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }


}
