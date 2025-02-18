package Ejercicio3;

import java.io.IOException;

/**@author EstelaM
 * @version 1.0
 * En esta clase se crean los metodos que todas las clases deben seguir y sus constructores
 * @see Ejercicio3
 */
public class Rectangulo {

    int coordX1;
    int coordY1;
    int coordX2;
    int coordY2;

    /**
     * @param coordX1P es el valor entero que representa el punto x de la primer coordenada
     * @param coordY1P es el valor entero que representa el punto y de la primera coordenada
     * @param coordX2P es el valor entero que representa el punto x del la segunda coordenada
     * @param coordY2P es el valor entero que representa el punto y de la segunda coordenada
     * @since 1.0
     */
    public void crearCoordenadas(int coordX1P, int coordY1P, int coordX2P, int coordY2P)  {
        coordX1 = coordX1P;
        coordY1= coordY1P;
        coordX2= coordX2P;
        coordY2=coordY2P;
    }

    /**
     * este metodo sirve para mostrar las coordenadas montadas
     * @since 1.0
     */

    public void mostrarCoordenadas(){
        System.out.printf("(%d,%d) (%d,%d)", coordX1,coordY1,coordX2,coordY2);
    }

    /**
     *
     * @deprecated este metodo no esta en uso
     * @throws IOException
     */
    public int calcularPerimetro() throws IOException{
        int perimetro=0;

        int base = calcularBase();
        int altura =calcularAltura();

        perimetro = base*2 + altura*2;
        return perimetro;
    }

    /**
     *
     * @deprecated este metodo no esta en uso
     */
    public int calcularArea(){;
        return calcularBase() * calcularAltura();
    }

    /**
     * @return devuelve la base de el rectangulo que es un número entero
     * @since 1.0
     */
    private int calcularBase(){
        int base= coordX2-coordX1;
        //quito el signo negativo
        base = Math.abs(base);
        return base;
    }

    /**
     * @return devuelve un número entero que es la altura del rectangulo
     * @since 1.0
     */
    private int calcularAltura(){
        int altura =coordY2-coordY1;
        return Math.abs(altura); //meto ya en eel return el abs
    }
}
