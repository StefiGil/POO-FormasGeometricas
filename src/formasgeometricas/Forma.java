import java.awt.*;

abstract class Forma {
    protected int x, y, velocidadY;
    protected Color color;

    public Forma() {
    }

    public Forma(int x, int y, int velocidadY, Color color) {
        this.x = x;
        this.y = y;
        this.velocidadY = velocidadY;
        this.color = color;
    }

    public abstract void dibujar(Graphics g);

    public abstract void redimensionar();
}