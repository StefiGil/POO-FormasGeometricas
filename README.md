# Practica POO de formas Geométricas

## Descripción del Proyecto
Este proyecto es una aplicación de escritorio en Java que permite crear y gestionar formas geométricas, como cuadrados y círculos, 
mediante una interfaz gráfica de usuario (GUI). La aplicación utiliza las librerías AWT y Swing para manejar eventos y crear componentes de la interfaz. 
El objetivo principal de este proyecto es implementar y aplicar los principios de la Programación Orientada a Objetos (POO).

## Características

- **Dibujo de Formas**: Los usuarios pueden seleccionar y dibujar cuadrados y círculos en la interfaz gráfica.
- **Redimensionar**: Las formas pueden ser aumentadas o disminuidas en tamaño.
- **Rotación**: Los círculos pueden ser rotados, implementando la interfaz `Rodable`.

## Principios de Programación Orientada a Objetos Aplicados

- **Encapsulamiento**: Cada forma (Cuadrado, Círculo) tiene sus propios atributos y métodos, asegurando que la implementación de una forma no afecte a las demás.
- **Herencia**: Las clases `Cuadrado` y `Circulo` heredan de una clase base `Forma`, reutilizando código y evitando duplicación.
- **Polimorfismo**: Las formas pueden ser manipuladas de manera uniforme a través de métodos comunes en la clase principal.
- **Interfaz**: Se utiliza la interfaz `Rodable` para definir un comportamiento que solo aplica a las formas que pueden rotar, en este caso un circulo
pero podria ser escalable a otras formas que rueden.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para el desarrollo de la aplicación.
- **AWT y Swing**: Librerías de Java para la creación de la interfaz gráfica.
- **IntelliJ IDEA**: IDE utilizado para el desarrollo del proyecto.

## Instalación

Sigue estos pasos para ejecutar el proyecto en tu máquina local:

1. Asegúrate de tener instalada la versión 17 de [Java JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
   
2. Clona este repositorio en tu máquina local ejecutando el siguiente comando en tu terminal:
   ```bash
   git clone https://github.com/tu_usuario/formasgeometricas.git

3. Navega al directorio del proyecto:
   cd PracticaPOOFormasGeometricas
   
5. Abre el proyecto en el IDE que utilices.

6. Asegúrate de que el IDE esté configurado para usar Java 17.

7. Compila y ejecuta el proyecto desde tu IDE.
