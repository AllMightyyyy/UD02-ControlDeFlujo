import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 4
        Tenemos dos variables, una representa nuestra posición en el eje x,
        otra nuestra posición en el eje y. Queremos que, dependiendo del valor
        de una variable llamada movimiento, nuestra posición cambie
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your X position : ");
        int x = sc.nextInt();
        System.out.println("Enter your Y position :");
        int y = sc.nextInt();
        sc.nextLine();

        while(true) {
            System.out.println("Enter a direction (U)p, (L)eft, (R)ight, (D)own, (Q)uit :");
            String inp = sc.nextLine();
            char input = inp.toUpperCase().charAt(0);

            switch(input) {
                case 'U' -> y += 1;
                case 'L' -> x -= 1;
                case 'R' -> x += 1;
                case 'D' -> y -= 1;
                case 'Q' -> {
                    System.out.println("Your final position is x : " + x + " and y : " + y);
                    System.exit(0);
                }
                default -> System.out.println("Invalid character");
            }
        }
    }
}