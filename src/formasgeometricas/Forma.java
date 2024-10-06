//Clase madre de Cuadrado y Circulo, u cualquier otra forma que sea agregada
//y contenga estos metodos y atributos en comun.

package formasgeometricas;

import java.awt.*;

abstract class Forma {

    //Atributos
    protected int x, y;
    protected Color color;

    //Contenedor
    public Forma(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //Metodos
    public abstract void dibujar(Graphics g);

    public abstract void redimensionar(boolean aumentar);

}

