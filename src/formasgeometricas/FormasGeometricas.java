// Esta es la clase principal del programa, donde se crean y gestionan los objetos de tipo forma.
// Los atributos de cada objeto se reflejan en la interfaz gráfica.
// Y mediante los botones disponibles se pueden aplicar los métodos disponibles,
// como dibujar, redimensionar las formas, y rodar a la forma circulo.

// Además, las librerías utilizadas fueron AWT, que se encargó de manejar los eventos de acción
// de los botones, y Swing, que se utilizó para crear la ventana principal,
// los componentes de la interfaz, como los botones y el panel de dibujo donde
// se muestran las formas.

package formasgeometricas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormasGeometricas extends JPanel {

    private Forma formaSeleccionada;

//Dibuja la forma
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (formaSeleccionada != null) {
            formaSeleccionada.dibujar(g);
        }
    }

    // Este es un contenedor de interfaz gráfica particular, ya que contiene múltiples componentes,
    // gestiona eventos y lógica de visualización.
    public FormasGeometricas() {

        //Para distribucion de componentes
        setLayout(new BorderLayout());

        JButton btnCuadrado = new JButton("Dibujar Cuadrado");
        JButton btnCirculo = new JButton("Dibujar Círculo");
        JButton btnRodar = new JButton("Rodar");
        JButton btnAumentar = new JButton("Aumentar");
        JButton btnDisminuir = new JButton("Disminuir");

        //Para añadir botones al panel
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnCuadrado);
        panelBotones.add(btnCirculo);

        panelBotones.add(btnAumentar);
        panelBotones.add(btnDisminuir);
        panelBotones.add(btnRodar);
        btnAumentar.setVisible(false);
        btnDisminuir.setVisible(false);
        btnRodar.setVisible(false);

        add(panelBotones, BorderLayout.SOUTH);

        // ActionListener para dibujar un cuadrado
        btnCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formaSeleccionada = new Cuadrado(50, 50, Color.BLUE, 100);
                btnAumentar.setVisible(true);
                btnDisminuir.setVisible(true);
                btnRodar.setVisible(false);
                repaint();
            }
        });

        // ActionListener para dibujar un círculo
        btnCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formaSeleccionada = new Circulo(50, 50, Color.green, 50);
                btnAumentar.setVisible(true);
                btnDisminuir.setVisible(true);
                btnRodar.setVisible(true);
                repaint();
            }
        });

    // ActionListener para rodar solo para circulo que implementa Rodable
        btnRodar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (formaSeleccionada instanceof Rodable) {
                    ((Rodable) formaSeleccionada).rodar();
                    repaint();
                }
            }
        });


    // ActionListener para aumentar
        btnAumentar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (formaSeleccionada != null) {
                    formaSeleccionada.redimensionar(true); // Aumentar tamaño
                    repaint();
                }
            }
        });

    // ActionListener para disminuir
        btnDisminuir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (formaSeleccionada != null) {
                    formaSeleccionada.redimensionar(false); // Disminuir tamaño
                    repaint();
                }
            }
        });
    }


    public static void main(String[] args) {

        JFrame frame = new JFrame("Formas Geométricas");
        FormasGeometricas panel = new FormasGeometricas();

        //Creacion de la ventana
        frame.add(panel);
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
