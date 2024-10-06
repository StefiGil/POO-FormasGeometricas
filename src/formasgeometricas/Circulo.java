package formasgeometricas;

import java.awt.*;

//Clase hija de Forma, ademas implementa interfaz rodable
public class Circulo extends Forma implements Rodable {

    //Atributo particular de Circulo agregado
    private int radio;

    //Contenedor heredado de Formas que incluye atributo nuevo (radio)
    public Circulo(int x, int y, Color color, int radio) {
        super(x, y, color);
        this.radio = radio;
    }

    // Métodos sobreescritos de la clase Forma adaptado de lo que hace Circulo
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radio * 2, radio * 2);
    }

    @Override
    public void redimensionar(boolean aumentar) {
        if (aumentar) {
            this.radio += 5;
        } else {
            this.radio = Math.max(0, this.radio - 5); // Disminuye el radio en 5, asegurando que no sea negativo
        }
    }

    @Override
    public void rodar() {
        this.x += 20;
    }

}
