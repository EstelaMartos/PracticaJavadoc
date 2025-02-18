package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * se crea el primer rectangulo con un constructor por parametros
         */
        Rectangulo rect1=new Rectangulo();//construido por parametros
        rect1.coordX1=0;
        rect1.coordY1=0;

        rect1.coordX2=5;
        rect1.coordY2=5;


        System.out.println("Primer rectangulo:");
        rect1.mostrarCoordenadas();

        System.out.println();
/**
 * se crea el segundo rectangulo con un constructor
 */
        Rectangulo rect2=new Rectangulo();
        rect2.crearCoordenadas(7,9,2,3);//construido con el contructor
/**
 * se muestran las coordenadas del segundo rectángulo
 */
        System.out.println("Segundo rectangulo:");
        rect2.mostrarCoordenadas();

    }
}
