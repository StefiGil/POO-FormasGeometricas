package formasgeometricas;

import java.awt.*; //Libreria

//Clase hija de Forma
public class Cuadrado extends Forma {

    //Atributo particular de Cuadrado agregado
    private int lado;

    //Contenedor heredado de Formas que incluye atributo nuevo (lado)
    public Cuadrado(int x, int y, Color color, int lado) {
        super(x, y, color);
        this.lado = lado;
    }

    // Métodos sobreescritos de la clase Forma adaptado de lo que hace Cuadrado
    @Override
    public void dibujar(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, lado, lado);
    }

    @Override
    public void redimensionar(boolean aumentar) {
        if (aumentar) {
            this.lado += 10;
        } else {
            this.lado = Math.max(0, this.lado - 10); // Disminuye el lado en 10, asegurando que no sea negativo
        }
    }

}
