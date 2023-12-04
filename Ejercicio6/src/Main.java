import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 6
        El modelo de color RGB tiene tres componentes, la componente roja (R),
        la verde (G) y la azul (B).
        Genera un color aleatorio válido (solo pueden ir desde 0 hasta 255).
        Indica qué tipo de color es, dependiendo de la mayor de sus componentes.
        Ejemplo:
        Si generamos el color R = 200, G = 312 y B = 0, el color tendrá más valor
         de verde (G), por lo que diremos que se trata de un color “Verde”.
        Otro ejemplo sería: R = 200, G = 200, B = 200, en cuyo caso, todas las
        componentes son iguales, por lo que tendríamos un color “Gris”.
        (Solo en caso de que coincidan al menos 2 de las 3 componentes).
         */

        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);

        if((red == blue) || (red == green) || (green == blue)) {
            System.out.println("The color is Gris since we have : R = " + red + ", G = " + green + ", B = " + blue);
        } else {
            if((red > green) && (red > blue)) {
                System.out.println("The color is red since we have : R = " + red + ", G = " + green + ", B = " + blue);
            } else if((green > red) && (green > blue)) {
                System.out.println("The color is green since we have : R = " + red + ", G = " + green + ", B = " + blue);
            } else {
                System.out.println("The color is blue since we have : R = " + red + ", G = " + green + ", B = " + blue);
            }
        }
    }
}