import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 2
        Crea un if para comprobar si dos números son iguales,
        si el primer número es mayor que el segundo o el segundo es mayor
        ue el primero. Muestra un mensaje por pantalla para cada caso.
        Los números debes pasarlos por teclado
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int x = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int y = sc.nextInt();
        if( x == y ) {
            System.out.println("Both Numbers are equal to each other");
        } else {
            System.out.println("the number " + Math.max(x, y) + " is bigger than the number " + Math.min(x, y) );
        }
    }
}